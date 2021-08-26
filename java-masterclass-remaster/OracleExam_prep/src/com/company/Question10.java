package com.company;

import java.util.*;

public class Question10 {

    class Grasshopper {
        Grasshopper(String n) {
            name = n;
        }

        public static void main(String[] args) {
            Grasshopper one = new Grasshopper("g1");
            Grasshopper two = new Grasshopper("g2");
            one = two;
            two = null;
            one = null;
        }

        private String name;
    }
}
