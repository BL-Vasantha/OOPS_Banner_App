/**
 * OOPSBannerApp renders the word "OOPS" as an ASCII banner on the console.
 *
 * UC4 Implementation:
 * - Stores all banner lines in a String array
 * - Uses String.join() to construct each line
 * - Uses a loop to print the banner
 /**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * at the time of declaration using String.join() method to create each
 * line of the banner.
 *
 * @author Vasantha R
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1 & 2: Inline declaration and initialization of banner lines
        String[] lines = {
                String.join("", "  *****  ", "  *****  ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", "  *****  ", "  *****  ", " *        ", "  *****  ")
        };

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
