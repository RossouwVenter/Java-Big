package com.company;

 class Deer {

    public static void main(String[] args) {
        Deer deer = new Question8(5);
        System.out.println("," + deer.hasHorns());
    }
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }
}

