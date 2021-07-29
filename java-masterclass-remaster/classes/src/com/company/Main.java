package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

//        porsche.model = "Carrera"; only works if it is a public
        porsche.setModel("carrera");
        System.out.println("Model is  " + porsche.getModel());

    }
}
