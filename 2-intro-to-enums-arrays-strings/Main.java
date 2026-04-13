import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 2: Intro to Enums, Arrays, and Strings
                ---------------------------------------------------------------------------
                """);

        arrays();
    }

    // --------------------------------------------------------------------------------------------
    public static void arrays() {
        out.println("""
                ---------------------------------------------------------------------------
                        Introduction to Arrays
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Arrays are a simple data structure. A data structure is something that
                holds data in a defined organization. Later on in your education you will
                learn about many kinds of data structures, but arrays are the simplest and
                are built into Java--and most languages. An array is a block of
                contiguously allocated memory. So, every item in the array is right next to
                the other and we can name this chunk of memory. This allows us to group
                items together. How though, do we define an array?

                                int[] arrayA;
                """);
        int[] arrayA;

        out.println("""

                Here we declared an int array called arrayA that hasn't been initialized at
                all. There is no length, and it holds nothing and no contiguous block has
                been allocated: all this has done is make a symbol to refer to an array.
                Notice something special about the variable definition: an array variable
                is defined with the \"[]\" (open and close brackets). That one pair of
                symbols attached to the variable's type turns the variable from a single
                thing of whatever that type is into an array of whatever that type is. Now,
                all that we have done though is define an array variable, but nothing has
                been allocated. There is no contiguous block nor has there been any values
                put in the especially because there are no contiguous \"boxes\" to put them.
                So, let's allocate a block, how do we do that?

                                arrayA = new int[10];
                """);
        arrayA = new int[10];

        out.println("""

                We now have a contigous block of memory that can hold up to 10--and
                absolutely no more than 10--integers. We have some new Java vocabulary with
                this statement. First off, the \"new\" keyword. The \"new\" keyword tells
                the computer to allocate memory into the heap--don't worry too much about
                that fact--and in this particular instance it says to allocate a space big
                enough to hold 10 integers contiguously--along with some additional data
                about the array. Next, as far as the syntax you then have to put the data
                type of the array (it needs to match up with the defined data type) and then
                the open and close brackets with the length of the array on the inside of
                those brackets. At this point, we now have a contiguous block of allocated
                memory for our data: how do we utilize it?

                We do this with the array indexing operator, which is the same symbol for
                the array definition and allocation length. This is how we access a
                particular \"element\" in an array:

                                arrayA[0];
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
