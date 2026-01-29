/**
 * OOPSBannerApp UC6 – Render OOPS as Banner using Modular Methods
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case refactors the banner logic into helper methods
 * to improve reusability, readability, and maintainability.
 *
 * This use case introduces CharacterPatternMap to encapsulate
 * character-to-pattern mappings and dynamically render ASCII banners.
 *
 * @author Vasantha R
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner static class to store character-to-pattern mapping
     */
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character the character being represented
         * @param pattern   ASCII art pattern (7 lines)
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return mapped character
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * @return ASCII pattern for the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes character-pattern mappings
     *
     * @return array of CharacterPatternMap
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        "  *****  "
                }),
                new CharacterPatternMap('P', new String[]{
                        " ******  ",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        " *       ",
                        " *       ",
                        " *       "
                }),
                new CharacterPatternMap('S', new String[]{
                        "  *****  ",
                        " *       ",
                        " *       ",
                        "  *****  ",
                        "       * ",
                        "       * ",
                        "  *****  "
                }),
                new CharacterPatternMap(' ', new String[]{
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          "
                })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     *
     * @param ch       character to look up
     * @param charMaps array of character-pattern mappings
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Default to space pattern if character not found
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        return new String[]{" ", " ", " ", " ", " ", " ", " "};
    }

    /**
     * Prints a message as an ASCII banner
     *
     * @param message  text to display
     * @param charMaps available character patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        message = message.toUpperCase();
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]);
            }
            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
