import java.util.*;

class Movie implements Comparable<Movie> {
    private String title, director;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    private int year;

    Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public int compareTo(Movie movie) {
        if (movie.year > year) {
            return -1;
        } else if (movie.year > year) {
            return 1;
        }else
            return 0;
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            movies.add(new Movie(sc.next(), sc.next(), sc.nextInt()));
        }
        Collections.sort(movies);
        for (Movie mo : movies) {
            System.out.println(mo.getTitle() + " " + mo.getDirector() + " " + mo.getYear());
        }
    }
}