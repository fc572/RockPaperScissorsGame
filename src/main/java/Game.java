import com.game.GameSign;
import com.game.Result;
import com.game.rules.ApplyRules;
import com.game.player.Player;
import com.game.readandwrite.ReadInput;

public class Game
{

    private String yesOrNo;

    private GameSign inputFromPlayer1;
    private GameSign inputFromPlayer2;

    public GameSign getInputFromPlayer1()
    {
        return inputFromPlayer1;
    }

    public void setInputFromPlayer1(GameSign inputFromPlayer1)
    {
        this.inputFromPlayer1 = inputFromPlayer1;
    }

    public GameSign getInputFromPlayer2()
    {
        return inputFromPlayer2;
    }

    public void setInputFromPlayer2(GameSign inputFromPlayer2)
    {
        this.inputFromPlayer2 = inputFromPlayer2;
    }

    private ReadInput readInput;

    private Player player1;
    private Player player2;

    private ApplyRules checker;
    private Score score;

    public Game(ReadInput readInput, Score score, ApplyRules checker, Player player1, Player player2)
    {
        this.score = score;
        this.checker = checker;
        this.readInput = readInput;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gameLoop() throws Exception
    {
        while (true)
        {
            setInputFromPlayer1(player1.makeAmove());
            setInputFromPlayer2(player2.makeAmove());

            Result resultChecked = checker.check(getInputFromPlayer1(), getInputFromPlayer2());

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