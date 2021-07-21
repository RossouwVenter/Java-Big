package com.company;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 4000;
	int levelCompleted = 5;
	int bonus = 100;

//	if (score < 5000 && score > 1000) {
//        System.out.println("Your score is less than 5000 but greater than 1000");
//    }else if(score <1000){
//			System.out.println("Score is less than 1000");
//	}else{
//			System.out.println("Got here");
//		}

		if (gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		if (gameOver){
			score = 10000;
			levelCompleted = 8;
			bonus = 200;
			System.out.println("Score: " + score + "\nLevelCompleted: " + levelCompleted +
					"\nBonus: " + bonus + "\nFinal Score: " + (score+levelCompleted+bonus));
		}
    }
}
