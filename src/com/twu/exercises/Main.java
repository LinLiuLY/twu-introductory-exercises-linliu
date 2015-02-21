package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class Main {
    public static void main(String[] args) {
        drawTriangles();
    }

    public static void drawTriangles() {
        int[] inputs = {1, 8, 3, 3};
        String[] types = {"horizontal", "horizontal", "vertical", "rightTriangle"};
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Draw a " + types[i] + " triangle");
            Triangle triangle = new Triangle(inputs[i], types[i]);
            triangle.drawTriangle();
            System.out.println();
        }
    }


}


