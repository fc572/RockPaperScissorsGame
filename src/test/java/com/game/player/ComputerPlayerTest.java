package com.game.player;

import com.game.GameSign;
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
    public void makeAmoveTest()throws Exception
    {
        GameSign computerMadeAMove = computerPlayer.makeAmove();
        assertTrue((computerMadeAMove == GameSign.ROCK) || (computerMadeAMove == GameSign.PAPER) || (computerMadeAMove == GameSign.SCISSORS) );
   }
}
