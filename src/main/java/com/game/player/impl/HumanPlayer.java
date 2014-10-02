package com.game.player.impl;

import com.game.GameSign;
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
    public GameSign makeAmove() throws Exception
    {
        switch (readInput.getTheUserInput())
        {
            case 1:
            {
                return GameSign.ROCK;
            }

            case 2:
            {
                return GameSign.PAPER;
            }

            case 3:
            {
                return GameSign.SCISSORS;
            }

            default:
            {
                throw new Exception("There has been an error while making a move");
            }
        }
    }
}
