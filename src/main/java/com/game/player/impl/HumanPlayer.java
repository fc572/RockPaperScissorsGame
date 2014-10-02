package com.game.player.impl;

import com.game.GameSign;
import com.game.inputandoutput.ReadOrWrite;
import com.game.player.Player;

public class HumanPlayer implements Player
{

    private ReadOrWrite readOrWrite;

    public HumanPlayer(ReadOrWrite readOrWrite)
    {
        this.readOrWrite = readOrWrite;
    }

    @Override
    public GameSign makeAmove() throws Exception
    {
        try
        {
            return readOrWrite.getTheUserInput();
        }
        catch (Exception e)
        {
                throw new Exception("There has been an error while making a Human move");
        }
    }
}
