package com.company;

public class Main {

    public static void main(String[] args) {

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob",score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("Jhon",score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("Ted",score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Hannah",score);
    }

    public static void displayHighScorePosition(String name,int score){
        System.out.println(name + " managed to get into position as a " + score + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500){
            return 2;
        }else if (score >= 100){
            return 3;
        }

        return 4;
    }
}
