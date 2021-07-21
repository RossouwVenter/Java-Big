package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore();

        if (gameOver) {
            score = 20000;
            levelCompleted = 8;
            bonus = 200;
            System.out.println("Score: " + score + "\nLevelCompleted: " + levelCompleted +
                    "\nBonus: " + bonus + "\nFinal Score: " + (score + levelCompleted + bonus));
        }

    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }


}
