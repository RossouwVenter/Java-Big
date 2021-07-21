/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Examples;

/**
 *
 * @author rosso
 */
public class Class_examples {
    public static void main(String[] args) {
//        String[] names = {"Bob", "Jack","Kira"};
//                for (String name : names){
//                    System.out.println("My name is: " + name);
//                }
                
//        int[] numbers = {1,2,3,4};
//        for (int number: numbers){
//            System.out.println(number);
//        }
//    int[] sizes = {4, 18, 5, 20 };
//    for (int size : sizes) {
//        if (size>16) {break;}
//        System.out.println("Size: " + size + ",");
//    }
//    
//    }
    
    String phoneNum = "404-543-2345";
    int idx1 = phoneNum.indexOf("-");
    System.out.println("Index of the first dash " + idx1);
                    
    int ID = 6;
    int newID = ++ ID;
        System.out.println("NewID Preincrement: " + newID);
    int newID2 = ID++;
        System.out.println("NewID Preincrement: " + newID2);
}
}
