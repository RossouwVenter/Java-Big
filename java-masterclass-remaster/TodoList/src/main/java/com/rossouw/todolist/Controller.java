package com.rossouw.todolist;

import com.rossouw.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card","Buy a 30th birthday card for Jhon",
                LocalDate.of(2016, Month.APRIL,25));
        TodoItem item2 = new TodoItem("Doctors Appointment","See Dr. Smith at 123 Main Street. Bring paperwork",
                LocalDate.of(2016, Month.MAY,23));
        TodoItem item3 = new TodoItem("Finish design","I promised Mike an email...",
                LocalDate.of(2016, Month.APRIL,22));
        TodoItem item4 = new TodoItem("Pickup Doug at Train station","He is arriving on march 23",
                LocalDate.of(2016, Month.MARCH,23));
        TodoItem item5= new TodoItem("Dry cleaning","Clothes should be ready by wednesday",
                LocalDate.of(2016, Month.APRIL,20));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem odlValue, TodoItem newValue) {
               if(newValue != null){
                   TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                   itemDetailsTextArea.setText(item.getDetails());
                   DateTimeFormatter df = DateTimeFormatter.ofPattern( "MMMM d, yyyy"); // "d M yy");
                   deadlineLabel.setText(df.format(item.getDeadline()));
               }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
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