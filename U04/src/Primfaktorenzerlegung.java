public class Primfaktorenzerlegung {

	public static void main(String[] args) {
		// der Titel wird ausgegeben
		System.out.println("Primfaktorzerlegung");
		System.out.println("===================");
		
		// Eingabe von der Zahl
		int n = TestScanner.readInt("Geben Sie die Zahl ein: ");
		// Die kleinste Primzahl ist 2
		if(n >= 2) {
			System.out.println("Die Zerlegung lautet: ");
			System.out.println();
			int nfinal = n;
			int teiler = 2;
			int temp = 1;
			// 1 ist der kleinste Teiler
			while(n > 1) {
				// es wird überprüft ob die Zahl durch teiler Zerlegt werden kann
				if(n % teiler == 0) { 
					// n /= teiler wird kontrolliert
					n /= teiler;
					System.out.print(teiler);
					// Alle Zusammenmultiplizieren um die letzte Zahl zu bestimmen
					temp *= teiler; 
					// es wird überprüft ob das Produkt n ergibt 
					if(temp == nfinal) { 
						System.out.print(" = " + temp);
					} else {
						System.out.print(" * ");
					}
				} else {
					// teiler wird inkrementiert
					teiler++;
				}
			}
		} else {
			System.out.print("Zahl muss größer gleich 1 sein");
		}

	}

}
