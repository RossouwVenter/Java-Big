package com.company;

public class Exercise35_Cylinder  extends  Exercise35_Circle{
    private double height;

    public Exercise35_Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

        if (height < 0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * getHeight();
    }
}
