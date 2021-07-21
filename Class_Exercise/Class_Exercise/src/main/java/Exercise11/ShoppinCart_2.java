/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise11;

/**
 *
 * @author rosso
 */
public class ShoppinCart_2 {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	// Print an error message if fewer than 2 args are passed in.
        if (args.length< 2){
            System.out.println("Fewer than 2 has been passed in.");
        }else{
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println("Name = " + name + ", Age = " + age);
        }
        
    }
}
