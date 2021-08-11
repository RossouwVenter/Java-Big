package com.company;

public class Exercise33 {
    private double width;
    private double length;

    public Exercise33(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            this.width = 0;
        }

        if (length < 0) {
            this.length = 0;
        }
    }

    public double getArea() {
        return ((this.width) * (this.length));
    }


}


