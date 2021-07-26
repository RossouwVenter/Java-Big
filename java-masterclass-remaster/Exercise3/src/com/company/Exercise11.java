package com.company;

public class Exercise11 {
    public static void main(String[] args) {
        boolean playing = isCatPlaying(false,2);
        System.out.println(playing);
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        if (summer){
            if (temperature >= 25 && temperature <= 45){
                return true;
            }else{
                return false;
            }
        } else if (temperature >= 25 && temperature <= 35){
            return true;
        }else {
            return false;
        }
    }
}
