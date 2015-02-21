package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public void drawWords() {
        for (int i = 1; i <= number; i++) printWord(i);
    }

    public void printWord(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(Integer.toString(number));
        }
    }
}
