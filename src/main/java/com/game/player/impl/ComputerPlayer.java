package com.game.player.impl;

import com.game.GameSign;
import com.game.player.Player;

public class ComputerPlayer implements Player{

    private int computerGesture;

    @Override
    public GameSign makeAmove() throws Exception
    {
        computerGesture = (int) (Math.random() * 3);

        switch (computerGesture)
        {
            case 1:
            {
                System.out.println("Computer chooses rock");
                return GameSign.ROCK;
            }

            case 2:
            {
                System.out.println("Computer chooses paper");
                return GameSign.PAPER;
            }

            case 3:
            {
                System.out.println("Computer chooses scissor");
                return GameSign.SCISSORS;
            }

            default:
            {
                throw new Exception("There has been an error while making a move");
            }
        }
    }
}