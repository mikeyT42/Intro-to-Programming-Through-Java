import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 2: Intro to Arrays, Enums, and Strings
                ---------------------------------------------------------------------------
                """);

        arrays();
        enums();
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
                is defined with the \"[]\" (open and close square brackets). That one pair
                of symbols attached to the variable's type turns the variable from a single
                thing of whatever that type is into an array of whatever that type is. Now,
                all that we have done though is define an array variable, but nothing has
                been allocated. There is no contiguous block nor has there been any values
                put in them especially because there are no contiguous \"boxes\" to put them.
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
                the open and close square brackets with the length of the array on the inside
                of those brackets. At this point, we now have a contiguous block of allocated
                memory for our data: how do we utilize it?

                We must first see how to access data inside of the array. To do this with we
                use the array indexing operator, which is the same symbol for the array
                definition and allocation length. This is how we access a particular
                \"element\" in an array:

                                arrayA[0]

                Now that we have a way to access elements in the array, we can now talk about
                writing to the array: the current array, arrayA, has no data. We use the
                assignment operator to assign into the array at a given element like this:

                                arrayA[0] = 1;
                """);
        arrayA[0] = 1;

        out.println("""

                This puts the number 1 inside of the first element inside of arrayA. Ok, you
                may have noticed I said the first element, but why is the first element 0 and
                not 1? This is because is most programming languages, Java included, array
                indexing is 0 based. So, array indexing is counted as such: 0, 1, 2, 3,
                ..., 8, 9. That's how you'd count to the last element inside of the arrayA
                array.

                Ok, now how do we read from the array? We do this by still using the array
                indexing syntax, but instead of on the left side of the assignment, we go to
                the right side. Let's take an example and assign what's in the first element
                of arrayA into a variable:

                                int b = arrayA[0];
                """);
        @SuppressWarnings("unused")
        int b = arrayA[0];

        out.println("""
                We can also use the same syntax to just directly use what is inside of the
                array: let's take an example of printing what's in our array to the screen:

                        out.println("The first element inside arrayA = " + arrayA[0]);
                """);
        out.println("The first element inside arrayA = " + arrayA[0]);

        out.println("""
                Ok, now one final thing. An array has a given length and it is that length
                we provide when creating the array with the new keyword; but, how do we get
                that length anytime we want no matter where or when the array is being used?
                We do this with a data member that is a part of the array. That member is
                called length and we access it with the dot (.) operator:

                            // arrayA.length
                            out.println("arrayA.length is " + arrayA.length);
                """);
        // arrayA.length
        out.println("arrayA.length is " + arrayA.length);

        out.println("""
                That's about it for arrays right now until we get a bit more advanced later
                on. We will now continue to enumerations.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void enums() {
        out.println("""
                ---------------------------------------------------------------------------
                        Enumerations
                ---------------------------------------------------------------------------
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
