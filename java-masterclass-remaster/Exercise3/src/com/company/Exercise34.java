package com.company;

public class Exercise34 {
    private double real;
    private double imaginary;

    public Exercise34(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add( double real,double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(Exercise34 complexNumber){
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    public void subtract(double real,double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(Exercise34 complexNumber){
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }
}
