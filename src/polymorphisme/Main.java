package polymorphisme;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Stars Wars");
        movie.watchMovie();

        Movie comedy = new Comedy("Mr. Bean");
        comedy.watchMovie();

        Movie adventure = new Adventure("The Lion King");
        adventure.watchMovie();

    }
}
