/**
 * Created by jessastbury on 10/02/2017.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }

        d.playTopHat();
    }
}
