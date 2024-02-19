package polymorphisme2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, Q for quit)");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                System.out.println("exit");
                break;
            }
            String title = s.nextLine();
            Adventure movie = (Adventure) Movie.getMovie(type, title);
            movie.watchMovie();
        }

//        Movie movie = Movie.getMovie("Others", "Stars Wars");
//        movie.watchMovie();
//
//        Movie movie1 = Movie.getMovie("Comedy", "Mr. Bean");
//        movie1.watchMovie();
//
//        Movie movie2 = Movie.getMovie("Adventure", "The Lion King");
//        movie2.watchMovie();

    }
}
