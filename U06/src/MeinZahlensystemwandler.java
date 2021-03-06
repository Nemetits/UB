public class MeinZahlensystemwandler {
    public static void main(String[] args) {

    }
    /**
     * Wandelt das Zeichen nr in eine Zahl um, wobei die Groß-/Klein-schreibung
     * ignoriert wird:
     * '0' ergibt 0, '1' ergibt 1, ... '9' ergbit 9, 'A' ergibt 10, 'B' ergibt 11, ...,
     * 'Z' ergibt 35
     * Sollte ein ungültiges Zeichen übergeben werden, so gibt die Methode -1 zurück
     * @param nr das umzuwandelnde Zeichen
     * @return die Zahl für die das Zeichen steht
     */
    public static int getDigit (char nr){
            int erg = 0;
            char a = Character.toLowerCase(nr);
            String abc = "abcdefghijklmnopqrstuvwxyz";
            if (Character.isLetter(nr)){
                erg = abc.indexOf(a) + 10;
                return erg;
            } else if (Character.isDigit(nr)){
                erg = Character.getNumericValue(nr);
                return erg;
            } else {
                return -1;
            }
        }
    /**
     * Wandelt die Nummer der Ziffer nr in ein Zeichen um:
     * 0 ergibt '0', 1 ergibt '1', ..., 9 ergibt '9', 10 ergibt 'A', 11 ergibt 'B',
     * ..., 35 ergibt 'Z'
     * Sollte eine ungültige Nummer übergeben werden, so gibt die Methode einen Stern
     * '*' zurück
     * @param nr die Nummer welche in ein Zeichen umgewandelt werden soll
     * @return das Zeichen das für die Nummer steht
     */
    public static char getDigit (int nr){
        if (nr < 10){
            int a = nr + 48;
            return (char)a;
        } else if (nr <= 100){
            int erg = nr + 55;
            return (char)erg;
        } else {
            return '*';
        }

    }

    /**
     * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
     * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge gleich
     * 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn eine
     * Ziffer der übergebenen Zahl nicht zur Basis passt, wird ebenfalls -1 zurück
     * geliefert
     * Beispiel: numToDec("01110110", 2) ergibt 118
     * numToDec("170712", 8) ergibt 61898
     * numToDec("170712", 7) ergibt -1
     * @param num die umzuwandelnde Zahl als String bergeben
     * @param basis die Basis der umzuwandelnden Zahl
     * @return das Ergebnis im Dezimalsystem
     */
    public static int numToDec(String num, int basis){
        if (num == null || num.length() == 0 || basis < 2 || basis > 9){
            return -1;
        } else {
//            int a = Integer.parseInt(num);
            String a = num;
            return UNZ.convert(a, basis);
        }
    }

    /**
     * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis basis um und gibt diese
     * zurck. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und die Basis
     * muss grßer als 1 sein, ansonsten wird null zurck geliefert.
     * Beispiel: decToNum(118,2) ergibt 1110110
     * decToNum(61898,8) ergibt 170712
     * @param dec die umzuwandelnde Dezimalzahl
     * @param basis nach welcher umgewandelt wird
     * @return die umgewandelte Zahl
     */
    public static String decToNum(int dec, int basis){
        String erg = "";
        int a = dec;
        while (a >= 1) {
            erg = a % basis + erg;
            // Zahl für nchsten Durchlauf durch Basis dividieren
            a /= basis;
        }
        return erg;
    }

    public static int hexToDec(String num) {

        int basis = 16;
        int len = String.valueOf(num).length();
        int p = 1;
        int ret = 0;

        for (int i = len - 1; i >= 0; i--) {
            ret += getDigit(num.charAt(i)) * p;
            p *= basis;
        }

        return ret;

    }

    /**
     * Convert dezimal Number to hexadezimal Number
     * Example: decToHex("C8") = 200
     * @param dec = dezimal Number
     * @return ret = hexadezimal Number
     */
    public static String decToHex(int dec) {
        String ret = null;
        int basis = 16;
        if(dec >= 0 && basis > 1) {
            String retTemp = "";
            while(dec > 0) {
                retTemp += getDigit(dec % basis);
                dec /= basis;
            }
            ret = "";
            for(int i = retTemp.length() - 1; i >= 0; i--) {
                ret += retTemp.charAt(i);
            }
        }
        return ret;
    }

    /**
     * Convert binary Number to dezimal Number
     * Example: dualToDec("01110110") = 118
     * @param num = binary Number
     * @return ret = dezimal Number
     */
    public static int dualToDec(String num, int basis) {

        int len = num.length();
        int p = 1;
        int ret = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (getDigit(num.charAt(i)) >= basis) {
                System.out.println("Ziffern müssen kleiner als Basis sein");
                return -1;
            }
            ret += getDigit(num.charAt(i)) * p;
            p = p * basis;
        }

        return ret;

    }

    /**
     * Convert dezimal Number to binary Number
     * Example: decToDual(118) = 01010101
     * @param dec = dezimal Number
     * @return ret = binary Number
     */
    public static String decToDual(int dec) {
        String ret = null;
        int basis = 2;

        String retTemp = "";
        while(dec > 0) {
            retTemp += getDigit(dec % basis);
            dec /= basis;
        }
        retTemp += "0";
        ret = "";
        for(int i = retTemp.length() - 1; i >= 0; i--) {
            ret += retTemp.charAt(i);
        }

        return ret;
    }

    /**
     * Convert any Number in any Number System into any other Number in any other Number
     * System
     * Example: numToNum("C8", 16, 10) = 200
     * @param num = Input Number
     * @param basis = Basis of input Number
     * @param basis2 = Basis of the Number you want to convert to
     * @return
     */
    public static String numToNum(String num, int basis, int basis2) {
        int output = numToDec(num, basis);
        String outputEnd = decToNum(output, basis2);
        return outputEnd;
    }

}
