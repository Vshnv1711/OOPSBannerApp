/**
 * OOPS Banner Application - UC7
 * Demonstrates storing character patterns using an Inner Static Class
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class that encapsulates a character
     * and its corresponding 7-line banner pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character symbol
         * @param pattern the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character symbol
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7-line string pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method for O pattern
    public static String[] buildOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Utility method for P pattern
    public static String[] buildPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Utility method for S pattern
    public static String[] buildSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Creating array of CharacterPatternMap objects
        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('P', buildPPattern()),
                new CharacterPatternMap('S', buildSPattern())
        };

        // Word to display
        char[] word = {'O', 'O', 'P', 'S'};

        // Render banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word) {
                for (CharacterPatternMap letter : letters) {
                    if (letter.getCharacter() == ch) {
                        lineBuilder.append(letter.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(lineBuilder);
        }
    }
}