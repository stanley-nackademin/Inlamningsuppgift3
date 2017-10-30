package com.nackademin.brickgame;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private BrickContainer brickContainer;
    private JPanel gridPanel;

    GUI(Backend backend) {
        this.brickContainer = backend.getBrickContainer();

        this.setLayout(new GridLayout(2, 1));
        gridPanel = new JPanel(new GridLayout(4, 4));
        gridPanel.setBackground(Color.BLACK);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.GRAY);
        JButton redrawButton = new JButton("Redraw");
        this.add(gridPanel);
        this.add(buttonPanel);
        buttonPanel.add(redrawButton);
        redrawButton.addActionListener(ae -> redrawBoard());

        for (Brick b : brickContainer.getBrickList()) {
            gridPanel.add(b);
        }

        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void redrawBoard() {
        gridPanel.removeAll();
        gridPanel.add(new JButton("Test"));
        this.revalidate();
        this.repaint();
    }
}
