import static java.lang.System.out;

public class Main {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 2: Intro to Arrays, Enums, and Strings
                ---------------------------------------------------------------------------
                """);

        arrays();
        enums();
        strings();
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
                the open and close square brackets with the length of the array on the
                inside of those brackets. At this point, we now have a contiguous block of
                allocated memory for our data: how do we utilize it?

                We must first see how to access data inside of the array. To do this with we
                use the array indexing operator, which is the same symbol for the array
                definition and allocation length. This is how we access a particular
                \"element\" in an array:

                                arrayA[0]

                Now that we have a way to access elements in the array, we can now talk
                about writing to the array: the current array, arrayA, has no data. We use
                the assignment operator to assign into the array at a given element like
                this:

                                arrayA[0] = 1;
                """);
        arrayA[0] = 1;

        out.println("""
                This puts the number 1 inside of the first element inside of arrayA. Ok, you
                may have noticed I said the first element, but why is the first element 0
                and not 1? This is because is most programming languages, Java included,
                array indexing is 0 based. So, array indexing is counted as such: 0, 1, 2,
                3, ..., 8, 9. That's how you'd count to the last element inside of the
                arrayA array.

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
                that length anytime we want no matter where or when the array is being
                used? We do this with a data member that is a part of the array. That
                member is called length and we access it with the dot (.) operator:

                            // arrayA.length
                            out.println("arrayA.length is " + arrayA.length);
                """);
        // arrayA.length
        out.println("\t\tarrayA.length is " + arrayA.length);

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

        out.println("""
                We now start getting into making our own types. An enumeration is a way to
                define named, constant, symbols that are grouped together by a common idea.
                Let's go over this with an example. At the top of this file I have used the
                enum keyword; after that we give the enumeration name; and finally define
                enumeration values. Now, how then do we use this enum? Like any other type
                really, with one caveat: we can only assign the values that we have defined
                as a part of the enum to a variable of our enum type. Let's see this in
                practice:
                            Color background = Color.RED;
                """);
        @SuppressWarnings("unused")
        Color background = Color.RED;

        out.println("""
                Look at that! Pretty neat right! We can make grouped symbols with symbolic
                values. Now, why would we do this? For one, we can make certain limited
                symbols valid for ourselves and other developers to use: everyone knows the
                values because we have defined the values! This is particularly useful for
                error codes. We could have an enum defined for error codes and return that
                enumeration type from a validation function so that we can get specific
                errors without having to memorize error code integers.

                How though, are enumerations stored in memory? They need to be something.
                They are special objects. We will be diving more into that later, just know
                for now that is what they are.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void strings() {
        out.println("""
                ---------------------------------------------------------------------------
                        Strings
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Finally, we'll go over some string basics. Strings in Java are full on
                objects. They are complicated internally, and there is quite a bit going
                on, but I still want you to have a solid grasp on what they are. Internally
                a string is an immutable character array: this means once a string is
                created it can never be changed. The number of characters in this array is
                also known, and is stored as the length of the string. This enables us to
                iterate over characters in the array and know where it ends, and do many
                other operations. The character encoding of Java strings is UTF-16: we have
                a lot of characters that we have access to.
                """);

        stringDeclarations();
        String string = "Foo bar";
        stringToFunctions(string);
        String returnedString = returningStrings();
        out.println(String.format("Here is our returned string literal:\n\n" +
                "\t\t%s\n\n",
                returnedString));
    }

    // --------------------------------------------------------------------------------------------
    public static void stringDeclarations() {
        out.println("""
                ---------------------------------------------------------------------------
                            Declaring String Variables
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Strings can be created in many different ways. Since they are an object,
                they are a complex data type, essentially they aren't primitive. Now, since
                strings, internally, are specialized character arrays, we can create a
                String object from a character array. Here is how we'd do it:

                            char[] sChars = { 'H', 'e', 'l', 'l', 'o', ',', ' ',
                                'W', 'o', 'r', 'l', 'd', '!', '\0' };
                            String s = new String(sChars);
                """);

        char[] sChars = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\0' };
        String s = new String(sChars);

        out.printf("\t\tsChars = %s\n\n", s);
        out.println("""
                As you can see, printf() stops when the end is reached: this occurs because
                the length is known at creation of the string. That way, when operations
                are done on the string, like printing it, the code knows when to stop.
                Since a String is an object, we don't need to write a lot of string code
                ourselves--even though at times it is quite trivial. These functions--or
                methods--are a part of the object and are accessed with the dot (.)
                operator; we can even access certain data associated with the string when
                given access through a method. One of these pieces of data is the length.
                Let's use it here:

                            out.printf("len = %d\\n\\n", s.length());
                """);
        out.printf("\t\tlen = %d\n\n", s.length());
        out.println("""
                As you can see, we grab the length by calling the length() method. It's
                similar to how we'd call a function, but a method is attached to an object,
                like our String.
                """);

        out.println("""
                Ok, moving onto more ways to create Strings. The most common way to create
                a string is with a string literal. We don't need to make a char array when
                doing it like this. Here is what it'd look like:

                            String s2 = "Foo";
                """);
        String s2 = "Foo";
        out.printf("s2 is now:\n\n\t\t%s\n\n", s2);

        out.println("""
                Declaring and initializing in this way is far more common. A whole String
                object is automatically created for us. An interesting point: really, all
                of these println() and format strings for printf() are string literals.
                The only difference is they are not assigned to a variable.

                            String text = "Really, I can also write like this and then "+
                                "give it to println().\\n";
                            out.println(text);
                            String formatString = "I can even do this! My favorite " +
                                "number is %d.\\n\\n";
                            out.printf(formatString, 50);
                """);

        String text = "Really, I can also write like this and then give it to println().\n";
        out.println(text);
        String formatString = "I can even do this! My favorite number is %d.\n\n";
        out.printf(formatString, 50);

        out.println("""
                Strings in Java are immutable, meaning once created they cannot be changed.
                You can, however, build one up character by character using StringBuilder,
                which allows you to build a String manually or iteravily:

                            char c = 'a';
                            StringBuilder sb = new StringBuilder();
                            sb.append(c);
                            sb.append(c);
                            sb.append(c);
                            String built = sb.toString();
                """);

        char c = 'a';
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(c);
        sb.append(c);
        String built = sb.toString();
        out.printf("And the built string is now:\n\n\t\t%s\n\n", built);

        out.println("""
                Since Java manages memory for us, there is no risk overflowing our string's
                internal char array, printing garbage, or leaving a string around when it's
                not being used by anything. This, though, comes with a downside: we have less
                direct control over the string; but a lot of times this is a good tradeoff.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void stringToFunctions(String s) {
        out.println("""
                ---------------------------------------------------------------------------
                            Passing String Variables to Functions
                ---------------------------------------------------------------------------
                """);
        out.println("""
                Passing a string to a function is like passing any other primitive type to
                a function. You declare that a function needs a string, and then in the
                calling side you pass that string to it. This is simply how you do it:

                            String string = "Foo bar";
                            stringToFunctions(string);

                There are some other details in this process that we will go over when
                learning about objects; but until then we will not say anything further.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static String returningStrings() {
        out.println("""
                ---------------------------------------------------------------------------
                            Returning Strings
                ---------------------------------------------------------------------------
                """);

        out.println("""
                Returning strings is just the same as returning a primitive type from a
                function. You can use either a variable, like this:

                            String foo = "foo";
                            return foo;

                Or you can return a string with a literal:

                            return "foo";

                It's just the same as with primitives. We can then use the variable returned
                as such:

                            String returnedString = returningStrings();
                            out.println("Here is our returned string literal:\\n\\n\\t" +
                                    returnedString);
                """);

        return "I am a returned string!";
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
