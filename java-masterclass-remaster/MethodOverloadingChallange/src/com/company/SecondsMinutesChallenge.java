package com.company;

public class SecondsMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
//    constants are in caps

    public static void main(String[] args) {


        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int minutes,int seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }

            String minuteString = remainingMinutes + "m";
            if (remainingMinutes < 10){
                minuteString = "0" + minuteString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minuteString + " " + secondsString;
        }
    }

    private static String getDurationString(int seconds){
        if( seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }else{
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

//            System.out.println(minutes + " equal to " + seconds + " with " + remainingSeconds + "seconds remaining");
            return getDurationString(minutes,remainingSeconds);

        }
    }

}
