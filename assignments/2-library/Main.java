import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                                                Welcome
                ---------------------------------------------------------------------------
                """);

        final Book[] library = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, Book.Genre.FICTION),
                new Book("Harry Potter and the Sorcer's Stone", "J. K. Rowling", 1997,
                        Book.Genre.FICTION),
                new Book("The War of the Worlds", "H. G. Wells", 1898, Book.Genre.SCIENCE_FICTION),
                new Book("Sherlock Holmes", "Arthur Conan Doyle", 1892, Book.Genre.MYSTERY),
                new Book("Steve Jobs", "Arthur Isaacson", 2011, Book.Genre.BIOGRAPHY),
                new Book("Philosophiae Naturalis Principia Mathematica", "Sir Isaac Newton", 1687,
                        Book.Genre.NON_FICTION)
        };

        out.println("Our library has " + library.length + " book(s).\n");

        printBook(library[0]);
        printBook(library[1]);
        printBook(library[2]);
        printBook(library[3]);
        printBook(library[4]);
        printBook(library[5]);

        out.println("""
                ---------------------------------------------------------------------------
                                               Thank you
                ---------------------------------------------------------------------------
                """);
    }

    // -------------------------------------------------------------------------------------------- 
    public static void printBook(final Book book) {
        out.printf("""
                book {
                  %s = %s
                  %s = %s
                  %s = %d
                  %s = %s
                }\n
                """,
                "title", book.title, "author", book.author, "year", book.year, "genre",
                book.genre.toString());
    }

    // --------------------------------------------------------------------------------------------
    public static void clear() {
        try {
            ProcessBuilder pb;

            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                // Windows
                pb = new ProcessBuilder("cmd.exe", "/c", "cls");
            } else {
                // Unix-like systems
                pb = new ProcessBuilder("clear");
            }

            pb.inheritIO();

            Process process = pb.start();
            int exitCode = process.waitFor();

            if (exitCode != 0) {
                System.err.println("Warning: clear command exited with code " + exitCode);
            }
        } catch (java.io.IOException e) {
            System.err.println("Failed to execute clear command (IOException): " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Clear command was interrupted");
            Thread.currentThread().interrupt(); // Restore interrupt status
        } catch (Exception e) {
            System.err.println("Unexpected error while clearing console: " + e.getMessage());
        }
    }
}
