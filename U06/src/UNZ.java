public class UNZ{
        public static int convert(String z, int b) {
            System.out.println(z);
            int output = 0;
            int stellen = z.length();
            for (int i = 0, j = stellen - 1; i < stellen; i++, j--) {
                output += Character.getNumericValue(z.charAt(i)) * Math.pow(b, j);
            }
            return output;
        }
}
