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
}
