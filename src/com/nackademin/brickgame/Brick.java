package com.nackademin.brickgame;

import javax.swing.*;

public class Brick extends JButton {
    private Numbers number;
    private Positions position;

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    Brick(Numbers number) {
        this.number = number;
        this.setText(this.number.getName());
    }

    Brick(Numbers number, Positions position) {
        this.number = number;
        this.position = position;
        this.setText(this.number.getName());
    }

    @Override
    public String toString() {
        return "Brick number " + number + "\nBrick position " + position + "\n";
    }
}
