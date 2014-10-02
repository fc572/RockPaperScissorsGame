package com.game.inputandoutput;

import com.game.GameSign;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadOrWrite
{
    private Scanner scanner;
    private PrintStream printStream;

    public ReadOrWrite(InputStream inputStream, PrintStream printStream) {
        scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public GameSign getTheUserInput() {
        int input = ask("Please choose -- 1: Rock - 2: Paper - 3: Scissors");

        if(input == 1)
        {
            return GameSign.ROCK;
        }
        else if(input == 2)
        {
            return GameSign.PAPER;
        }
        else
        {
            return GameSign.SCISSORS;
        }
    }

    public int ask(String message)
    {
        printToScreen(message);
        return readNextInt();
    }

    public int readNextInt()
    {
        int userInput;
        try
        {
            userInput = scanner.nextInt();
        }
        catch(InputMismatchException e)
        {
            scanner.nextLine();//to clear the exception so the app will not enter in infinite loop
            userInput = 3;
        }

        if(userInput == 1)
        {
            return 1;
        }
        else if(userInput == 2)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }

    public void printToScreen(String message)
    {
        printStream.println(message);
    }
}