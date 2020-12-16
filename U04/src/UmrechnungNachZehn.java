public class UmrechnungNachZehn {

	public static void main(String[] args) {
		// titel wird ausgegeben
		System.out.println("Umrechung ins Zehnersystem");
		System.out.println("==========================");

		// basis muss zwischen 2 und 9 liegen
		for (boolean l = true; l;) {
			int z = TestScanner.readInt("Geben Sie die Zahl ein: ");
			int b = TestScanner.readInt("Geben Sie die Basis ein: ");

			if (b >= 2 && b <= 9) {
				l = false;
				// methode wird angewendet
				int converted = convert(z, b);
				System.out.println();
				System.out.println("Die Zahl im Zehnersystem lautet " + converted);
			} else {
				System.out.println("Basis muss zwischen 2 und 9 liegen");
			}
		}
	}

	public static int convert(int z, int b) {
		int output = 0;
		String a = Integer.toString(z);
		int stellen = a.length();
		for (int i = 0, j = stellen - 1; i < stellen; i++, j--) {
			output += Character.getNumericValue(a.charAt(i)) * Math.pow(b, j);
		}
		return output;
	}
}
