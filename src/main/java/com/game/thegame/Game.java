package com.game.thegame;

import com.game.GameSign;
import com.game.Result;
import com.game.rules.ApplyRules;
import com.game.player.Player;
import com.game.inputandoutput.ReadOrWrite;
import com.game.score.DisplayScore;
import com.game.score.KeepTrackOfScore;

public class Game
{
    private ReadOrWrite readOrWrite;

    private Player player1;
    private Player player2;

    private ApplyRules checker;
    private DisplayScore displayScore;
    private KeepTrackOfScore keepTrackOfScore;

    private GameSign inputFromPlayer1;
    private GameSign inputFromPlayer2;

    private int yesOrNo;

    public GameSign getInputFromPlayer1()
    {
        return inputFromPlayer1;
    }

    public void setInputFromPlayer1(GameSign inputFromPlayer1)
    {
        this.inputFromPlayer1 = inputFromPlayer1;
    }

    public GameSign getInputFromPlayer2()
    {
        return inputFromPlayer2;
    }

    public void setInputFromPlayer2(GameSign inputFromPlayer2)
    {
        this.inputFromPlayer2 = inputFromPlayer2;
    }

    public Game(ReadOrWrite readOrWrite, Player player1, Player player2)
    {
        this.readOrWrite = readOrWrite;
        this.player1 = player1;
        this.player2 = player2;

        keepTrackOfScore = new KeepTrackOfScore();
        displayScore = new DisplayScore(readOrWrite, keepTrackOfScore);

        checker = new ApplyRules();
    }

    public void playTheGame() throws Exception
    {
        while (true)
        {
            setInputFromPlayer1(player1.makeAmove());
            setInputFromPlayer2(player2.makeAmove());

            Result resultChecked = checker.check(getInputFromPlayer1(), getInputFromPlayer2());

            keepTrackOfScore.trackTheScore(resultChecked);
            displayScore.displayTheScore(resultChecked);

            readOrWrite.printToScreen("Want to play again? 1 to exit, 2 to Reset the score, 3 to continue...");

            yesOrNo = readOrWrite.readNextInt();

            if(yesOrNo == 1)
            {
                break;//get out of while loop
            }
            else if (yesOrNo == 2)
            {
                keepTrackOfScore.resetScore();
            }
        }
    }
}