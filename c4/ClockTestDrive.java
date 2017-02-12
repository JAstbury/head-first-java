/**
 * Created by jessastbury on 12/02/2017.
 */
public class ClockTestDrive {
    public static void main(String [] args) {
        Clock c = new Clock();

        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("Time: " + tod);
    }
}
