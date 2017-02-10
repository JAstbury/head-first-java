/**
 * Created by jessastbury on 10/02/2017.
 */
public class TapeDeckTestDrive {
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
