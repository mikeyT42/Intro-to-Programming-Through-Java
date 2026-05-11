public class Book {
    public enum Genre {
        FICTION,
        NON_FICTION,
        SCIENCE_FICTION,
        MYSTERY,
        BIOGRAPHY,
    }

    public String title;
    public String author;
    public int year;
    public Genre genre;

    public Book(final String title, final String author, final int year, final Genre genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
}
