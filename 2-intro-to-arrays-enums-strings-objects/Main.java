import static java.lang.System.out;

public class Main {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 2: Intro to Arrays, Enums, Strings, and Objects
                ---------------------------------------------------------------------------
                """);

        arrays();
        enums();
        strings();
        objects();
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
                "\t\t%s\n",
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
                not being used by anything. This, though, comes with a downside: we have
                less direct control over the string; but a lot of times this is a good
                tradeoff.
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

                It's just the same as with primitives. We can then use the variable
                returned as such:

                            String returnedString = returningStrings();
                            out.println("Here is our returned string literal:\\n\\n\\t" +
                                    returnedString);
                """);

        return "I am a returned string!";
    }

    // --------------------------------------------------------------------------------------------
    public static void objects() {
        out.println("""
                ---------------------------------------------------------------------------
                        Introduction to Objects
                ---------------------------------------------------------------------------
                """);

        out.println("""
                We have now arrived at a titular moment: learning about objects. This is
                now when we learn about creating our OWN data types. Usually--up until we
                got to Strings and arrays--we have been working with primitive types (int
                double, etc.) but an object is a complex data type: it is made up of
                primitive types--or even other complex data types. An important note: a
                class must be defined in its own file! Check out the respective class'
                files in order to see their full definition. Let's first go through the
                definition of an object, also called a class. Here is the definition
                structure of a class:

                    <optional access modifier> <optional modifier> class <Name> {
                        // The Data Member List
                        <optional access modifier> <optional modifier> <data type> <name>;
                        ...
                    }

                We will now go over the above structure through an example; our Person and
                Point classes. Let's first look at our Point class:

                            public class Point {
                                public int x;
                                public int y;
                                ...
                            }

                The first word we see is \"public\". This keyword is the optional access
                modifier. The available modifiers are \"public\", \"private\", \"protected\"
                and nothing. These limit what other classes can even see the class being
                defined. We aren't really going to go over these until later in the course,
                so don't really worry about them. For our purposes right now, just make any
                class you are defining \"public\". Then we have the \"class\" keyword, which
                says that we are defining a class. After that in the name of the class in
                PascalCase. Then we have the opening and closing curly-brackets: between
                those brackets is the actually body--the code--of the class where all of its
                defined data and functions (or methods now) are defined and written. For the
                time being, we are going to be skipping methods until we talk about classes
                a bit more in-depth later. Let's talk about the data member definitions now.

                The data member definitions are that data that each object can hold. This
                allows us to group related data together into a single thing (type) since
                these pieces of data are logically related to each other. For example, a
                point in a 2D graph has an x and a y value: so to represent a point we need
                those pieces of data. A data member definition is almost exactly the same as
                a variable definition: you can even define and initialize that data; but for
                now we won't be doing that. We will only be defining and assigning later.

                <optional access modifier> <optional modifiers list> <type> <variable name>;

                The above is the syntax for a data member definition inside of a class. The
                optional access modifier is the same thing as the optional access modifier
                for a class, and obey the same rules: the only difference is that instead of
                what external classes can see the class, it is what external class can see
                that data member. Then you have the optional modifiers list. You can set a
                data member to be \"final\", meaning after being set it can never change for
                the life of the object, and \"static\" which means the data member is shared
                between every class instance--we'll get to this instance idea in a minute.
                Next, we have the data member's type, which again can be primitive or
                complex. Finally, we have the actual name of the data member in camelCase.
                Now, how do we actually set the values of the defined data members? This
                happens in the only method we will go over right now because it is so special
                and imperative to learn: the class constructor method.

                A constructor for a class is almost always public, and is the special method
                that your code uses to create what is called an \"instance\" of a class in
                your code when it is running--we'll get to this in a minute. The constructor
                structure is as such:

                        <optional access modifier> <class Name>(<a function argument list>) {
                            // Set the internal data members here and any other object
                            // initialization code.
                        }

                So, looking at our Point class as an example:

                            public class Point {
                                public int x;
                                public int y;

                                // The Constructor
                                public Point(int x, int y) {
                                    this.x = x;
                                    this.y = y;
                                }
                            }

                You can see here I have marked the constructor as public, and then we have
                the constructor name itself--which is just the same exact name as the class.
                We then have the matching argument list in the constructor to the data members
                in the class. This is extremely important: with out giving data to the
                constructor, the class instance (the object) won't be able to store any data.
                Now, something to note: the argument names inside of the constructor definition
                don't have to match the exact names of the data members; but the standard is to
                name them the same as the data members. Then, using that input data, we then
                need to use that data in our constructor to set the internal data members of
                that object. We now come to our next keyword: \"this\". The \"this\" keyword
                means, \"give me access to the current object instance.\" That then gives the
                developer the ability to read from or write to that data member. In the
                example's case, we are writing to the instance. So, now that we have the class
                setup, how do we actually use a class?

                To use a class we must make a variable for the instanciated object. Let's first
                define that variable:

                            Point point;
                """);
        Point point;

        out.println("""
                We now have a variable that can store a Point object. How do we create an
                object of type Point?

                            point = new Point(1, 2);
                """);
        point = new Point(1, 2);

        out.println("""
                Fantastic! We now have a Point variable, called point, that holds a Point
                object. Now, before we continue let's talk about the instance (object) vs.
                class business.

                A class in a template, a recipe by which to create an instance of that class
                (an object). So, a class shows what an object is made up of, what makes that
                thing a particular thing, while the object is a real individual of that thing.
                Let me demonstate this with a different class: the Person class.

                            public class Person {
                                public int age;
                                public String name;

                                public Person(int age, String name) {
                                    this.age = age;
                                    this.name = name;
                                }
                            }

                This class is a template to create a Person. A person has an age, and a name.
                Though, as you can imagine, this class isn't referring to a real individual
                person: this is just how we are representing a person. I want to, in my
                program, represent a person. How would I do this?


                            Person tom = new Person(40, "Tom");
                            Person harry = new Person(30, "Michael");
                """);
        Person tom = new Person(40, "Tom");
        Person harry = new Person(30, "Michael");

        out.println("""
                As you can see here, we are creating a person (object) from our Person
                template (class). Each instance of a Person is held within a Person variable.
                Now you can see how the class is a template, and how the usage of that class is
                an object (instance).

                Now that we have objects, how would we use them? This is done mostly by using
                methods that are a part of a class, or by accessing data members. For example,
                I can output the names and ages of a Person:

                            out.println(tom.name + " is " + tom.age + " years old.");
                            out.println(harry.name + " is " + harry.age + " years old.");
                """);
        out.println(tom.name + " is " + tom.age + " years old.");
        out.println(harry.name + " is " + harry.age + " years old.");

        out.println("""

                I could even do it like this, which is much better:
                
                        public static void personAnnounce(Person person) {
                            out.println(person.name + " is " + person.age + " years old.");
                        }

                With that function I can then use it like this:

                            personAnnounce(tom);
                            personAnnounce(harry);
                """);
        personAnnounce(tom);
        personAnnounce(harry);

        out.println("""

                With the function personAnnounce(), I can then pass in any Person variable and
                have it output a Person object's data the same no matter what Person is passed
                in! This is very useful. By making a class, and then using it to create objects,
                we are able to group together data that should be grouped into a singular,
                logical unit so that it is easier to reason about, and access for the computer.
                """);
    }
    
    // --------------------------------------------------------------------------------------------
    public static void personAnnounce(Person person) {
        out.println(person.name + " is " + person.age + " years old.");
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
