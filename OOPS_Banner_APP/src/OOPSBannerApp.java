/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case introduces CharacterPatternMap and HashMap to encapsulate
 * character-to-pattern mappings and dynamically render ASCII banners.
 *
 * @author Vasantha
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Inner static class to store character-to-pattern mapping
     */
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array
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
     * Creates and initializes HashMap<Character, String[]> for patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        charMap.put(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMap;
    }

    /**
     * Retrieves pattern from CharacterPatternMap array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // default to space
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') return map.getPattern();
        }
        return new String[]{" ", " ", " ", " ", " ", " ", " "};
    }

    /**
     * Prints message using CharacterPatternMap[]
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        message = message.toUpperCase();
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                line.append(getCharacterPattern(ch, charMaps)[row]);
            }
            System.out.println(line);
        }
    }

    /**
     * Prints message using HashMap<Character, String[]>
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        message = message.toUpperCase();
        int patternHeight = charMap.get('O').length;

        for (int row = 0; row < patternHeight; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                line.append(pattern[row]);
            }
            System.out.println(line);
        }
    }
}
