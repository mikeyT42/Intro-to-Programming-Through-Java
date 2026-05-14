import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 3: Logic Operators and Control Structures
                ---------------------------------------------------------------------------
                """);

        logicalOperators();
    }

    // --------------------------------------------------------------------------------------------
    public static void logicalOperators() {
        out.println("""
                ---------------------------------------------------------------------------
                        The Logical Operators
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The logical values have their own type: they are called booleans. A valid
                boolean value can either be \"true\" or it can be \"false\". A boolean
                variable can be created like this:

                            boolean isLowerCase = false;
                """);
        @SuppressWarnings("unused")
        boolean isLowerCase = false;

        out.println("""
                A boolean value is a primitive type, and is not a single bit--like you may
                imagine since the computer only has to represent two values. Technically,
                the size is undefined and is up to the JVM implementation, but its probably
                a single, whole, byte. Do not confuse this with the Boolean type. This is a
                object--a.k.a. a complex type. It provides some utility methods, but since
                it is a whole object it's size is much larger: a Boolean could be four or
                eight bytes--this is four to eight times larger than a primitive boolean!
                So, only use a Boolean if you really, really need the added functionality.
                Please, be memory conscious.
                """);
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
