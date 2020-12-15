public class TestZahlensystemwandler {
    public static void main(String[] args) {
        System.out.println(MeinZahlensystemwandler.getDigit('3'));
        System.out.println(MeinZahlensystemwandler.getDigit('a'));
        System.out.println(MeinZahlensystemwandler.getDigit('F'));
        System.out.println(MeinZahlensystemwandler.getDigit('?'));
        System.out.println(MeinZahlensystemwandler.getDigit(9));
        System.out.println(MeinZahlensystemwandler.getDigit(11));
        System.out.println(MeinZahlensystemwandler.getDigit(101));
        System.out.println(MeinZahlensystemwandler.numToDec("0110101", 2));
        System.out.println(MeinZahlensystemwandler.numToDec("170712", 8));
        System.out.println(MeinZahlensystemwandler.numToDec("170712", 7));
        System.out.println(MeinZahlensystemwandler.decToNum(118,2));
        System.out.println(MeinZahlensystemwandler.decToNum(61898,8));

    }
}
