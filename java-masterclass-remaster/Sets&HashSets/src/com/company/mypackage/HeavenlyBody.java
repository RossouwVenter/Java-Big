package com.company.mypackage;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitualPeriod;
    private final Set<HeavenlyBody> satelltes;

    public HeavenlyBody(String name, double orbitualPeriod) {
        this.name = name;
        this.orbitualPeriod = orbitualPeriod;
        this.satelltes = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitualPeriod() {
        return orbitualPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satelltes.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satelltes);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null || (obj.getClass() != this.getClass())){
            return  false;
        }

        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called");
        return this.name.hashCode() + 57;
    }
}
