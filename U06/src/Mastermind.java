import java.util.Random;

public class Mastermind {

    public static void main(String[] args) {
        System.out.println("Mastermind");
        System.out.println("==========");

        int stellen = TestScannerErweitert.readInt("Die Stellen des Codes eingeben: ");
        int farben = TestScannerErweitert.readInt("Die Farben des Codes eingeben: ");
        String code = erzeugeCode(stellen, farben);
        System.out.print("======================> ");
        String tipp1 = TestScannerErweitert.readString("Ihr Tipp: ");
        tipp1 = tipp1.toUpperCase();
        while (tipp1.length() < code.length() && !tipp1.equals("ENDE")){
            tipp1 = TestScannerErweitert.readString("Ihr Tipp: ");
            tipp1 = tipp1.toUpperCase();
        }
        String tipp2 = eingabeTipp(tipp1);
        int weiss = ermittleWeiss(code, tipp2);
        int schwarz = ermittleSchwarz(code, tipp2);
        for (int i = 1; !tipp2.equals("ENDE"); i++){
            System.out.print(i + "): " + tipp2 + " = (w: " + weiss + ", s: " + schwarz + "): " );
            if (code.equals(tipp2)){
                System.out.println("Code gefunden");
                System.out.print("======================> ");
            }
            tipp1 = TestScannerErweitert.readString("Ihr Tipp: ");
            tipp1 = tipp1.toUpperCase();
            while (tipp1.length() < code.length() && !tipp1.equals("ENDE")){
                tipp1 = TestScannerErweitert.readString("Ihr Tipp: ");
                tipp1 = tipp1.toUpperCase();
            }
            tipp2 = eingabeTipp(tipp1);
            weiss = ermittleWeiss(code, tipp2);
            schwarz = ermittleSchwarz(code, tipp2);
        }

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

        String ret = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (farben < stellen || stellen == 0) {
            return "Nicht gültig";
        } else {
            for (int i = 0; i < stellen; i++){
                int a = getRandomNumberInRange(0, farben);
                if (ret.indexOf(abc.charAt(a)) == -1){
                    ret += abc.charAt(a);
                } else {
                    i--;
                }
            }
        }
        return ret;
    }

    /**
     * Als erstes wird überprüft ob der String s null oder leer ist,
     * dann werden mit zwei for Schleifen alle chars im String durchgeprüft
     * ob sie ein weiteres mal im String erhalten sind.
     * @param s ist der zu überprüfende String
     * @return ret übergiebt true wenn ein doppeltes Zeichen enthaleten ist
     */
    public static boolean enthaeltDoppelte(String s) {

        boolean ret = false;
        int a = 0;
        if (s == null || s.isEmpty()){
            return false;
        } else {
            for (int i = 0; i < s.length() - 1; i++){
                for (int j = i + 1; j < s.length(); j++){
                    if (s.charAt(i) == s.charAt(j)){
                        a++;
                    }
                }
            }
        }
        if (a > 0) {
            ret = true;
        }
        return ret;
    }

    /**
     * Der Tipp wird eingegeben und es wird auf verschiedenes überprüft.
     * Die while Schleife sorgt dafür, dass die Schleife solange geht bis
     * der Tipp nicht ende ist.
     * @param ret ist der eingegebene Tipp des Benutzers
     * @return ret gibt den eingegebenen Text in Großbuchstaben zurück
     */
    public static String eingabeTipp(String ret) {
        if (!ret.equals("ENDE")){
            while (ret.isEmpty() || enthaeltDoppelte(ret)) {
                ret = TestScannerErweitert.readString("Ihr Tipp: ");
            }
        }
        return ret;
    }

    /**
     * Es wird überpruft ob die Strings nicht leer sind und ob sie gleich lang sind,
     * dann werden die Buschstaben an den gleichen Stellen verglichen.
     * @param codeRight ist der eingegebene Code
     * @param codeGuess ist der eingegebene Tipp
     * @return ret gibt die Anzahl der Richtigen Buchstaben am richtigen Platz zurück
     */
    public static int ermittleSchwarz(String codeRight, String codeGuess) {
        int ret = 0;
        if (!codeRight.isEmpty() || codeGuess.length() == codeRight.length()){
            for (int i = 0; i < codeRight.length() - 1; i++){
                if (codeGuess.charAt(i) == codeRight.charAt(i)){
                    ret++;
                }
            }
            return ret;
        } else {
            return -1;
        }
    }

    /**
     *
     * @param c ist der eingegebene Code
     * @param t ist der eingegebene Tipp
     * @return gibt die Anyahl der Richtigen Buchstaben am falschem Platz zurück
     */
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

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }






}
