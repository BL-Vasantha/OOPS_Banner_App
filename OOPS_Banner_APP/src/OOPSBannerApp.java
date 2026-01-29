/**
 * OOPSBannerApp renders the word "OOPS" as an ASCII banner on the console.
 *
 * This program demonstrates:
 * - Basic Java class structure
 * - Usage of the main method
 * - Console output using System.out.println()
 *
 * The banner is constructed using asterisks (*) and spaces,
 * printed line by line using multiple print statements.
 *
 * This implementation follows UC2 requirements by using:
 * - Multiple print statements
 * - String concatenation
 * - Fixed-size (7-line) banner characters
 *
 * @author Vasantha R
 * @version 1.2
 */
public class OOPSBannerApp {

    /**
     * Entry point of the Java application.
     *
     * Executes a sequence of print statements to display
     * the banner representation of the word "OOPS".
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Print plain OOPS text (UC1 reference)
        System.out.println("OOPS");

        // Prints the top curved line of all characters: O O P S
        System.out.println(
                "   ***    " + "   ***    " + " ******  " + "  *****  "
        );

        // Prints the upper body of the characters
        System.out.println(
                " **   **  " + " **   **  " + " **   ** " + " **      "
        );

        // Continues the upper body of the characters
        System.out.println(
                " **   **  " + " **   **  " + " **   ** " + " **      "
        );

        // Prints the middle section where P and S curve inward
        System.out.println(
                " **   **  " + " **   **  " + " ******  " + "  ***    "
        );

        // Prints the lower body; S begins right-side curve
        System.out.println(
                " **   **  " + " **   **  " + " **      " + "      ** "
        );

        // Continues the lower body of the characters
        System.out.println(
                " **   **  " + " **   **  " + " **      " + "      ** "
        );

        // Prints the bottom curved line to complete O O P S
        System.out.println(
                "   ***    " + "   ***    " + " **      " + "  *****  "
        );
    }
}
