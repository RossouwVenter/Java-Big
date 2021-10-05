package com.rossouw.todolist;

import com.rossouw.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

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
    }
}