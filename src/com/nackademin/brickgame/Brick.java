package com.nackademin.brickgame;

import javax.swing.*;

public class Brick extends JButton {
    private Numbers number;
    private Positions position;

    Brick(Numbers number) {
        this.number = number;
    }

    Brick(Numbers number, Positions position) {
        this.number = number;
        this.position = position;
    }
}
