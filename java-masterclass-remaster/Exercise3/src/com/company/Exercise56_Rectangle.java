package com.company;

public class Exercise56_Rectangle {
    public double width;
    public double length;

    public Exercise56_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0){
            this.width = 0;
        }
        if (length < 0){
            this.length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return (width * length);
    }
}
