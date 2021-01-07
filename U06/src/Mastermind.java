import java.util.Random;

public class Mastermind {

    public static void main(String[] args) {
        System.out.println("Mastermind");
        System.out.println("==========");

        int stellen = TestScannerErweitert.readInt("Die Stellen des Codes eingeben: ");
        int farben = TestScannerErweitert.readInt("Die Farben des Codes eingeben: ");
        System.out.println(erzeugeCode(stellen, farben));
    }

    /**
     * Die Methode erzeugeCode gibt null zurück wenn weniger farben als
     * stellen gegeben sin d oder stellen 0 ist, dann werden von dem
     * String abc zufälige Buchstaben genommen und zu dem String ret
     * hinzugefügt. Es wird auch überprüft, dass keine Buchstaben gleich
     * sind.
     * @param stellen gibt an wie viele stellen der code haben soll
     * @param farben gibt an wie viele Farben der Code haben soll
     * @return ret liefert den generierten Code zurück
     */
    public static String erzeugeCode (int stellen, int farben) {

        String ret = null;
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (farben < stellen || stellen == 0) {
            return ret;
        } else {
            for (int i = 0; i < stellen; i++){
                int a = getRandomNumberInRange(0, farben);
                if (ret.indexOf(abc.charAt(a)) == -1){
                    ret += abc.charAt(a);
                }
            }
        }
        return ret;
    }

    /**
     *
     * @param s ist der zu überprüfende String
     * @return übergiebt true wenn ein doppeltes Zeichen enthaleten ist
     */
//    public static boolean enthaeltDoppelte(String s) {

//        boolean erg = false;
//        s = s.toLowerCase();
//        int i = 1;
//        int b = i;
//        if (s.isEmpty() || s.equals("null")) {
//            erg = false;
//        } else {
//            for (int j = 0; j < s.length(); j++) {
//                char c = s.charAt(j);
//                while (b <= s.length()) {
//                    if (c == s.charAt(b)) {
//                        erg = true;
//                    }
//                    b++;
//                }
//                i++;
//                b = i;
//            }
//        }
//        return erg;
//    }

    /**
     *
     * @param ret ist der eingegebene Tipp des Benutzers
     * @return gibt den eingegebenen Text in Großbuchstaben zurück
     */
//    public static String eingabeTipp(String ret) {
//        ret = TestScannerErweitert.readString("Ihr Tipp: ");
//        if (ret.isEmpty()) {
//            ret = TestScannerErweitert.readString("Ihr Tipp: ");
//        }
//        return ret;
//    }

    /**
     *
     * @param codeRight ist der eingegebene Code
     * @param codeGuess ist der eingegebene Tipp
     * @return gibt die Anzahl der Richtigen Buchstaben am richtigen Platz zurück
     */
//    public static int ermittleSchwarz(String codeRight, String codeGuess) {
//        int ret = -1;
//        int count = 0;
//        if(codeRight.length() == codeGuess.length() && codeRight.length() > 0) {
//            for(int i = 0; i <= codeRight.length() - 1; i++) {
//                if(codeRight.charAt(i) == codeGuess.charAt(i)) {
//                    count++;
//                }
//            }
//            ret = count;
//       }
//        return ret;
//    }

    /**
     *
     * @param c ist der eingegebene Code
     * @param t ist der eingegebene Tipp
     * @return gibt die Anyahl der Richtigen Buchstaben am falschem Platz zurück
     */
//    public static int ermittleWeiss(String c, String t) {
//        int ret = -1;
//
//        if (t != null && c.length() == t.length() && !t.isEmpty()) {
//            ret = 0;
//            for (int i = 0; i < c.length(); i++) {
//                char a = c.charAt(i);
//                for (int j = 0; j < t.length(); j++) {
//                    char b = t.charAt(j);
//                    if (a == b && a != t.charAt(i)) {
//                        ret++;
//                    }
//                }
//            }
//        }
//
//        return ret;
//    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }






}
