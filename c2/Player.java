/**
 * Created by jessastbury on 10/02/2017.
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("im guessing " + number);

    }
}
