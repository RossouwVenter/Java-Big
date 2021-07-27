package com.company;

public class Exercise19 {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1,1,2));
    }

    public static boolean hasSameLastDigit(int parameterOne,int parameterTwo,int parameterThree){

        if (isValid(parameterOne) && (isValid(parameterTwo)) && (isValid(parameterThree))) {
            int lastDigitFirst = parameterOne % 10;
            int lastDigitSecond = parameterTwo % 10;
            int lastDigitThird = parameterThree % 10;

            if ((lastDigitFirst == lastDigitSecond) || (lastDigitFirst == lastDigitThird) || (lastDigitSecond == lastDigitThird)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static boolean isValid(int parameter){
        if(parameter >= 10 && parameter <= 1000){
            return true;
        }else {
            return false;
        }
    }

}
