public class Zahlenraten {
	
	public static void main(String[] args) {
//		der Titel wird ausgegeben
		System.out.println("Zahlenraten");
		System.out.println("===========");
		System.out.println("Ich habe mir eine Zahl im Intervall [0,1000] ausgedacht. Versuchen Sie diese zu erraten.");
		// Eine Zahl von 0 bis 1000 wird zurf�llig ausgesucht
		int r = random(1000, 0);
		int guess = -1;
		// solange guess != r ist ist die erratete Zahl falsch
		while(guess != r) {
			guess = TestScanner.readInt("Ihr Tipp: ");
			// Guess soll nicht h�her als das 1000 sein
			if(guess >= 0 && guess <= 1000) {
				// Sollte guess gr��er als die zuf�llige Zahl wird "zu gro�" ausgegeben
				if(guess > r) {
					System.out.println("Ihre Zahl ist zu gro�");
				} 
				// Sollte guess kleiner als die zuf�llige Zahl wird "zu klein" ausgegeben
				else if(guess < r) {
					System.out.println("Ihre Zahl ist zu klein");
				}
				// es wird ausgegeben dass die Zahl zwischen 0 und 1000 sein muss
			} else {
				System.out.println("Zahl ist zwischen 0 und 1000");
			}
			
		}
		System.out.print("Mein Kompliment! Sie haben die Zahl gefunden");

	}
	
	public static int random(int max, int min) {
		return (int)(Math.random() * ((max - min) + 1)) + min; 
	}
	
}
