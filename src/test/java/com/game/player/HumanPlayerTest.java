package com.game.player;

import com.game.player.impl.HumanPlayer;
import com.game.readandwrite.ReadOrWrite;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HumanPlayerTest
{
    private ReadOrWrite readOrWrite;
    private HumanPlayer humanPlayer;


    @Before
    public void setup()
    {
        readOrWrite = mock(ReadOrWrite.class);
        humanPlayer = new HumanPlayer(readOrWrite);
    }

    @Test
    public void makeAmoveTest() throws Exception
    {
        humanPlayer.makeAmove();
        verify(readOrWrite, atLeastOnce()).getTheUserInput();
    }
}
