package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new Deskphone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
