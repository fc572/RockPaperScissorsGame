package com.game.player.impl;

import com.game.player.Player;

public class ComputerPlayer implements Player
{
    private int computerGesture;

    private void setComputerGesture()
    {
        computerGesture = (int) (Math.random() * 3);

        switch(computerGesture)
        {
            case 0:
                computerGesture = 1;
                break;

            case 1:
                computerGesture = 2;
                break;

            case 2:
                computerGesture = 3;
        }
    }


    public void readMoveFromUser()
    {
        setComputerGesture();
        if(computerGesture == 1)
        {
            System.out.println("HAL chooses Rock");
        }
        else if(computerGesture == 2)
        {
            System.out.println("HAL chooses paper");
        }
        else if(computerGesture == 3)
        {
            System.out.println("HAL chooses scissor");
        }
    }
}
