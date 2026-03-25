import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        clear();
        out.println("""
                ---------------------------------------------------------------------------
                                    This is the Whiteboard For Today
                ---------------------------------------------------------------------------
                """);
        goalsOfThisCourse();
        whatIsAProgram();
    }

    // -----------------------------------------------------------------------------------------------------------------
    public static void goalsOfThisCourse() {
        out.println("""
                ---------------------------------------------------------------------------
                                        Goals of this Course
                ---------------------------------------------------------------------------

                The goals of this course is to introduce software engineering. I have
                chosen to do this through the language java because it forces us to use the
                same language we will be using in FRC. There are simpler programming
                languages syntactically, like C, but the priority of this course is
                preparation for the competition.

                We will learn good coding habits, like proper and clear formatting, and
                ways to structure simple programs. We will go over the various memory
                mechanisms available to us: we will go over the stack vs. static vs. heap
                memory. We will also go over the kind of data that we can use. We will go
                over things that will lay a decent foundation--you'd learn more foundations
                in C--though Java is a good place to start.

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

    // -----------------------------------------------------------------------------------------------------------------
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

    // -----------------------------------------------------------------------------------------------------------------
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
