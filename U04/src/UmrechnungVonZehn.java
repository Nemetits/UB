public class UmrechnungVonZehn {

	public static void main(String[] args) {
		// titel wird ausgegeben
		System.out.println("Umrechung vom Zehnersystem");
		System.out.println("==========================");
		for (boolean l = true; l != false;) {
			// eingabe
			int z = TestScanner.readInt("Geben Sie die Zahl ein: ");
			int b = TestScanner.readInt("Geben Sie die Basis ein: ");
			// wenn die basis zwischen 1 und 9 ist wird 1 false
			if (b >= 2 && b <= 9) {
				l = false;
				System.out.println();
				System.out.print("Die Zahl im " + b + "-ersystem lautet ");
			} else {
				System.out.println("Basis muss zwischen 2 und 9 liegen");
			}
			String output = "";
			while (z >= 1) {
				output = z % b + output;
				// Zahl für nächsten Durchlauf durch Basis dividieren
				z /= b;
			}
			System.out.print(output);

		}

	}

}
