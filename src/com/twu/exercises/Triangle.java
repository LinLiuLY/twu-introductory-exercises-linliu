package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class Triangle {
    private int number;
    private String type;

    public Triangle(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public void drawTriangle() {
        if (type == "rightTriangle") {
            drawRightTriangle();
        } else {
            printLine(number, type);
        }

    }

    private void drawRightTriangle() {
        for (int i = 1; i <= number; i++) {
            printLine(i, "horizontal");
            System.out.println();
        }
    }

    public void printLine(int number, String type) {
        for (int i = 0; i < number; i++) {
            if (type == "horizontal") {
                System.out.print("*");
            } else {
                System.out.println("*");
            }
        }
    }

}
