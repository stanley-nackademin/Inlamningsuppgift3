package com.nackademin.brickgame;

import javax.swing.*;

public class Brick extends JButton {
    private Numbers number;
    private Positions position;

    Brick(Numbers number) {
        this.number = number;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    Brick(Numbers number, Positions position) {
        this.number = number;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Brick number " + number + "\nBrick position " + position + "\n";
    }
}
