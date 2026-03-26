import java.util.*;

class BannerCharacter {
    String[] pattern;

    BannerCharacter(String[] pattern) {
        this.pattern = pattern;
    }
}

public class BannerUC8 {

    public static void renderBanner(String word, Map<Character, BannerCharacter> map) {
        int rows = map.get(word.charAt(0)).pattern.length;

        for (int i = 0; i < rows; i++) {
            for (char ch : word.toCharArray()) {
                BannerCharacter bc = map.get(ch);
                System.out.print(bc.pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        map.put('P', new BannerCharacter(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        map.put('S', new BannerCharacter(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";
        renderBanner(word, map);
    }
}