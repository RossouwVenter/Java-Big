package com.company;

public class Egret {

        private String color;

        public Egret() {
//            this("white");
            this.color = "Orange";
        }

        public Egret(String color) {
            this.color = color;
//            this.color = "White";
        }

        public static void main(String[] args) {
            Egret e = new Egret();
            System.out.println("Color:" + e.color);
        }

}
