package com.game.score;

import com.game.Result;
import com.game.readandwrite.ReadOrWrite;

public class DisplayScore
{
    private ReadOrWrite readOrWrite;
    private KeepTrackOfScore keepTrackOfScore;

    public DisplayScore(ReadOrWrite readOrWrite, KeepTrackOfScore keepTrackOfScore)
    {
        this.readOrWrite = readOrWrite;
        this.keepTrackOfScore = keepTrackOfScore;
    }

    public void displayTheScore(Result resultChecked)
    {
        if(resultChecked == Result.WIN)
        {
            readOrWrite.printToScreen("Player 1 wins");
        }
        else if(resultChecked == Result.LOSE)
        {
            readOrWrite.printToScreen("Player 2 wins");
        }
        else
        {
            readOrWrite.printToScreen("This is a TIE");
        }
    }
}
