/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author rosso
 */
public interface Returnable {
    public String Returnable();
    String[] names = {"Sam", "James","Rossouw","Jaco","Kyle","Simbhongile"};
    List<String> myList = Arrays.asList(names);
//    ArrayList<String> myArrayList = new ArrayList(myList);
//    System.out.println(myArrayList.get(1));
    myList.replaceAll(s -> s.toUppercase());
    
    System.out.println("myList.replaceAll lambda: " + myList);
            
    
}
