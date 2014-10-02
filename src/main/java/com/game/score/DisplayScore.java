package com.game.score;

import com.game.Result;
import com.game.inputandoutput.ReadOrWrite;

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
            readOrWrite.printToScreen("Player 1 wins this round");
        }
        else if(resultChecked == Result.LOSE)
        {
            readOrWrite.printToScreen("Player 2 wins this round");
        }
        else
        {
            readOrWrite.printToScreen("This is a TIE");
        }

       readOrWrite.printToScreen("Player 1 total wins - Ties - Player 2 total wins\n"
               + keepTrackOfScore.getWins() + "                      "
               + keepTrackOfScore.getTies() + "                      "
               + keepTrackOfScore.getLoses());
    }
}
