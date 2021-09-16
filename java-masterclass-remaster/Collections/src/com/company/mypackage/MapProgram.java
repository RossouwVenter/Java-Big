package com.company.mypackage;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
//        Map<String, String> languages = new HashMap<>();
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java", "This course is about Java");
            System.out.println("Java added successfully");
        }

        languages.put("Java","a compiled high level,...");
        languages.put("Python","an interpreted,...");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","Therein lies madness"));


        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java", "This course is about Java");
        }
//        System.out.println(languages.get("Java"));
//        languages.put("Java", "this course about java");
//        System.out.println(languages.get("Java"));

        System.out.println("=======================================");

//         Ways to remove in map

//        languages.remove("Lisp");

        if(languages.remove("Algol","an algorithmic languages")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if (languages.replace("Lisp","This will not work","a functional programming language with imperial features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
