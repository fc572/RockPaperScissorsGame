package com.game.rules;

import com.game.GameSign;
import com.game.Result;

public class ApplyRules
{

    /*
    Rock = 1    beats Scissors
    Paper = 2   beats Rock
    Scissor = 3 beats Paper
     */

    public Result check(GameSign player1Move, GameSign player2Move) throws Exception
    {
        int result = ((player1Move.getValue() - player2Move.getValue()) % 3);
        if(result == 2)
        {
            result = -1;
        }
        else if(result == -2)
        {
            result = 1;
        }//Hack because -2%3 and 2%3 give incorrect results

        switch(result)
        {
            case 1:
            {
                return Result.WIN;
            }

            case 0:
            {
                return Result.TIE;
            }

            case -1:
            {
                return Result.LOSE;
            }

            default:
            {
                throw new Exception("There has been an error in checking the result");
            }
        }
    }
}