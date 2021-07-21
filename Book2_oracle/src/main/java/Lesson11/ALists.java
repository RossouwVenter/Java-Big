/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.util.ArrayList;

/**
 *
 * @author rosso
 */
public class ALists {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(1, "Bob");

        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Bob");

        System.out.println(names);
    }

}
