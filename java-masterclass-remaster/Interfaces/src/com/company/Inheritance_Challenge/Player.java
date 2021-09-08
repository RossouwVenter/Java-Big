package com.company.Inheritance_Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() >0){
        this.name = savedValues.get(0);
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);

    }
    }

    @Override
    public java.util.List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,this.weapon);

        return values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }



}
