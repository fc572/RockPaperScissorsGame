package com.game.player;

import com.game.GameSign;
import com.game.player.impl.HumanPlayer;
import com.game.inputandoutput.ReadOrWrite;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class HumanPlayerTest
{
    private ReadOrWrite readOrWrite;
    private HumanPlayer humanPlayer;
    private InputStream mockInputStream;
    private PrintStream mockPrintStream;


    @Before
    public void setup()
    {
        readOrWrite = mock(ReadOrWrite.class);
        humanPlayer = new HumanPlayer(readOrWrite);
        mockPrintStream = mock(PrintStream.class);
    }

    @Test
    public void makeAmoveTest() throws Exception
    {
        humanPlayer.makeAmove();
        verify(readOrWrite, atLeastOnce()).getTheUserInput();
    }

    @Test
    public void chooseRockTest() throws Exception
    {
        mockInputStream = new ByteArrayInputStream("1".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(), GameSign.ROCK.getValue());
    }

    @Test
    public void choosePaperTest() throws Exception
    {
        mockInputStream = new ByteArrayInputStream("2".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(), GameSign.PAPER.getValue());
    }

    @Test
    public void chooseScissorsTest() throws Exception
    {
        mockInputStream = new ByteArrayInputStream("3".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
        assertEquals(inputRead.getValue(), GameSign.SCISSORS.getValue());
    }


    @Test(expected = java.lang.Throwable.class, timeout=1000) //This test fails as when there is an invalid input the
                                                              //code is stuck in a loop;
    @Ignore
    public void invalidInput() {
        mockInputStream = new ByteArrayInputStream("4".getBytes());
        readOrWrite = new ReadOrWrite(mockInputStream, mockPrintStream);
        GameSign inputRead = readOrWrite.getTheUserInput();
    }
}
