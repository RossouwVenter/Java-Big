package com.company;

public class Exercise31 {
    private double width;
    private double height;

    public Exercise31() {

    }

    public Exercise31(double width, double height) {

        if (width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width) {
        this.width = width;

        if (width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height) {
        this.height = height;

        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        double area = this.width * this.height;
        return area;
    }
}
