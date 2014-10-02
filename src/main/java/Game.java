import com.game.player.Player;
import com.game.readandwrite.ReadInput;

public class Game
{

    private String yesOrNo;

    private int inputFromPlayer1;
    private int inputFromPlayer2;

    public int getInputFromPlayer1()
    {
        return inputFromPlayer1;
    }

    public void setInputFromPlayer1(int inputFromPlayer1)
    {
        this.inputFromPlayer1 = inputFromPlayer1;
    }

    public int getInputFromPlayer2()
    {
        return inputFromPlayer2;
    }

    public void setInputFromPlayer2(int inputFromPlayer2)
    {
        this.inputFromPlayer2 = inputFromPlayer2;
    }

    private ReadInput readInput;

    private Player player1;
    private Player player2;

    private Checking checker;
    private Score score;

    public Game(ReadInput readInput, Score score, Checking checker, Player player1, Player player2)
    {
        this.score = score;
        this.checker = checker;
        this.readInput = readInput;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gameLoop()
    {
        while (true)
        {
            setInputFromPlayer1(player1.makeAmove());
            setInputFromPlayer2(player2.makeAmove());

            int result = (getInputFromPlayer1() - getInputFromPlayer2()) % 3;

            if(result == 1)
            {
                System.out.println("Player 1 Wins!");
                score.scoreBoard(1);
            }
            else if(result == 0)
            {
                System.out.println("This is a Tie!");
                score.scoreBoard(0);
            }
            else if (result == -1)
            {
                System.out.println("Player 1 Loses");
                score.scoreBoard(2);
            }
            else
            {
                break;
            }

            System.out.println("Go to score menu? y/n");
            yesOrNo = readInput.readNextLine();
            if(yesOrNo.equalsIgnoreCase("y"))
            {
                score.ScoreMenu();
            }

            System.out.println("Want to play again? Choose No to exit");

            yesOrNo = readInput.readNextLine();

            if(yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }
}