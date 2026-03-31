import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                    Chapter 1: An Introduction to Programming Through Java
                ---------------------------------------------------------------------------
                """);
        goalsOfThisCourse();
        whatIsAProgram();
        compilation();
        execution();
        whatIsSyntax();
        someGeneralSyntax();
    }

    // --------------------------------------------------------------------------------------------
    public static void goalsOfThisCourse() {
        out.println("""
                ---------------------------------------------------------------------------
                        Goals of this Course
                ---------------------------------------------------------------------------

                The goals of this course is to introduce software engineering. I have
                chosen to do this through the language Java because it forces us to use the
                same language we will be using in FRC. There are simpler programming
                languages syntactically, like C, but the priority of this course is
                preparation for the competition.

                We will learn good coding habits, like proper and clear formatting, and
                ways to structure simple programs. We will go over the various memory
                mechanisms available to us: we will go over the stack vs. static vs. heap
                memory. We will also go over the kind of data that we can use. We will go
                over error handling through Exceptions. We will go over things that will
                lay a decent foundation--you'd learn more foundations in C--though Java is
                a good place to start.

                This course will adhere to some of the standards of the Java community. All
                defined objects--and therefore file names--will begin with an uppercase
                character. We will also be using camelCase for everything except class
                names: class names will be PascalCase. I will also be forcing a strict way
                of formatting our code. All function definitions wil have a function
                seperator: look at this whiteboard file to see what I mean. I expect this
                formatting to be adhered to because I believe it allows for better writing
                habits.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void whatIsAProgram() {
        out.println("""
                ---------------------------------------------------------------------------
                        What is a Program
                ---------------------------------------------------------------------------

                A simple question, but a very good starting point, is \"what is a
                program?\" A program is a set of instructions for a computer to execute. In
                the most basic sense, that is all. Programs can do anything we want them
                to, as long as we can actually write them. A program, though, is not just
                for the computer.

                We use a programming language to write these instructions. There are
                various languages that we can use: some are difficult to write, some are
                more terse, some are more verbose, some are more esoteric, and some are
                simple. These languages are not just a way to interact with the computer,
                but also a way to interact with other developers. These instructions that we
                write are not just read by the computer, but they are read by other
                developers; these programs are altered by other developers; these programs
                need to be able to be understood by other developers. This is why we have
                programming languages. We could just write programs in machine code, but we
                choose to write programs using language so that it is more ergonomic and
                easily understood by both ourselves and others. This is why we have
                Assembly, Java, C, and the thousands of other languages. So, a program is a
                set of instuctions for the computer and for humans.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void compilation() {
        out.println("""
                ---------------------------------------------------------------------------
                        Compilation
                ---------------------------------------------------------------------------

                How does our code that we write--in our case Java--become something that
                the computer can understand? There is a program called a \"compiler\" that
                turns our Java source code into what the computer can understand. The Java
                compiler first turns the Java we wrote into what is called \"JVM (java-
                virtual-machine) bytecode.\" This bytecode is the final output of the
                compiler: though, then, how does this get executed by the computer because
                the computer does not understand jvm bytecode? There is a middle program,
                called the JRE (the Java Runtime Environment) that constantly runs
                whenever a Java program is being run. The JRE is a \"translator\" that
                turns the pre-compiled JVM bytecode into machine code for the computer
                that it is being run on. This is what enables compiled Java code to be able
                to be run on any type of machine that has a built JRE.

                This is a huge advantage over fully compiled languages, like C, where you
                have to compile for the machine you want to run on. This one thing enabled
                Java's wide spread adoption during the website revolution in the late 90's
                and early 2000's.

                Now, what does the Java compiler do other than make JVM bytecode; or
                really, how does the compiler go from Java source code to JVM bytecode? I
                am really going to only give a broad-stroke overview, what the compiler
                does is quite a bit with many internal steps. First, it copies the full
                name of the classes imported to all of the places the short name is used.
                That is used in the type-checking process: which is next. After that, it
                parses your code for any syntax issues. Basically after that point, it
                creates the JVM bytecode for that particular file.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void execution() {
        out.println("""
                ---------------------------------------------------------------------------
                        How Does a Program Execute?
                ---------------------------------------------------------------------------

                Code executes one step at a time. This is most often one line at a time:
                there are certain exceptions to this that'll we'll go over later. The
                program starts in the \"Main\" class' \"main\" function. The main function
                in Java always looks exactly the same as I have it written above. There is
                a lot of syntax in just the main function's definition that I do not expect
                or even want you to know yet--this is one of those things where Java's
                syntax is a bit heavy for beginners that we have to wave away.

                The lines inside the main function are then executed one line at a time.
                Any function calls, like println() or clear() or goalsOfThisCourse(), are
                \"called\" in order inside of main. When a function is called, the program
                then \"moves\" into that function being called and the steps continue. Once
                the end of the called function reaches its end, like lets say after
                goalsOfThisCourse() calls println(), the end of the function is reached.
                The program then returns from the function, back upwards into the calling
                function, in our case main. The main function then continues to the next
                line, going into any functions that are next until the end of the main
                function, which then returns and exits the program.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void whatIsSyntax() {
        out.println("""
                ---------------------------------------------------------------------------
                        What Is Syntax?
                ---------------------------------------------------------------------------

                What does \"syntax\" mean? This word describes the words and symbols
                we use to write in our programming language, along with the structure
                of the symbols to create statements. For example, we use the parentheses to
                say that a name is a function. We will go over a ton of syntax. These words
                we use are the building blocks of any language, human or computer. They
                describe the words and grammar rules to create sentences.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void someGeneralSyntax() {
        out.println("""
                ---------------------------------------------------------------------------
                        Some General Syntax
                ---------------------------------------------------------------------------

                All programming statements end with a semicolon. This tells the compiler
                that we reached the end of a statement. Do NOT forget to put a semicolon.
                The program will not compile with out them. If you forget you will get some
                really strange compilation errors.

                Since code is meant not just for computers, but for humans as well, we
                sometimes need to communicate something to humans that the computer will
                not be able to execute. These are called comments. We have to ways to make
                comments: a single-line comment and a multiline block comment. I'll show
                you the first way.

                // This is a single line comment. We make it with the forward slashes.
                """);
        // This is a single line comment. We make it with the forward slashes.

        out.println("""
                Single-line comments are meant to be only on one line. You can technically
                write a bunch of them on multiple lines. But, that is what the block
                comment is for. I'll show you what that looks like.

                /*
                 * This is a multiline block comment!
                 * We define it with the forward slash and then the star symbol. Every new
                 * line starts with a star symbol. It ends with a star and forward slash
                 * adjacent to each other.
                 */
                """);
        /*
         * This is a multiline block comment!
         * We define it with the forward slash and then the star symbol. Every new
         * line starts with a star symbol. It ends with a star and forward slash
         * adjacent to each other.
         */

        out.println("""
                Comments are a good way to communicate weird things that the code is
                doing. Comments should NOT explain the code. They should simply be used
                to document code for other readers, or they should be used to explain
                something unorthodox that is being done.

                At the top of this file you may notice this:

                        import static java.lang.System.out;

                This is a static import of the out static member of the System object
                that is a part of the java.lang package. This enables us to use the out
                member without having to type System. This shortens this line:
                                    System.out.println();
                to:
                                    out.println();
                which is much less annoyingly long to type. You can only statically
                import a static data member of a class. To find these you'd have to
                just try it, or look at the docs for the class; in this case System.

                Another kind of import is the normal import which does not use the static
                keyword. This normal import allows us to not use the fully qualified name
                of any other class in our code. This turns something like:
                                    java.io.File f = new java.io.File();
                into:
                                    File f = new File();
                The import statement allows us to do that second example's shorthand.
                """);

        declaringAndDefiningVariables();
        operators();
    }

    // --------------------------------------------------------------------------------------------
    public static void declaringAndDefiningVariables() {
        out.println("""
                ---------------------------------------------------------------------------
                            Declaring and Defining Variables
                ---------------------------------------------------------------------------

                Variable definitions come in 2 flavors: local variables defined inside of
                functions, and class member fields, or members, defined as a part of a
                class. The latter we will go over later when we talk about classes, so for
                the time being let's go over the local variables first.

                First, there are local varible definitions. Variables defined in functions
                have this syntax (omit the first <>):
                            <optional modifier> <type> <variable name>;
                Let's define a variable with a simple definition:
                            int myInteger;
                """);

        int myInteger;

        out.println("""
                This is a variable named myInteger with a type of int, meaning it is an
                integer (whole) number. This variable has no data, it has simply been
                defined. Let's assign it some initial data:
                            myInteger = 10;
                """);
        myInteger = 10;

        out.println("""
                Now, the variable myInteger has inside of it the value 10. What do I mean
                by \"inside\" though? All variables are stored in memory, so I want you to
                think of all variables as a \"box\". The variable itself is the \"box\"
                and initially a \"box\" has nothing inside of it: we have to put
                something inside of it. That is where assignment comes in: we actually
                put something in the box we have just created. So, when defining a
                variable we tell the computer to set asside a box big enough for our data
                and then when we assign to that variable we tell the computer to put
                inside that box the data we want.

                Now, how do we actually assign? I brushed past it, but this is our first
                operator that we will be learning of. The \"assignment operator\" is the
                \"=\" sign. The variable goes on the left side of the operator, and the
                value, or even another variable, goes on the right side of the operator.
                The right value, or value of another variable, goes into the variable on
                the left.

                Ok, let's now see the value is inside of myInteger:
                """);
        out.println(
                "           myInteger is " + myInteger);

        out.println("""
                Now, we can also define and assign in the same statement. This is called
                defining and initializing a variable. We can do it like this:
                            int myInteger2 = 50;
                """);
        int myInteger2 = 50;

        out.println("""
                Let's see what is inside of myInteger2:
                """);
        out.println(
                "           myInteger2 is " + myInteger2);

        out.println("""
                Now, we can get to the optional modifier business. In Java, local
                variables only have one modifier, the \"final\" keyword. Let's make our
                first one:
                            final int MY_CONSTANT = 20;
                            final int MY_CONSTANT2;
                            MY_CONSTANT2 = 70;
                """);
        final int MY_CONSTANT = 20;
        final int MY_CONSTANT2;
        MY_CONSTANT2 = 70;

        out.println("""
                The final keyword marks that variable as un-assignable after it has been
                given an inital value, essentially, you can't assign to it twice. You may
                wonder though about MY_CONSTANT2: how come we can assign to it after it
                has been defined? Well, because an initial value hasn't been given we can
                assign to it afterwards, we just won't be able assign to it again. If that
                \"final\" rule is broken, then we get a compilation error. Now, your
                initial thought may be why introduce something that can give compilation
                errors to your code? For one simple reason, certain guarantees around
                data \"immutability.\"

                This is where the value of the final keyword comes in. Let's say we have a
                variable we don't want any other code to change? Someone--including
                yourself--could change the value inside that variable unless we mark it as
                final, therefore introducing a potential--and likely--bug into the code
                because the rest of the code that uses that variable assumes a final value.
                This is why it is better to have the error during compilation and not
                during the runtime of the program: it is better there are errors as close
                as possible to compilation time because there won't be bugs when the code
                is running in production.
                """);
    }

    // --------------------------------------------------------------------------------------------
    public static void operators() {}

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

            // Inherit the current terminal's I/O
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
