package com.company.Challenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

//        String stringData  = "Darwin brisbane perth melbourne Canberra Adelaide Sydney Cenberra";

        String stringData = " 5 7 9 3 0 5 ";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
