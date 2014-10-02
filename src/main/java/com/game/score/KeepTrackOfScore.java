package com.game.score;

import com.game.Result;

public class KeepTrackOfScore
{
    private int wins = 0;
    private int loses = 0;
    private int ties = 0;

    public int getWins()
    {
        return wins;
    }

    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public int getLoses()
    {
        return loses;
    }

    public void setLoses(int loses)
    {
        this.loses = loses;
    }

    public int getTies()
    {
        return ties;
    }

    public void setTies(int ties)
    {
        this.ties = ties;
    }

    public void resetScore(){
        setLoses(0);
        setWins(0);
        setTies(0);
    }

    public void trackTheScore(Result resultChecked)
    {
        int currentScore = 0;
        if(resultChecked == Result.WIN)
        {
            currentScore = getWins();
            setWins(currentScore + 1);
        }
        else if(resultChecked == Result.LOSE)
        {
            currentScore = getLoses();
            setLoses(currentScore + 1);
        }
        else
        {
            currentScore = getTies();
            setTies(currentScore + 1);
        }
    }
}
