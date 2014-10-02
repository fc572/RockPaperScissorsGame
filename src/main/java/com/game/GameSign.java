package com.game;

public enum GameSign
{
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int value;

    private GameSign(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
