package com.game.readandwrite;

import java.util.Scanner;

public class displayScoreAndMenu
{
    Scanner input = new Scanner(System.in);

    private int wins = 0;
    private int loses = 0;
    private int ties = 0;

    private String userChoice;

    public void scoreBoard(int winOrLoseOrTie){
        if(winOrLoseOrTie == 1){
            wins++;
        }else if(winOrLoseOrTie == 2){
            loses++;
        }else if(winOrLoseOrTie == 0){
            ties++;
        }
    }

    public void displayScore(){
        System.out.println("Wins Loses Ties\n"+wins+"    "+loses+"    "+ties);
    }

    public void resetScoreBoard(){
        wins = 0;
        loses = 0;
        ties = 0;
    }

    public void ScoreMenu()
    {
        System.out.println("Display Score: display");
        System.out.println("Reset Score: reset");
        System.out.println("Exit score menu: exit");

        userChoice = input.next();
        if(userChoice.equals("display")){
            displayScore();
        }else if(userChoice.equals("reset")){
            resetScoreBoard();
        }else if(userChoice.equals("exit")){
            return;
        }else{
            System.out.println("Invalid command!");
            ScoreMenu();
        }
    }
}
