/**
 * OOPSBannerApp renders the word "OOPS" as an ASCII banner on the console.
 *
 * UC4 Implementation:
 * - Stores all banner lines in a String array
 * - Uses String.join() to construct each line
 * - Uses a loop to print the banner
 *
 * This approach improves modularity, readability, and reusability
 * by eliminating repetitive print statements.
 *
 * @author Vasantha R
 * @version 4.0
 */
public class OOPSBannerApp {

    /**
     * Entry point of the Java application.
     *
     * Constructs the ASCII banner using a String array
     * and prints each line using an enhanced for loop.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Print plain text output
        System.out.println("OOPS");

        // Step 1: Create a String array to store 7 banner lines
        String[] lines = new String[7];

        // Step 2: Populate banner lines using String.join()
        lines[0] = String.join("",
                " ***   ***  ",
                " *****",
                " *****"
        );

        lines[1] = String.join("",
                "** ** ** ** ",
                "**   ",
                "**"
        );

        lines[2] = String.join("",
                "** ** ** ** ",
                "**   ",
                "**"
        );

        lines[3] = String.join("",
                "** ** ** ** ",
                " *****",
                "  ***"
        );

        lines[4] = String.join("",
                "** ** ** ** ",
                "**   ",
                "    **"
        );

        lines[5] = String.join("",
                "** ** ** ** ",
                "**   ",
                "    **"
        );

        lines[6] = String.join("",
                " ***   ***  ",
                "**   ",
                " *****"
        );

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
