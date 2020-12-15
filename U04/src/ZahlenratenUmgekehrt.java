public class ZahlenratenUmgekehrt {
	
	public static void main(String[] args) {
		// der Titel wird ausgegeben0
		System.out.println("Umgekehrtes Zahlenraten");
		System.out.println("=======================");
		System.out.println("Suchen Sie sich eine Zahl im Intervall [0,1000] aus. Ich werde Sie finden");
		// Variable zur Suche deklarieren
		int min = 0;
		int max = 1000;
		int random = 0;
		int input = 3;
		while(input != 2) {
			// Neues Intervall
			random = random(max, min);  
			System.out.println("Mein Tipp: " + random);
			// Zahl kleiner größer oder gefunden abfragen
			input = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2): ");
			// Bei kleiner ist das neue Maximum die random Zahl
			if(input == 0) {
				max = random;
			}
			// Bei größer ist das neue Minimum die random Zahl
			else if(input == 1) {
				min = random;
			}
		}
		System.out.print("Ich habe die Zahl gefunden!");
	
	}
	
	public static int random(int max, int min) {
		return (int)(max-min) / 2 + min;
	}

}
