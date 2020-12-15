
public class WortRatespiel {

	public static void main(String[] args) {
		// titel ausgabe
		System.out.println("Wortratespiel");
		System.out.println("=============");
		for (boolean ende = false; ende != true;) {
			// eingbe gesuchtes Wort
			String gWort = TestScannerErweitert.readString("Gesuchtes Wort: ");
			String punkte = "";
			String punktewort = "";
			int first = 0;
			// Schrittzähler
			int count = 0;
			for (boolean isGuess = false; isGuess != true;) {
				// Punkte werden gemacht
				if (first == 0) {
					for (int i = 0; i < gWort.length(); i++) {
						punkte += ".";
					}
					first++;
				}
				System.out.println("Ihr Wort: 	" + punkte);
				// ein wort oder ein Buchstabe word eingegeben
				String guess = TestScannerErweitert.readString("Buchstabe/Wort: ");
				// guess wird zu gWort verglichen
				if (guess.equals(gWort)) {
					isGuess = true;
					count++;
					System.out.println("Sie haben in " + count + " Schritten das Wort erraten!");
				} else {

					for (int j = 0; j < gWort.length(); j++) {
						// wenn ein Buchstabe richtig ist wird er zu punktewort hinzugefügt
						if (guess.length() == 1 && (gWort.charAt(j) == Character.toLowerCase(guess.charAt(0))
								|| gWort.charAt(j) == Character.toUpperCase(guess.charAt(0)))) {
							punktewort += guess.toUpperCase();
						}
						// Punkte werden hizugefügt
						else if (punkte.charAt(j) == '.') {
							punktewort += ".";
						}
						// Die Buchstaben werden hinzugefügt
						else if (punkte.charAt(j) != '.' && punkte.charAt(j) != guess.charAt(0)) {
							punktewort += punkte.charAt(j);
						}
					}
					// wenn das punktewort kein Punkt mehr enthaltet ist das wort erraten
					if (!punktewort.contains(".")) {
						isGuess = true;
						count++;
						System.out.println("Sie haben in " + count + " Schritten das Wort erraten!");
					}
					count++;
					punkte = punktewort;
					punktewort = "";
				}
			}
			// If the User wants to Guess another time
			char w = TestScannerErweitert.readChar("Nochmal (j/n)? ");
			if (w == 'n' || w == 'N') {
				ende = true;
			}
		}
	}

}
