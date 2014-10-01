package com.game;

import com.game.readandwrite.ReadInput;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ReadInputTest
{
    private ReadInput readInput;
    private PrintStream mockPrintStream;
    private InputStream mockInputStream;


    @Before
    public void setup()
    {
        mockInputStream = mock(InputStream.class);
        mockPrintStream = mock(PrintStream.class);
    }

    @Test
    public void checkForLowerBoundValue()
    {
        mockInputStream = new ByteArrayInputStream("1".getBytes());
        readInput = new ReadInput(mockInputStream, mockPrintStream);
        int inputRead = readInput.getTheUserInput();
        assertEquals(inputRead,1);
    }

    @Test
    public void checkForValidInput() throws Exception
    {
        mockInputStream = new ByteArrayInputStream("2".getBytes());
        readInput = new ReadInput(mockInputStream, mockPrintStream);
        int inputRead = readInput.getTheUserInput();
        assertEquals(inputRead,2);
    }

    @Test
    public void checkForUpperBoundValue()
    {
        mockInputStream = new ByteArrayInputStream("3".getBytes());
        readInput = new ReadInput(mockInputStream, mockPrintStream);
        int inputRead = readInput.getTheUserInput();
        assertEquals(inputRead,3);

    }
}
