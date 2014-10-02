package com.game.thegame;

import com.game.Result;
import com.game.player.impl.ComputerPlayer;
import com.game.player.impl.HumanPlayer;
import com.game.inputandoutput.ReadOrWrite;
import com.game.rules.ApplyRules;
import com.game.score.DisplayScore;
import com.game.score.KeepTrackOfScore;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class gameTest
{
    private Game game;
    ReadOrWrite mockReadOrWrite;
    HumanPlayer mockHumanPlayer;
    ComputerPlayer mockComputerPlayer;
    KeepTrackOfScore mockKeepTrackOfScore;
    DisplayScore mockDisplayScore;
    ApplyRules mockApplyRules;
    Result result;

    @Before
    public void setup()
    {
        mockDisplayScore = mock(DisplayScore.class);

        mockHumanPlayer = mock(HumanPlayer.class);
        mockComputerPlayer = mock(ComputerPlayer.class);

        mockReadOrWrite = mock(ReadOrWrite.class);
        game = new Game(mockReadOrWrite, mockHumanPlayer, mockComputerPlayer);
    }

    @Test
    public void playForATie()throws Exception
    {
        doAnswer(new Answer<String>()
        {
            public String answer(InvocationOnMock invocation)
            {
                return  "This is a TIE";
            }
        }).when(mockDisplayScore).displayTheScore(result);
    }
}
