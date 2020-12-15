
public class EinMalEins {

	public static void main(String[] args) {
		/*
		 * der titel wird ausgegeben
		 */
		System.out.println("Einmaleins-Tabelle");
		System.out.println("==================");
		int a = 1;
		int zahl = 0;
		while (a <= 10) {
			int b = 1;
			/* solange b<=10 ist wird a*b gemacht, die Zahl 
			 * ausgegeben und zu b ein 1 dazugezählt, dies wird
			 * wiederholt solange a<=10 ist
			 */
			while (b <= 10) {
				zahl = a * b;
//				die printZahl Methode wird angewendet
				printZahl(zahl);
				b++;
			}
			a++;
//			es wird eine neue Reihe genommen
			System.out.println();
		}

	}
	/*
	 * es wird angegeben mit wie vielen Leerstellen die Zahl geschrieben
	 * wird
	 */

	public static void printZahl(int zahl) {
		if (zahl < 10) {
			System.out.print("   " + zahl);
		} else {
			if (zahl < 100) {
				System.out.print("  " + zahl);
			} else {
				System.out.print(" " + zahl);
			}
		}
	}

}
