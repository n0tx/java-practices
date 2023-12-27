package polymorphisme2;

public class Movie {

    // private String title;
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film %n", this.title, instanceType);
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}
