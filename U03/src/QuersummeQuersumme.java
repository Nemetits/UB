
public class QuersummeQuersumme {
	public static void main(String[] args) {
		System.out.println("Quersumme");
		System.out.println("=========");
		// Der Wert i wird angegeben
		int z = TestScanner.readInt("Geben Sie die Zahl ein: ");
		int i = 1;
		int z1 = 0;

		// eine Probezahl fuer die naechste Schleife wird ermittelt
		while (z / i > 1) {
			i = i * 10;
		}
		// Das Ergebnis wird berechnet und ausgedruckt
		System.out.println();
		System.out.println("Die Quersumme lautet: ");
		
		int summe = 0;
		if (z > 10) {
			// eine Probezahl fuer die naechste Schleife wird ermittelt
			while (z / i > 1) {
				i = i * 10;
			}
			i = i / 10;
			// as Ergebnis wird berechnet und ausgedruckt
			System.out.println();
			System.out.println("Die Quersumme lautet: ");
			
			while (z >= 1) {
				z1 = z / i;
				summe = summe + z1;
				if (z1 != 0)
					System.out.print(z1);
				z = z % i;
				i = i / 10;
				if (i > 0)
					System.out.print(" + ");
			}
			System.out.print(" = " + summe);
		} else
			System.out.println("Die Quersumme lautet: " + z);
		
		int y = summe;
		if (summe > 10) {
			System.out.print(" = ");
			int i2 = 1;
			int z2 = 0;
			// eine Probezahl fuer die naechste Schleife wird ermittelt
			while (y / i2 > 1) {
				i2 = i2 * 10;
			}
			int summe2 = 0;
			while (y >= 1) {
				z2 = y / i2;
				summe2 = summe2 + z2;
				if (z2 != 0)
					System.out.print(z2);
				y = y % i2;
				i2 = i2 / 10;
				if (i2 > 0)
					System.out.print(" + ");
			}
			System.out.print(" = " + summe2);

		} else 
			System.out.print("Die Quersumme lautet: " + y);
	}
}
