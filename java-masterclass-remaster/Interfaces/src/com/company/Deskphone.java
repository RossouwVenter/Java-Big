package com.company;

public class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken, desk phone does noy have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskPhone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
