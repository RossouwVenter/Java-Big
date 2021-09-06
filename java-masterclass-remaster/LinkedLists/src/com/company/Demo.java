package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> LinkedList){
        Iterator<String> i = LinkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
         int comparison = stringListIterator.next().compareTo(newCity);
         if (comparison == 0){
//             Equal, do not add
             System.out.println(newCity + " is already included as a destination");
             return false;
         } else if ( comparison > 0){
//             New City should appear before this one
//              Brisbane -> Adelaide
             stringListIterator.previous();
             stringListIterator.add(newCity);
             return true;
         }else if(comparison <0){
//             Move on to next city

         }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String>
    }
}
