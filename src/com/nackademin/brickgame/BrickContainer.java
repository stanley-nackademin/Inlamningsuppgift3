package com.nackademin.brickgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BrickContainer {
    private List<Brick> brickList;

    public List<Brick> getBrickList() {
        return brickList;
    }

    BrickContainer() {
        brickList = new ArrayList<>();
    }

    BrickContainer(List<Brick> brickList) {
        this.brickList = brickList;
    }

    public void addBrick(Brick brick) {
        brickList.add(brick);
    }

    public void shuffleBrickPosition() {
        List<Positions> positionsList = Arrays.asList(Positions.values());
        Collections.shuffle(positionsList);

        int i = 0;
        for (Brick b : brickList) {
            b.setPosition(positionsList.get(i));
            i++;
        }
    }

    public void switchBrick(Brick b1, Brick b2) {

    }
}
