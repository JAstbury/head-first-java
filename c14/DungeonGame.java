/**
 * Created by jessastbury on 20/02/2017.
 */
import java.io.*;

public class DungeonGame implements Serializable {
    public int x = 3;
    transient long y = 4;
    private short z = 5;

    int getX() {
        return x;
    }

    long getY() {
        return y;
    }

    short getZ() {
        return z;
    }
}
