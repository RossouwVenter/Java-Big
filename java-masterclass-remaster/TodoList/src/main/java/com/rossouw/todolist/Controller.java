package com.rossouw.todolist;

import com.rossouw.todolist.datamodel.TodoData;
import com.rossouw.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;
    @FXML
    private BorderPane mainBorderPane;

    public void initialize(){
//        TodoItem item1 = new TodoItem("Mail birthday card","Buy a 30th birthday card for Jhon",
//                LocalDate.of(2016, Month.APRIL,25));
//        TodoItem item2 = new TodoItem("Doctors Appointment","See Dr. Smith at 123 Main Street. Bring paperwork",
//                LocalDate.of(2016, Month.MAY,23));
//        TodoItem item3 = new TodoItem("Finish design","I promised Mike an email...",
//                LocalDate.of(2016, Month.APRIL,22));
//        TodoItem item4 = new TodoItem("Pickup Doug at Train station","He is arriving on march 23",
//                LocalDate.of(2016, Month.MARCH,23));
//        TodoItem item5= new TodoItem("Dry cleaning","Clothes should be ready by wednesday",
//                LocalDate.of(2016, Month.APRIL,20));
//
//        todoItems = new ArrayList<>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);



        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
               if(newValue != null){
                   TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                   itemDetailsTextArea.setText(item.getDetails());
                   DateTimeFormatter df = DateTimeFormatter.ofPattern( "MMMM d, yyyy"); // "d M yy");
                   deadlineLabel.setText(df.format(item.getDeadline()));
               }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void showNewItemDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));
        try{
//            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
//            dialog.getDialogPane().setContent(root);
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e){
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            DialogController controller = fxmlLoader.getController();
            controller.processResults();
            System.out.println("OK pressed");
        }else{
            System.out.println("Cancel pressed");
        }

    }

   @FXML
    public void handleClickListView(){
        TodoItem item =  todoListView.getSelectionModel().getSelectedItem();
//       System.out.println("The selected item is " + item);
       StringBuilder sb = new StringBuilder(item.getDetails());
       sb.append("\n\n\n\n");
       sb.append("Due: ");
       sb.append(item.getDeadline().toString());
       itemDetailsTextArea.setText(sb.toString());


    }
}