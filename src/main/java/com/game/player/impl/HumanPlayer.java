package com.game.player.impl;

import com.game.readandwrite.ReadInput;
import com.game.player.Player;

public class HumanPlayer implements Player
{

    private ReadInput readInput;

    public HumanPlayer(ReadInput readInput)
    {
        this.readInput = readInput;
    }

    @Override
    public int makeAmove()
    {
        return readInput.getTheUserInput();
    }
}
