package com.nackademin.brickgame;

public enum Numbers {
    /*empty(0),
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    eleven(11),
    twelve(12),
    thirteen(13),
    fourteen(14),
    fifteen(15);*/

    EMPTY(0, ""),
    ONE(1, "1"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    ELEVEN(11, "11"),
    TWELVE(12, "12"),
    THIRTEEN(13, "13"),
    FOURTEEN(14, "14"),
    FIFTEEN(15, "15");

    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    Numbers(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
