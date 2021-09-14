package com.company.mypackage;


//Navigator with James
//Driver Muhammed
public class Series {

    public static long nSum(int n) {
        return (n * (n + 1)) /2;
    }

    public static long factorial(int n) {
        if(n == 0) {
            return 0;
        }
        long f = 1;
        for (int i=1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static long fib(int n) {
        if(n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fibNum = 0;

        for (int i = 1; i<n; i++) {
            fibNum = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fibNum;
        }
        return fibNum;
    }

}
