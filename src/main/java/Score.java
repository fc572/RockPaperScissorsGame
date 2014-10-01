import java.util.Scanner;

public class Score {

    Scanner input = new Scanner(System.in);

    private int wins = 0;
    private int loses = 0;
    private int ties = 0;

    private String choise;

    public int getWins()
    {
        return wins;
    }

    public void setWins(int wins)
    {
        this.wins += wins;
    }

    public int getLoses()
    {
        return loses;
    }

    public void setLoses(int loses)
    {
        this.loses += loses;
    }

    public int getTies()
    {
        return ties;
    }

    public void setTies(int ties)
    {
        this.ties += ties;
    }

    public void scoreBoard(int winOrLoseOrTie)
    {
        if(winOrLoseOrTie == 1)
        {
            setWins(1);
        }
        else if(winOrLoseOrTie == 2)
        {
            setLoses(1);
        }
        else if(winOrLoseOrTie == 0)
        {
            setTies(1);
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

    public void ScoreMenu(){
        System.out.println("Display: D - Reset: R - Exit menu: any key");

        choise = input.next();

        if(choise.equalsIgnoreCase("d"))
        {
            displayScore();
        }
        else if(choise.equalsIgnoreCase("r"))
        {
            resetScoreBoard();
        }
    }
}