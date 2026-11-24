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
        controlStructures();
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
        theEqualsToOperator();
        theNotOperator();
        theNotEqualsOperator();
        theRelationalOperators();
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

        out.println("""
                The NOT operator is also pretty simple. All it does is flip the logical
                value. So, if something is true it is now false (not true) and something
                that is false is now true (not false). Unlike the == operator it will only
                work on primitive types, so it cannot be used for objects and can only be
                used on their data members. Using the ! operator on arrays (not the
                array element) will behave like an object.

                            |   A   |  !A   |
                            |-------|-------|
                            | false | true  |
                            | true  | false |
                """);

        out.printf("!true = %i\n", !true);
        out.printf("!false = %i\n", !false);
        out.printf("!(5 == 10) = %i\n", !(5 == 10));
        Object o = null;
        Object o2 = new Object();
        out.printf("!(o == null) = %i\n", !(o == null));
        out.printf("!(o2 == null) = %i\n", !(o2 == null));
        int[] a = new int[10];
        out.printf("!(a == null) = %i\n", !(a == null));
    }

    // --------------------------------------------------------------------------------------------
    @SuppressWarnings("all")
    public static void theNotEqualsOperator() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"Is Not Equal To\" (!=) Operator
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Comparing if something is not equal to something else is quite common in
                programming, so common that the Java language desingers decided to make a
                shortcut for !(A == B). To do this, they introduced != to the logical
                operator list. All it simply does is invert the operation of the ==
                operator.

                            |   A   |   B   | A != B |
                            |-------|-------|--------|
                            | false | false | false  |
                            | false | true  | true   |
                            | true  | false | true   |
                            | true  | true  | false  |
                """);

        out.printf("false != false = %i\n", false != false);
        out.printf("true != false = %i\n", true != false);
        out.printf("2 != 5 = %i\n", 2 != 5);
        out.printf("10 != 10 = %i\n", 10 != 10);
    }

    // --------------------------------------------------------------------------------------------
    public static void theRelationalOperators() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"Relational\" (<, >, <=, >=) Operators
                ---------------------------------------------------------------------------
                """);

        out.println("""
                These operators compare values to each other and don't really have truth
                tables associated to them. Basically, they do what is written on their
                respective boxes. The < operator asks if the left value is less than the
                right value; the > operator asks if the left value is greater than the
                right value; the <= operator asks if the left value is less than or equal
                to the right value; and the >= operator asks if the left value is greater
                than or equal to the right value. Depending on the relational comparison,
                true or false is output.
                """);

        out.printf("1 > 2 = %i\n", 1 > 2);
        out.printf("1 < 2 = %i\n", 1 < 2);
        out.printf("1 <= 2 = %i\n", 1 <= 2);
        out.printf("1 >= 2 = %i\n", 1 >= 2);
        out.printf("3 >= 3 = %i\n", 3 >= 3);
    }

    // --------------------------------------------------------------------------------------------
    public static void controlStructures() {
        out.println("""
                ---------------------------------------------------------------------------
                        The Control Structures
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Control structures take advantage of logical operators to conditionally
                control the execution of certain code blocks.
                """);

        ifStatements();
        switchStatements();
        whileLoops();
        forLoops();
        doWhileLoops();
        // tryCatchFinally();
    }

    // --------------------------------------------------------------------------------------------
    public static void ifStatements() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"if\" Statement
                ---------------------------------------------------------------------------
                """);

        out.println("""
                \"if\" statements control the flow of code execution. Depending on their
                resolution, certain blocks of code can execute. This allows you, the
                developer, to give conditional logic to your program; this allows your
                program to make decisions that you allow. Your program can \"think.\"
                """);

        if (true)
            out.println("I am true");

        if (false)
            out.println("I won't execute because the if will resolve to false.");
        else
            out.println("""
                    I will be executed because my brother \"if\" resolved to false\n"
                    and now I will execute."
                    """);

        if (false)
            out.println("I won't execute because the if will resolve to false.");
        else if (true)
            out.println("""
                    I will execute because I have my own \"if\" that resolves to true.
                    """);
        else
            out.println("I won't execute because my brother \"if\" resolved to true.");

        if (false) {
            out.println("I won't execute because the if will resolve to false.");
        } else if (false) {
            out.println("I will not execute because my \"if\" resolved to false.");
        } else {
            out.println("""
                    I will execute because all the other \"if\" statements failed to
                    resolve to true; so, it defaults to me.
                    """);
        }
    }

    // --------------------------------------------------------------------------------------------
    public static void switchStatements() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"switch\" Statement
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The \"switch\" statement is a simplified series of \"if\" statements.
                It will only work on numbers types and matches exactly on that
                number, so it is not exactly useful for floating point types. It will
                work on integers types and enums, and technically works on boolean
                types; though, it is not as useful for that. It also works on the
                char data type since characters are just numbers mapped to
                characters. Really, it's purpose is to test a series of things and
                then execute certain code.
                """);

        int i = 1;
        switch (i) {
            case 1:
                out.println("i is 1.");
                break;
            case 2:
                out.println("i is 2; which won't happen in this case.");
                break;
            default:
                out.println("The default case, we'll get to this in a second.");
                break;
        }

        out.println("""
                  \nAs you can see, we use the \"break\" statement at the end of each
                  \"case\" block. This is important. If we don't do this, then the next
                  \"case\" block is executed until we hit a \"break\". Let me show that.
                """);

        int d = 1;
        switch (d) {
            case 1:
                out.printf("case 1 :: d = %i\n", d);
            case 2:
                out.printf("case 2 :: d = %i\n", d);
                break;
            default:
                out.println("The default case, we'll get to this in a second.");
                break;
        }

        out.println("""
                  The \"default\" case is there for when no other case can be executed
                  because none of the \"case\" statements matched. It is particularly
                  useful when handling errors.
                """);

        char c = 'z';
        switch (c) {
            case 'a':
                out.println("case a.");
                break;
            case 'b':
                out.println("case b.");
                break;
            default:
                out.printf("default case :: c = %c\n", c);
                break;
        }

        out.println("""
                 \nThe \"switch\" statement is especially useful when used with
                 enums!
                """);

        enum Color {
            RED, GREEN, BLUE
        }
        ;
        Color color = Color.BLUE;
        switch (color) {
            case RED:
                out.println("Execute RED code.");
                break;
            case GREEN:
                out.println("Execute GREEN code.");
                break;
            case BLUE:
                out.println("Execute BLUE code.");
                break;
        }
    }

    // --------------------------------------------------------------------------------------------
    public static void whileLoops() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"while\" Loop
                ---------------------------------------------------------------------------
                """);

        out.println("""
                   This is our first loop kind. Loops are used to iterate over sets of data and to
                   gather input from a user until we decide to leave the loop. The way we express
                   these loops in words is kind of like this:
                                 \"While 'x' is true, do 'y'.\"
                   Loops, like \"while,\" need to be left and entered using some kind of
                   condition. Here, again, we can use our conditional operators. Let's see how we
                   can iterate and do some counting up to a number.
                """);

        int i = 0;
        final int END = 10;
        while (i <= END) {
            out.printf("i = %i\n", i);
            i++;
        }

        out.println("""
                As you can see, we counted until 10. We can write this same loop using the
                \"break\" statement. This word allows us to exit the loop from the body of the
                loop. It is very useful for input loops. We have to execute the infinite
                \"while\" loop using while(TRUE) which will run for infinity (or until
                stack-overflow or no more memory) because the conditional statement always
                evaluates to true. It is a best-practice to check the loop exit condtion at
                the beginning of the loop for \"while\" loops; they can technically be anywhere
                though and depends on the required logic.
                """);

        int d = 0;
        final int SENTINEL = 10;
        while (true) {
            if (d > SENTINEL)
                break;

            out.printf("d = %i\n", d);
            d++;
        }

        out.println("""
                Sometimes, there are instances where we need to skip a loop iteration. This
                is done using the \"continue\" keyword. Let's use this keyword to skip the
                number 3 in a loop until 10.
                """);

        int f = 0;
        while (f <= END) {
            if (f == 3) {
                f++;
                continue;
            }

            out.printf("f = %i\n", f);
            f++;
        }

        out.println("""
                I usually don't use \"while\" loops; the only reason being that I find the
                other loops to be more useful.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void forLoops() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"for\" Loop
                ---------------------------------------------------------------------------
                """);

        out.println("""
                The \"for\" loop is very similar to the \"while\" loop, but it simply handles
                counting for us. Let's take an example loop that counts to 10.
                """);

        for (int x = 0; x <= 10; x++) {
            out.printf("x = %i\n", x);
        }

        out.println("""
                This loop can be expressed in language as such:
                      \"For integer 'x', while 'x' is less than or equal to 10, then do something,
                       and then increment 'x'.\"
                """);

        out.println("""
                The \"for\" loop allows us to declare and initialize a loop counter, check some
                condition that usually uses the counter, and then something to execute at the
                end of the iteration, which usually consists of incrementing the loop counter by
                1. We can also initialize more than 1 thing in the initialization section of the
                \"for\" loop.
                """);

        for (int x = 0, END = 10; x <= END; x++) {
            out.printf("x = %i\n", x);
        }

        out.println("""
                We can also make an infinite \"for\" loop. There used to be certain compiler
                optimizations that were in favor of the infinite \"for\" loop; but now-a-days
                they are the same performance wise.
                """);

        final int SENTINEL = 10;
        int x = 0;
        for (;;) {
            if (x > SENTINEL)
                break;

            out.printf("x = %i\n", x);
            x++;
        }

        out.println("""
                As you can see, we can use the \"break\" keyword in \"for\" loops. We can also
                use the \"continue\" keyword.
                """);

        for (int i = 0, END = 10; i <= END; i++) {
            if (i == 3)
                continue;

            out.printf("i = %i\n", i);
        }
    }

    // --------------------------------------------------------------------------------------------
    public static void doWhileLoops() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"do-while\" Loop
                ---------------------------------------------------------------------------
                """);
        out.println("""
                The \"do-while\" loop is nearly identical to the \"while\" loop. The
                difference is that the loop's conditional check happens after the first
                iteration, and not the beginning of the loop. Let's count to 10 again:
                """);

        int x = 0;
        final int END = 10;
        do {
            out.printf("x = %i\n", x);
            x++;
        } while (x <= END);

        out.println("""
                This loop is particularly useful for user input loops. I'll model that up
                with strings.
                """);

        // TODO make a more java, real user input loop.
        do {
            char[] input = new char[50];
            char SENTINEL = '\n';

            // Gather input from the user.
            input[0] = SENTINEL;

            if (input[0] == SENTINEL)
                break;

            // Do some stuff with the user's input.
        } while (true);

        out.println("""
                This loop allows the user to first enter input, and then we are able to
                check that input. We can also use \"break\" and \"continue\" in \"do-while\"
                loops. I won't show it here though.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void tryCatchFinally() {
        out.println("""
                ---------------------------------------------------------------------------
                            The \"try-catch\" and \"try-catch-finally\" Statement
                ---------------------------------------------------------------------------
                """);

        out.println("""
                This is the final control structure we will go over. It has to do with
                errors and how we account for and handle them. Errors are a particular
                thing in Java: they are called \"Exceptions\" and are a type of \"Object\".
                We are going to have to have a small tangent to understand a few things.

                Exceptions are states in the program where errors have occurred. 
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
