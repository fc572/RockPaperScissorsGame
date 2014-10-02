package com.game.player.impl;

import com.game.GameSign;
import com.game.player.Player;

import java.util.Random;

public class ComputerPlayer implements Player{

    private int computerGesture;

    @Override
    public GameSign makeAmove() throws Exception
    {
        computerGesture = randInt(1,3);

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
                throw new Exception("There has been an error while making a Computer move");
            }
        }
    }

    //Code from http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
    private int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}