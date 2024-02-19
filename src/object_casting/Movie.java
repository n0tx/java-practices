package object_casting;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0))
                {
                    case 'a', 'A' -> new Adventure(title);
                    case 'c', 'C' -> new Comedy(title);
                    default -> new Movie(title);
                };
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film %n", this.title, instanceType);
    }
}
