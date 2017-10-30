package com.nackademin.brickgame;

public class Main {

    Main() {
        Backend b = new Backend();
        GUI g = new GUI(b);
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}
