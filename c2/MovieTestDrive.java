/**
 * Created by jessastbury on 10/02/2017.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -1;
        Movie two = new Movie();
        two.title = "Lost in the Cuible Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but untimately uplifting";
        three.rating = 127;
    }
}
