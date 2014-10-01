public class Checking {

    private final int TIE = 0;
    private final int WIN = 1;
    private final int LOSE = 2;
    private final int ERROR = -1;

    public int check(int pGesture, int cGesture) {

        if (pGesture == cGesture) {
            return TIE;
        } else if (pGesture == 1 && cGesture == 2) {
            return LOSE;
        } else if (pGesture == 2 && cGesture == 1) {
            return WIN;
        } else if (pGesture == 1 && cGesture == 3) {
            return WIN;
        } else if (pGesture == 3 && cGesture == 1) {
            return LOSE;
        } else if (pGesture == 2 && cGesture == 3) {
            return LOSE;
        } else if (pGesture == 3 && cGesture == 2) {
            return WIN;
        } else {
            return ERROR;
        }
    }

}