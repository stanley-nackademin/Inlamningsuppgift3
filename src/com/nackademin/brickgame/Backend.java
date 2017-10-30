package com.nackademin.brickgame;

public class Backend {
    private BrickContainer brickContainer;

    public BrickContainer getBrickContainer() {
        return brickContainer;
    }

    Backend() {
        brickContainer = new BrickContainer();
        for (int i = 0; i < Positions.values().length; i++) {
            Brick brick = new Brick(Numbers.values()[i], Positions.values()[i]);
            brickContainer.addBrick(brick);
        }

        brickContainer.shuffleBrickPosition();
    }
}
