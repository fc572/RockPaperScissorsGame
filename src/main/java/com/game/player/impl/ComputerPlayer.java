package com.game.player.impl;

import com.game.GameSign;
import com.game.player.Player;

public class ComputerPlayer implements Player{

    @Override
    public GameSign makeAmove() throws Exception
    {
        switch ((int) (Math.random() * 3))
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