package com.game.player.impl;

import com.game.readandwrite.ReadInput;
import com.game.player.Player;

public class HumanPlayer implements Player
{

    private ReadInput readInput;
    private int userChoice;


    public HumanPlayer(ReadInput readInput)
    {
        this.readInput = readInput;
    }

    public int getUserChoice()
    {
        return userChoice;
    }

    public void setUserChoice()
    {
        userChoice = readInput.getTheUserInput();
    }

    @Override
    public void readMoveFromUser()
    {
        getUserChoice();
    }
}
