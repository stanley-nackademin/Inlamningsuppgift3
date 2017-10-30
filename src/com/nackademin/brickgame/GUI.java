package com.nackademin.brickgame;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private BrickContainer brickContainer;

    GUI(Backend backend) {
        this.brickContainer = backend.getBrickContainer();

        this.setLayout(new GridLayout(2, 1));
        JPanel gridPanel = new JPanel(new GridLayout(4, 4));
        gridPanel.setBackground(Color.BLACK);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.GRAY);
        this.add(gridPanel);
        this.add(buttonPanel);

        for (Brick b : brickContainer.getBrickList()) {
            gridPanel.add(b);
        }

        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
