package com.company.mypackage;

public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicOne = " + publicVar + ": privateVar = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo(){
        int varTwo = 2;
        for(int i =0;i<10;i++){
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer clas: " + var1);
    }

    public class InnerClass{
        private int var3 = 3;

        public InnerClass(int privateVar) {
            this.var3 = privateVar;
        }

        public InnerClass(){
            System.out.println("Inner class created,privateVar is " + var3);
        }

        public void timesTwo(){
            ScopeCheck.this.timesTwo();
//            int privateVar = 2;
            for(int i =0;i<10;i++){
                System.out.println(i + " times two is " + i * var3);
            }
        }

    }
}
