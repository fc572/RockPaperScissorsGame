package com.game;

import com.game.input.ReadInput;
import org.junit.Before;
import org.junit.Test;

import static com.game.input.ReadInput.getTheUserInput;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class ReadInputTest
{
    private ReadInput mockReadInput;

    @Before
    public void setup()
    {
        mockReadInput = mock(ReadInput.class);
    }

    @Test
    public void checkForValidInput() throws Exception {

        when(mockReadInput.ask(anyString())).thenReturn(2);
        assertEquals(getTheUserInput(mockReadInput), 2);
    }

    @Test
    public void checkForUpperBoundValue() throws Exception {

        when(mockReadInput.ask("Please choose -- 1: Rock - 2: Paper - 3: Scissors")).thenReturn(4);
        when(mockReadInput.ask("Please try again")).thenReturn(3); /* a valid input is needed otherwise I am stuck in
                                                            the while loop of the mocked object */
        getTheUserInput(mockReadInput);
        verify(mockReadInput).ask("Please try again");
    }

    @Test
    public void checkForLowerBoundValue() throws Exception {

        when(mockReadInput.ask("Please choose -- 1: Rock - 2: Paper - 3: Scissors")).thenReturn(0);
        when(mockReadInput.ask("Please try again")).thenReturn(1);

        getTheUserInput(mockReadInput);
        verify(mockReadInput).ask("Please try again");
    }
}
