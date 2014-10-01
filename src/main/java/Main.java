import com.game.readandwrite.ReadInput;

public class Main {

    public static void main(String args[])
    {
        ReadInput readInput = new ReadInput(System.in, System.out);
        Computer comp = new Computer();
        Checking checker = new Checking();
        Score score = new Score();

        Game game = new Game(readInput, score, checker, comp);
        game.gameLoop();
    }
}