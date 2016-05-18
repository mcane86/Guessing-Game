package io.michaelcane;

import java.util.Scanner;

public class Player {

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    Scanner input = new Scanner(System.in);
    /**
     * This int will hold the guess the Player makes
     */
    private static int guess = 0;

    /**
     * The method used to obtain the guess
     */
    public void takeInput() {
        System.out.println("Give me a number between 1 and 10.");
        guess = input.nextInt();
    }

}
