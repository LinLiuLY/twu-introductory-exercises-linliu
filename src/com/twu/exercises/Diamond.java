package com.twu.exercises;

/**
 * Created by linliu on 2/21/15.
 */
public class Diamond {
    int height;
    String type;

    public Diamond(int height, String type) {
        this.height = height;
        this.type = type;
    }

    public void drawDiamond() {
        if (type == "isoscelesTriangle") {
            drawTopTriangle(1, height - 1, height);
        } else if (type == "diamond") {
            drawTopTriangle(1, height - 1, height);
            drawBottomTriangle(2 * (height - 2) + 1, 1, height);
        } else {
            drawTopTriangle(1, height - 1, height - 1);
            System.out.println("linliu");
            drawBottomTriangle(2 * (height - 2) + 1, 1, height);
        }
    }

    public void drawTopTriangle(int starCount, int spaceCount, int height) {
        for (int row = 1; row <= height; row++) {
            drawSpace(spaceCount);
            drawStar(starCount);
            starCount += 2;
            spaceCount--;
            System.out.println();
        }
    }

    public void drawBottomTriangle(int starCount, int spaceCount, int height) {
        for (int row = 1; row <= height; row++) {
            drawSpace(spaceCount);
            drawStar(starCount);
            starCount -= 2;
            spaceCount++;
            System.out.println();
        }
    }


    public void drawSpace(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public void drawStar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}
