package io.michaelcane;

public class Game {

    // The Player's previous guess
    private int previous = 1000;
    // The count for guesses, will not increment if guesses are consecutively the same
    private int counter = 0;
    // The secret number
    private int secret = 5;

    public int getCounter() {
        return counter;
    }

    public int getPrevious() {
        return previous;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    Player player = new Player();

    /**
     *
     */
    public void startGame() {
        while (previous != secret) {
            player.takeInput();
            counterCheck();
            counterIncrement();
            checkerLow();
            checkerHigh();
            checkerEqual();
            statement();
        }
    }

    /**
     *Checks if the Guess is equal or not
     * to the Previous Guess
     */
    public Boolean counterCheck() {
        return (player.getGuess() != previous);
    }

    /**
     * Increments the counter if the counterCheck() is false
     */
    public void counterIncrement() {
        if (!counterCheck()) {
            return;
        } else {
            counter++;
        }
    }
    /**
     * Checks if the Guess is too low
     * when compared to Secret
     * @return
     */
    public Boolean checkerLow() {
        return (player.getGuess() < secret);
    }
    /**
     * Checks if the Guess is too high
     * when compred to Secret
     * @return
     */
    public Boolean checkerHigh() {
        return (player.getGuess() > secret);
    }
    /**
     * Checks if the Guess is Equal to Secret
     * @return
     */
    public Boolean checkerEqual() {
        return (player.getGuess() == secret);
    }
    /**
     * Prints out the statement of how correct the answer is.
     */
    public void statement() {
        if (checkerEqual()) {
            System.out.println("You did it! Got it in " + counter + "!");
        }
        if (checkerHigh()) {
            System.out.println("Nope, too high, try again.");
            previous = player.getGuess();
        }
        if (checkerLow()) {
            System.out.println("Nope, too low, try again.");
            previous = player.getGuess();
        }
    }
}
