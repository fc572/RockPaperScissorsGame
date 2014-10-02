package com.game.thegame;

import com.game.inputandoutput.ReadOrWrite;
import com.game.player.Player;
import com.game.player.impl.ComputerPlayer;
import com.game.player.impl.HumanPlayer;

public class StartTheGame
{

    public static void main(String args[])
    {
        ReadOrWrite readOrWrite = new ReadOrWrite(System.in, System.out);
        Player player1, player2;

        System.out.println("Choose 1 to play Human vs Human");
        System.out.println("Choose 2 to play Computer vs Computer");
        System.out.println("Any Key to play Human vs Computer");

        int choiceOfPlayers = readOrWrite.readNextInt();

        switch(choiceOfPlayers)
        {
            case 1:
            {
                player1 = new HumanPlayer(readOrWrite);
                player2 = new HumanPlayer(readOrWrite);
                break;
            }
            case 2:
            {
                player1 = new ComputerPlayer();
                player2 = new ComputerPlayer();
                break;
            }
            default:
            {
                player1 = new HumanPlayer(readOrWrite);
                player2 = new ComputerPlayer();
            }
        }

        Game game = new Game(readOrWrite, player1, player2);

        try
        {
            game.playTheGame();
        }
        catch (Exception e)
        {
            readOrWrite.printToScreen("An error occurred in the game, sorry! " + e.getMessage());
        }
    }
}