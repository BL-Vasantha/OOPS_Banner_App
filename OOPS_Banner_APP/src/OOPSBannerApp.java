/**
 * OOPSBannerApp UC6 – Render OOPS as Banner using Modular Methods
 *
 * This use case refactors the banner logic into helper methods
 * to improve reusability, readability, and maintainability.
 *
 * Each letter of "OOPS" is generated using its own method,
 * and the main method assembles and prints the full banner.
 *
 * Benefits of this approach:
 * - Reduces code repetition
 * - Makes it easy to modify or reuse letter patterns
 * - Improves readability and organization
 *
 * @author Vasantha R
 * @version 6.0
 */
public class OOPSBannerApp {

    /**
     * Generates the ASCII pattern for the letter 'O'.
     *
     * @return a String array representing 7 lines of 'O'
     */
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Generates the ASCII pattern for the letter 'P'.
     *
     * @return a String array representing 7 lines of 'P'
     */
    public static String[] getPPattern() {
        return new String[] {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *        ",
                " *        ",
                " *        "
        };
    }

    /**
     * Generates the ASCII pattern for the letter 'S'.
     *
     * @return a String array representing 7 lines of 'S'
     */
    public static String[] getSPattern() {
        return new String[] {
                "  *****  ",
                " *        ",
                " *        ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }

    /**
     * Entry point of the Java application.
     *
     * Assembles the OOPS banner by combining individual
     * letter patterns line by line and prints them.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Step 1: Retrieve patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 2: Print the OOPS banner line by line
        // Loop through each of the 7 lines
        for (int i = 0; i < oPattern.length; i++) {
            // Concatenate letters O, O, P, S for the current line
            System.out.println(
                    String.join("",
                            oPattern[i],   // First 'O'
                            oPattern[i],   // Second 'O'
                            pPattern[i],   // 'P'
                            sPattern[i]    // 'S'
                    )
            );
        }
    }
}
