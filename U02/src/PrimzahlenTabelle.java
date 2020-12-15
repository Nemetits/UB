
public class PrimzahlenTabelle {

	public static void main(String[] args) {
		System.out.println("Primzahlentabelle");
		System.out.println("=================");
		int zahl = 90;
		int n = 120;
		/*
		 * es werden alle Zahlen in einem Bereich getestet ob sie Primzahlen sind oder
		 * nicht
		 */

		while (zahl <= n) {
			// printZahl und istPrimzahl wird angewendet
			printZahl(zahl);
			istPrimzahl(zahl);
			zahl = zahl + 1;
		}
	}

	// es wird eine Methode gemacht um Primzahlen auszurechnen
	public static void istPrimzahl(int zahl) {
		int a = 2;
		int i = 0;
		int n = zahl;
		while (a <= n / 2) {
			/*
			 * solange a<=n/2 ist wird überprüft ob n % a == 0, wenn das einmal vorkommt
			 * wird i von 0 zu 1, wenn nicht dann wird zu a 1 dazugezählt
			 */
			if (n % a == 0) {
				i = 1;
			}
			a++;
		}
		/*
		 * hier wird überprüft ob i gleich 1 ist, wenn ja dann ist n keine Primzahl und
		 * wenn nein ist eine Primzahl
		 */
		if (i == 1) {
			System.out.println(" ist nicht Primzahl");
		} else {
			System.out.println(" ist Primzahl");
		}
	}

	// es wird angegeben mit wie vielen Leerstellen die Zahl geschrieben wird
	public static void printZahl(int zahl) {
		if (zahl < 100)
			System.out.print("  " + zahl);
		else
			System.out.print(" " + zahl);

	}

}
