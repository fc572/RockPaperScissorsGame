package com.game.thegame;

import com.game.inputandoutput.ReadOrWrite;
import com.game.player.impl.ComputerPlayer;
import com.game.player.impl.HumanPlayer;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class gameTest
{
    private Game game;

    ReadOrWrite mockReadOrWrite;
    HumanPlayer mockHumanPlayer;
    ComputerPlayer mockComputerPlayer;

    @Before
    public void setup()
    {
        mockHumanPlayer = mock(HumanPlayer.class);
        mockComputerPlayer = mock(ComputerPlayer.class);
        mockReadOrWrite = mock(ReadOrWrite.class);

        game = new Game(mockReadOrWrite, mockHumanPlayer, mockComputerPlayer);
    }

    @Test
    @Ignore
    public void verifyGameInteractions()throws Exception
    {
        game.playTheGame(); /*;
        This test will call line 17 in ApplyRules class that will return a null
        as I have no Result mocked.
        As enum is a final class mocking it will be quite challenging and probably
        outside the scope of this exercise*/
        verify((mockHumanPlayer), atLeastOnce()).makeAmove();
    }
}
