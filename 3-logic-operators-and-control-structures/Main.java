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

        theOrOperator();
        theAndOperator();
    }

    // --------------------------------------------------------------------------------------------
    public static void theOrOperator() {
        out.println("""
                ---------------------------------------------------------------------------
                            The OR (||) Operator
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The OR operator can be thought of as the binary addition of 2 numbers.
                Let's consider A = 1 and B = 0; if we add them together A + B, we get 1
                because 0 + 1 = 1. Now, let's consider 1 + 1. When we add those together we
                would get a binary representation of 10 (not to be confused with ten but
                literally one-zero); we can get rid of the 0 and now we simply have 1. So,
                1 + 1 = 1. What if both A and B were 0? 0 + 0 = 0, so we have false. This
                is more-or-less how the operator works; we add the 2 boolean
                representations to get a new boolean.

                            The Logical OR's Truth Table.
                            | A     | B     | A || B |
                            |-------|-------|--------|
                            | false | false | false  |
                            | false | true  | true   |
                            | true  | false | true   |
                            | true  | true  | true   |
                """);

        boolean a = false;
        boolean b = false;
        boolean aOrB = a || b;
        out.printf("false || false = %i\n", aOrB);

        boolean c = false;
        boolean d = true;
        boolean cOrD = c || d;
        out.printf("false || true = %i\n", cOrD);

        boolean e = true;
        boolean f = true;
        boolean eOrF = e || f;
        out.printf("true || true = %i\n", eOrF);
    }

    // --------------------------------------------------------------------------------------------
    public static void theAndOperator() {
        out.println("""
                ---------------------------------------------------------------------------
                            The AND (&&) Operator
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The AND operator can be thought of as the binary multiplication of 2
                numbers. Let's consider A = 1 and B = 0; if we multiply them together
                A * B, we get 0 because 1 * 0 = 0. Now, let's consider 1 * 1. When we
                multiply those together we would get 1; so, 1 * 1 = 1. What if both A and B
                were 0? 0 * 0 = 0, so we have false. This is more-or-less how the operator
                works; we multiply the 2 boolean representations to get a new boolean.

                            The Logical AND's Truth Table.
                            |   A   |   B   | A && B |
                            |-------|-------|--------|
                            | false | false | false  |
                            | false | true  | false  |
                            | true  | false | false  |
                            | true  | true  | true   |
                """);

        boolean a = false;
        boolean b = false;
        boolean a_and_b = a && b;
        out.printf("false && false = %i\n", a_and_b);

        boolean c = false;
        boolean d = true;
        boolean c_and_d = c && d;
        out.printf("false && true = %i\n", c_and_d);

        boolean e = true;
        boolean f = true;
        boolean e_and_f = e && f;
        out.printf("true && true = %i\n", e_and_f);
    }

    // --------------------------------------------------------------------------------------------
    public static void theEqualsToOperator() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"Is Equal To\" Operator
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The \"is equal to\" operator is quite simple; it simply asks a question and
                then provides the answer: \"is the left thing equal to the right thing?\"
                If the 2 things are equivalent, then true is returned from the operation,
                otherwise false is returned from the operation.

                An important note is that the == operator can be used on type (primitive or
                complex) and there are certain caveats. First, let's talk about a caveat
                with primitive types. Floating point number precision errors can mess up
                the comparison, so a \"close enough\" comparison should be utilized. Also,
                an entire object should NOT be compared to another object of the same type
                using the == operator. Only its data members should be compared one at a
                time for over all object equivalence; therefore, to compare objectes you
                should to make a method to do it: basically every standard library class,
                like Strings, have an Equals() method on it that will compare the internals
                for equivalence--which as I just explained is the way to compare objects.
                Notice, though, I have been saying you \"should not\" use the == operator
                to compare objects: I never said you can't. The thing is, it's a bug to do
                so. You are comparing the address--the pointer--of the object, not the
                object itself: this is why the Equals() method of an object is used.

                Also, arrays cannot utilize the == operator to compare the whole array's
                contents. You have to search the whole array and compare the 2 for
                equivalence.

                            |   A   |   B   | A == B |
                            |-------|-------|--------|
                            | false | false |  true  |
                            | false | true  |  false |
                            | true  | false |  false |
                            | true  | true  |  true  |
                """);

        out.printf("false == false = %i\n", false == false);
        out.printf("true == false = %i\n", true == false);
        out.printf("2 == 5 = %i\n", 2 == 5);
        out.printf("10 == 10 = %i\n", 10 == 10);
    }

    // --------------------------------------------------------------------------------------------
    public static void theNotOperator() {
        out.println("""
                ---------------------------------------------------------------------------
                            The NOT (!) Operator
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
