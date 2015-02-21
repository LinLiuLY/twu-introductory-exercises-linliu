package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class PrimeFactors {
    int number;

    public PrimeFactors(int number) {
        this.number = number;
    }

    public void generate() {
        System.out.print("numbers:");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(Integer.toString(i) + ",");
            }
        }
    }

    public Boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
