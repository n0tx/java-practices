package polymorphisme;

public class Movie {

    /*
    private String title;

    public Movie(String title) {
        this.title = title;
    }
     */

    public Movie(String title) {
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("this is a %s%n", instanceType);
    }
}
