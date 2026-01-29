/**
 * OOPSBannerApp renders the word "OOPS" as an ASCII banner on the console.
 *
 * This program demonstrates:
 * - Basic Java class structure
 * - Usage of the main method as the entry point
 * - Arrays to store banner lines
 * - String concatenation to build ASCII art
 * - Console output using System.out.println()
 *
 * Each letter of "OOPS" is represented using '*' characters.
 * The letter 'S' is drawn with a curved shape using spaces and stars.
 *
 * @author Vasantha R
 * @version 3.0
 */
public class OOPSBannerApp {

    /**
     * Entry point of the Java application.
     *
     * Builds each line of the ASCII banner using
     * string concatenation and prints it to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Print the plain text "OOPS" before the banner
        System.out.println("OOPS");

        // Array to store each line of the complete "OOPS" banner
        String[] lines = new String[7];

        // Array representing the 7-line curved shape of the letter 'S'
        String[] S = new String[7];
        S[0] = " *****";    // Top horizontal curve of S
        S[1] = "**";        // Upper-left vertical stroke
        S[2] = "**";        // Upper-left vertical stroke
        S[3] = "  ***";     // Middle inward curve
        S[4] = "    **";    // Lower-right vertical stroke
        S[5] = "    **";    // Lower-right vertical stroke
        S[6] = " *****";    // Bottom horizontal curve

        // Construct each line by combining O, O, P, and S patterns
        lines[0] = " ***   ***  *****" + S[0]; // Top row of the banner
        lines[1] = "** ** ** ** **   " + S[1]; // Second row
        lines[2] = "** ** ** ** **   " + S[2]; // Third row
        lines[3] = "** ** ** ** *****" + S[3]; // Middle row (P closes, S curves)
        lines[4] = "** ** ** ** **   " + S[4]; // Fifth row
        lines[5] = "** ** ** ** **   " + S[5]; // Sixth row
        lines[6] = " ***   ***  **  " + S[6];  // Bottom row of the banner

        // Print each constructed line of the banner to the console
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
