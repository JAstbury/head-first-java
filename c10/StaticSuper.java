/**
 * Created by jessastbury on 19/02/2017.
 */
public class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}
