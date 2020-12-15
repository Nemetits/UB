public class PythagoreischeTripel {
	
	public static void main(String[] args)  {
		try {
			// Mit dem untigen wird jeglicher Output in die Datei umgeleitet
			System.setOut(new java.io.PrintStream("C:\\Users\\Santoni\\Documents\\Eclipse\\PythagoreischesTripel.csv"));
			System.out.println("Seite a, Seite b, Seite c");
			int m = 1000;
			// Jede Kombination von 0 bis tausend ausprobieren
			for(int a = 1; a < m; a++) {
				for(int b = a; b < m; b++) {
					for(int c = b; c < m; c++) {
						// Sollte es ein Pythagoereisches Tripel sein in csv Datei schreiben
						if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
							System.out.println(a + "," + b + "," + c + ",");	
						}
					}
				}
			}
			
		} catch (java.io.FileNotFoundException e) {
			// Sollte es ein Problem beim erstellen der Datei geben wird diese Meldung ausgegeben
			System.out.println("Fehler beim Erstellen der Datei");
		}
		

		
	}

}
