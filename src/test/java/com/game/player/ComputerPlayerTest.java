package com.game.player;

import com.game.player.impl.ComputerPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComputerPlayerTest
{
    private ComputerPlayer computerPlayer;

    @Before
    public void setup()
    {
        computerPlayer = new ComputerPlayer();
    }

    @Test
    public void makeAmoveTest()
    {
        int computerMadeAMove = computerPlayer.makeAmove();
        assertTrue(computerMadeAMove > 0 && computerMadeAMove < 4);
    }
}
