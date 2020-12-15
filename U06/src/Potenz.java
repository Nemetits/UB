public class Potenz {
    public static void main(String[] args) {

        double basis = TestScannerErweitert.readDouble("Basis: ");
        int exp = TestScannerErweitert.readInt("Exponent: ");
        System.out.println((int)potenz(basis, exp));
    }

    public static double potenz (double basis, int exp) {
        if (exp==1) {
            return basis;
        } else {
            return basis*potenz(basis,exp-1);
        }
    }
}
