/**
 * Created by jessastbury on 12/02/2017.
 */
public class Puzzle4b {
    int ivar;
    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        }
        else {
            return ivar * (5 - factor);
        }
    }
}
