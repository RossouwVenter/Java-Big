package com.company;

import java.util.List;

interface HenHouse {
    java.util.List<Chicken> getChickens();
}

class Chicken {}

public class ChickenSong {

    public static void main(String[] args) {
        Chicken x = new Chicken();
        HenHouse house = new HenHouse() {

            @Override
            public List<Chicken> getChickens() {
                List<Chicken> o = List.of(x);
                return o;
            }
        };
        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size();
             chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }

    Chicken x;
}