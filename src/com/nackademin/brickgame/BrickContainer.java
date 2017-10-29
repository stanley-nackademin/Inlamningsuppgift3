package com.nackademin.brickgame;

import java.util.ArrayList;
import java.util.List;

public class BrickContainer {
    private List<Brick> brickList;

    BrickContainer() {
        brickList = new ArrayList<>();
    }

    BrickContainer(List<Brick> brickList) {
        this.brickList = brickList;
    }

    public void addBrick(Brick brick) {
        brickList.add(brick);
    }
}
