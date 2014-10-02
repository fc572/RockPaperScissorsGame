package com.game.rules;

import com.game.Result;
import org.junit.Before;
import org.junit.Test;
import com.game.GameSign;

import static org.junit.Assert.assertEquals;

public class RulesCheckerTest
{
    private ApplyRules applyRules;
    private Result result;

    @Before
    public void setup()
    {
        applyRules = new ApplyRules();
    }

    @Test
    public void rockWins() throws Exception
    {
        result = applyRules.check(GameSign.ROCK, GameSign.SCISSORS);
        assertEquals(result, Result.WIN);
    }
    @Test
    public void rockTie() throws Exception
    {
        result = applyRules.check(GameSign.ROCK, GameSign.ROCK);
        assertEquals(result, Result.TIE);
    }
    @Test
    public void rockLose() throws Exception
    {
        result = applyRules.check(GameSign.ROCK, GameSign.PAPER);
        assertEquals(result, Result.LOSE);
    }

    @Test
    public void paperWins() throws Exception
    {
        result = applyRules.check(GameSign.PAPER, GameSign.ROCK);
        assertEquals(result, Result.WIN);
    }
    @Test
    public void paperTie() throws Exception
    {
        result = applyRules.check(GameSign.PAPER, GameSign.PAPER);
        assertEquals(result, Result.TIE);
    }
    @Test
    public void paperLose() throws Exception
    {
        result = applyRules.check(GameSign.PAPER, GameSign.SCISSORS);
        assertEquals(result, Result.LOSE);
    }

    @Test
    public void ScissorsWins() throws Exception
    {
        result = applyRules.check(GameSign.SCISSORS, GameSign.PAPER);
        assertEquals(result, Result.WIN);
    }
    @Test
    public void ScissorsTie() throws Exception
    {
        result = applyRules.check(GameSign.SCISSORS, GameSign.SCISSORS);
        assertEquals(result, Result.TIE);
    }
    @Test
    public void scissorsLose() throws Exception
    {
        result = applyRules.check(GameSign.SCISSORS, GameSign.ROCK);
        assertEquals(result, Result.LOSE);
    }
}
