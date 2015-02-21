package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class Main {
    public static void main(String[] args) {
        drawTriangles();
        drawDiamonds();
        drawFizzBuzz();
        drawPrimeFactors();
    }

    public static void drawTriangles() {
        int[] inputs = {1, 8, 3, 3};
        String[] types = {"horizontal", "horizontal", "vertical", "rightTriangle"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Draw a " + types[i] + " triangle:");
            Triangle triangle = new Triangle(inputs[i], types[i]);
            triangle.drawTriangle();
            System.out.println();
        }
    }

    public static void drawDiamonds() {
        int height = 3;
        String[] types = {"isoscelesTriangle", "diamond", "diamondWithName"};
        for (int i = 0; i < types.length; i++) {
            System.out.println("Draw a " + types[i] + ":");
            Diamond diamond = new Diamond(height, types[i]);
            diamond.drawDiamond();
            System.out.println();
        }
    }

    public static void drawFizzBuzz() {
        System.out.println("Draw FizzBuzz:");
        int number = 100;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        fizzBuzz.drawWords();
        System.out.println();
    }

    public static void drawPrimeFactors() {
        System.out.println("Print Prime Factors:");
        int number = 30;
        PrimeFactors primeFactors = new PrimeFactors(number);
        primeFactors.generate();
    }
}


