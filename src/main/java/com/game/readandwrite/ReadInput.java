package com.game.readandwrite;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadInput
{
    private Scanner scanner;
    private PrintStream printStream;

    public ReadInput(InputStream inputStream, PrintStream printStream) {
        scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public int getTheUserInput() {
        int input = ask("Please choose -- 1: Rock - 2: Paper - 3: Scissors");
        while (input < 1 || input > 3)
            input = ask("Please try again");
        return input;
    }

    public int ask(String message) {
        printStream.println(message);
        return scanner.nextInt();
    }

    public String readNextLine()
    {
        return scanner.nextLine();
    }
}