package com.company;

public class Exercise19 {

    public static boolean hasSameLastDigit(int parameterOne,int parameterTwo,int parameterThree){

        if ((parameterOne <= 10 || parameterOne >= 1000) && (parameterTwo <= 10 || parameterTwo >= 1000)
                && (parameterThree <= 10 || parameterThree >= 1000)) {
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
