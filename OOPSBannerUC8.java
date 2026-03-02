import java.util.HashMap;
import java.util.Map;

class BannerUtility {

    // Method to build character pattern map
    public static Map<Character, BannerCharacterArray> buildCharacterMap() {

        Map<Character, BannerCharacterArray> map = new HashMap<>();

        // Pattern for O
        map.put('O', new BannerCharacterArray(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        // Pattern for P
        map.put('P', new BannerCharacterArray(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        // Pattern for S
        map.put('S', new BannerCharacterArray(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        return map;
    }

    // Method to render banner word
    public static void renderBanner(String word, Map<Character, BannerCharacterArray> map) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (map.containsKey(ch)) {
                    line.append(map.get(ch).getPattern()[row]);
                    line.append("  "); // space between letters
                }
            }

            System.out.println(line);
        }
    }
}