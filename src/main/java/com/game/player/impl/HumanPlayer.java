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
        try
        {
            return readInput.getTheUserInput();
        }
        catch (Exception e)
        {
                throw new Exception("There has been an error while making a move");
        }
    }
}
