import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                                                Welcome
                ---------------------------------------------------------------------------
                """);

        int x = 5;
        int y = 2;
        int result;

        result = add(x, y);
        out.println("result = " + result);

        result = subtract(x, y);
        out.println("result = " + result);

        result = multiply(x, y);
        out.println("result = " + result);

        result = divide(x, y);
        out.println("result = " + result);

        result = remainderOf(x, y);
        out.println("result = " + result);

        result = power(x, y);
        out.println("result = " + result);

        out.println("""

                ---------------------------------------------------------------------------
                                               Thank you
                ---------------------------------------------------------------------------
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static int add(int x, int y) {
        out.println("Adding " + x + " to " + y);
        return x + y;
    }

    // --------------------------------------------------------------------------------------------
    public static int subtract(int x, int y) {
        out.println("Subtracting " + y + " from " + x);
        return x - y;
    }

    // --------------------------------------------------------------------------------------------
    public static int multiply(int x, int y) {
        out.println("Multiplying " + x + " by " + y);
        return x * y;
    }

    // --------------------------------------------------------------------------------------------
    public static int divide(int x, int y) {
        out.println("Dividing " + x + " by " + y);
        return x / y;
    }

    // --------------------------------------------------------------------------------------------
    public static int remainderOf(int x, int y) {
        out.println("Getting the remainder of the division of " + x + " by " + y);
        return x % y;
    }

    // --------------------------------------------------------------------------------------------
    public static int power(int x, int y) {
        out.println("Raising " + x + " to the power of " + y);
        return (int) Math.pow(x, y);
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
