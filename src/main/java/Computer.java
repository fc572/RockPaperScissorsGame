public class Computer {

    private int computerGesture;

    public int getComputerGesture()
    {
        return computerGesture;
    }

    public int setComputerGesture()
    {
        computerGesture = (int) (Math.random() * 3);

        switch(computerGesture)
        {
            case 0:
                System.out.println("Computer chooses rock");
                return 1;

            case 1:
                System.out.println("Computer chooses paper");
                return 2;

            case 2:
                System.out.println("Computer chooses scissor");
                return 3;

            default:
                return -1;
        }
    }
}