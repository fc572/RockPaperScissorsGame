import com.game.rules.ApplyRules;
import com.game.player.Player;
import com.game.player.impl.ComputerPlayer;
import com.game.player.impl.HumanPlayer;
import com.game.readandwrite.ReadInput;

public class Main {

    public static void main(String args[])
    {
        ReadInput readInput = new ReadInput(System.in, System.out);
        ApplyRules checker = new ApplyRules();
        Score score = new Score();
        Player player1, player2;

        System.out.println("Choose 1 to play Human vs Human");
        System.out.println("Choose 2 to play Computer vs Computer");
        System.out.println("Any key to play Human vs Computer");

        int choiceOfPlayers = readInput.readNextInt();

        switch(choiceOfPlayers)
        {
            case 1:
            {
                player1 = new HumanPlayer(readInput);
                player2 = new HumanPlayer(readInput);
                break;
            }
            case 2:
            {
                player1 = new ComputerPlayer();
                player2 = new ComputerPlayer();
                break;
            }
            default:
            {
                player1 = new HumanPlayer(readInput);
                player2 = new ComputerPlayer();
            }
        }

        Game game = new Game(readInput, score, checker, player1, player2);

        try
        {
            game.gameLoop();
        }
        catch (Exception e)
        {
            System.out.println("An error occurred in the game, sorry! " + e.getMessage());
        }
    }
}