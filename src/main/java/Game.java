import com.game.readandwrite.ReadInput;

public class Game
{

    private String yesOrNo;

    private int inputReadFromUser;

    private ReadInput readInput;
    private Computer comp;
    private Checking checker;
    private Score score;

    public Game(ReadInput readInput, Score score, Checking checker, Computer comp)
    {
        this.score = score;
        this.checker = checker;
        this.comp = comp;
        this.readInput = readInput;
    }

    public void gameLoop()
    {
        while (true)
        {
            inputReadFromUser = readInput.getTheUserInput();
            comp.setComputerGesture();
            if (checker.check(inputReadFromUser , comp.getComputerGesture()) == 1)
            {
                System.out.println("Tie!");
                score.scoreBoard(0);
            }
            else if (checker.check(inputReadFromUser, comp.getComputerGesture()) == 2)
            {
                System.out.println("Win!");
                score.scoreBoard(1);
            }
            else if (checker.check(inputReadFromUser,comp.getComputerGesture()) == 3)
            {
                System.out.println("Lose");
                score.scoreBoard(2);
            }
            else if (checker.check(inputReadFromUser,comp.getComputerGesture()) == -1)
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