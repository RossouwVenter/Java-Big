package com.company;

public class Main {

    public static void main(String[] args) {
	 Dog dog = new Dog("Yorkie");
	 dog.breathe();
	 dog.eat();

	 Parrot bird = new Parrot("Australian ring neck");
	 bird.breathe();
	 bird.eat();
	 bird.fly();

	 Penguin penguin = new Penguin("Penguin");
	 penguin.fly();
    }
}
