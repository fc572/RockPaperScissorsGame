package com.game.input;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadInput
{
    private final Scanner scanner;
    private final PrintStream printStream;

    public ReadInput(InputStream inputStream, PrintStream printStream) {
        scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public int ask(String message) {
        printStream.println(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        getTheUserInput(new ReadInput(System.in, System.out));
    }

    public static int getTheUserInput(ReadInput readInput) {
        int input = readInput.ask("Please choose -- 1: Rock - 2: Paper - 3: Scissors");
        while (input < 1 || input > 3)
            input = readInput.ask("Please try again");
        return input;
    }
}