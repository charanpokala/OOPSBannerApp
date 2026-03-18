public class BannerUC6 {

    static String getOPattern(int line) {
        String[] O = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
        return O[line];
    }

    static String getPPattern(int line) {
        String[] P = {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
        return P[line];
    }

    static String getSPattern(int line) {
        String[] S = {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
        return S[line];
    }

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            String line = String.join(" ",
                    getOPattern(i),
                    getOPattern(i),
                    getPPattern(i),
                    getSPattern(i)
            );

            System.out.println(line);
        }
    }
}