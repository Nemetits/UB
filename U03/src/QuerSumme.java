
public class QuerSumme {

	public static void main(String[] args) {
		System.out.println("Quersumme");
		System.out.println("=========");
		// Der Wert i wird angegeben
		int z = TestScanner.readInt("Geben Sie die Zahl ein: ");
		int i = 1;
		int z1 = 0;
		// es wird ueberprueft ob z eine Zahl mit nur einer Stelle ist
		if (z > 10) {
			// eine Probezahl fuer die naechste Schleife wird ermittelt
			while (z / i > 1) {
				i = i * 10;
			}
			i = i / 10;
			// as Ergebnis wird berechnet und ausgedruckt
			System.out.println();
			System.out.println("Die Quersumme lautet: ");
			int summe = 0;
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
			System.out.println(" = " + summe);
		} else
			System.out.println("Die Quersumme lautet: " + z);

	}

}
