package com.game.player;

import com.game.player.impl.HumanPlayer;
import com.game.readandwrite.ReadInput;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HumanPlayerTest
{
    private ReadInput readInput;
    private HumanPlayer humanPlayer;


    @Before
    public void setup()
    {
        readInput = mock(ReadInput.class);
        humanPlayer = new HumanPlayer(readInput);
    }

    @Test
    public void makeAmoveTest()
    {
        humanPlayer.makeAmove();
        verify(readInput, atLeastOnce()).getTheUserInput();
    }
}
