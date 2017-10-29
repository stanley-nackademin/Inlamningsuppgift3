package com.nackademin.brickgame;

public class Main {

    Main() {
        BrickContainer brickContainer = new BrickContainer();
        for (Numbers n : Numbers.values()) {
            Brick brick = new Brick(n);
            brickContainer.addBrick(brick);
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}
