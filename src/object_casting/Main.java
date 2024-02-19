package object_casting;


public class Main {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure", "Simba");
        movie.watchMovie();

        Adventure adventureMovie = (Adventure) Movie.getMovie("Adventure", "Simba");
        adventureMovie.watchMovie();

    }

}
