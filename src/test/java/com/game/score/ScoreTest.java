package com.game.score;

import com.game.Result;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreTest
{
    private KeepTrackOfScore keepTrackOfScore;

    @Before
    public void setup()
    {
        keepTrackOfScore = new KeepTrackOfScore();
    }

    @Test
    public void keepTrackofScoreTest()
    {
        keepTrackOfScore.trackTheScore(Result.WIN);
        assertEquals(keepTrackOfScore.getWins(), 1);

        keepTrackOfScore.trackTheScore(Result.TIE);
        assertEquals(keepTrackOfScore.getTies(), 1);

        keepTrackOfScore.trackTheScore(Result.LOSE);
        assertEquals(keepTrackOfScore.getLoses(), 1);
    }

    @Test
    public void keepTrackofCumulativeScoreTest()
    {
        keepTrackOfScore.trackTheScore(Result.WIN);
        assertEquals(keepTrackOfScore.getWins(), 1);

        keepTrackOfScore.trackTheScore(Result.WIN);
        assertEquals(keepTrackOfScore.getWins(), 2);

        keepTrackOfScore.trackTheScore(Result.WIN);
        assertEquals(keepTrackOfScore.getWins(), 3);
    }

    @Test
    public void resetTheScoreTest()
    {
        keepTrackOfScore.trackTheScore(Result.WIN);
        keepTrackOfScore.trackTheScore(Result.TIE);
        keepTrackOfScore.trackTheScore(Result.LOSE);

        keepTrackOfScore.resetScore();

        assertEquals(keepTrackOfScore.getWins(), 0);
        assertEquals(keepTrackOfScore.getTies(), 0);
        assertEquals(keepTrackOfScore.getLoses(),0);
    }
}
