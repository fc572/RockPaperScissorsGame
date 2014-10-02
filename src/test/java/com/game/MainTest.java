package com.game;

import com.game.inputandoutput.ReadOrWrite;
import org.junit.Before;

import static org.mockito.Mockito.mock;

public class MainTest
{
    private ReadOrWrite readOrWrite;

    @Before
    public void setup()
    {
        readOrWrite = mock(ReadOrWrite.class);
    }
}
