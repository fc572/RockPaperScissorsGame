package com.game.readandwrite;

import com.game.GameSign;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ReadOrWriteTest
{
    private ReadOrWrite readOrWrite;
    private PrintStream mockPrintStream;
    private InputStream mockInputStream;


    @Before
    public void setup()
    {
        mockPrintStream = mock(PrintStream.class);
    }

    @Test
    public void checkForLowerBoundValue()
    {
        mockInputStream = new ByteArrayInputStream("1".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(),1);
    }

    @Test
    public void checkForValidInput() throws Exception
    {
        mockInputStream = new ByteArrayInputStream("2".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(),2);
    }

    @Test
    public void checkForUpperBoundValue()
    {
        mockInputStream = new ByteArrayInputStream("3".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(),3);

    }
}
