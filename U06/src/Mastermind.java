import java.util.Random;

public class Mastermind {

    public static void main(String[] args) {

    }

    public static String eingabeTipp(String ret) {
        ret = TestScannerErweitert.readString("Ihr Tipp: ");
        if (ret.isEmpty()) {
            ret = TestScannerErweitert.readString("Ihr Tipp: ");
        }
        return ret;
    }
    public static String erzeugeCode (int stellen, int farben) {
        String ret = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (farben<stellen) {
            return ret;
        }
        for (int i=0;i<=stellen+1;i++) {
            ret+=abc.charAt(getRandomNumberInRange(0,farben));

        }
        return ret;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static boolean enthaeltDoppelte(String s) {

        boolean erg = false;
        s = s.toLowerCase();
        int i = 1;
        int b = i;
        if (s.isEmpty() || s.equals("null")) {
            erg = false;
        } else {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                while (b <= s.length()) {
                    if (c == s.charAt(b)) {
                        erg = true;
                    }
                    b++;
                }
                i++;
                b = i;
            }
        }
        return erg;
    }

    public static int ermittleWeiss(String c, String t) {
        int ret = -1;

        if (t != null && c.length() == t.length() && !t.isEmpty()) {
            ret = 0;
            for (int i = 0; i < c.length(); i++) {
                char a = c.charAt(i);
                for (int j = 0; j < t.length(); j++) {
                    char b = t.charAt(j);
                    if (a == b && a != t.charAt(i)) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
    public static int ermittleSchwarz(String codeRight, String codeGuess) {
        int ret = -1;
        int count = 0;
        if(codeRight.length() == codeGuess.length() && codeRight.length() > 0) {
            for(int i = 0; i <= codeRight.length() - 1; i++) {
                if(codeRight.charAt(i) == codeGuess.charAt(i)) {
                    count++;
                }
            }
            ret = count;
        }
        return ret;
    }

}
