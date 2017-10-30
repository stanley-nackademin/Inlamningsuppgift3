package com.nackademin.brickgame;

import javax.swing.*;

public class GUI extends JFrame {

    private Backend backend;

    GUI(Backend b) {
        this.backend = b;

        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
