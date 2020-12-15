public class DreieckEigenschaften {

	public static void main(String[] args) {
		// der Titel wird ausgedruckt
		System.out.println("Eigenschaften eines Dreiecks");
		System.out.println("============================");

		for (boolean l = true; l != false;) {

			// die drei Seiten werden vom Benutzer eingegeben
			double a = TestScanner.readDouble("Seite a: ");
			double b = TestScanner.readDouble("Seite b: ");
			double c = TestScanner.readDouble("Seite c: ");
			System.out.println();

			// es wird überprüft ob es ein unmögliches Dreieck
			if (unmoeglich(a, b, c) == true) {
				System.out.println("Unmögliches Dreieck");
			} else {
				// der Umfang wird berechnet
				System.out.println("Umfang: " + umfang(a, b, c));
				// die Fläche wird berechnet
				System.out.println("Fläche: " + flaeche(a, b, c));

				// es wird überprüft ob es ein gleichseitiges Dreieck ist
				if (gleichseitig(a, b, c) == true) {
					System.out.println("Gleichseitiges Dreieck");
				}
				// es wird überprüft ob es ein gleichschenkliges Dreieck ist
				else if (gleichschenkel(a, b, c) == true) {
					System.out.println("Gleichschenkliges Dreieck");
				}
				// es wird überprüft ob es ein rechtwinkliges Dreieck ist
				else if (rechterWinkel(a, b, c) == true) {
					// es wird überprüft ob die Zahlen natürlich sind
					if ((a % 1 == 0) && (b % 1 == 0) && (c % 1 == 0)) {
						System.out.println("Pythagoreisches Dreieck");
					} else {
						System.out.println("Rechtwinklinges Dreieck");
					}
					// die Hzpotenuse wird ermittelt
					System.out.println("Hypothenuse: " + hypothenuse(a, b, c));
				}
			}

			System.out.println();
			// es wird abgefragt ob noch ein dreieck asugerechnet werden soll
			int end = TestScanner.readInt("Nochmal (0), Beenden (1): ");
			System.out.println();

			// Sobald die Eingabe gleich 1 ist soll l gleich false sein (Loop wird
			// abgebrochen)
			if (end == 1) {
				l = false;
			}

		}

	}
	public static boolean unmoeglich(double a, double b, double c) {
		boolean result = false;
		// ist eine Seite größer als die Summe der anderen zwei ist es ein unmögliches Dreieck
		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			result = true;
		}
		return result;
	}

	// Den Umfang des Dreiecks ausrechnen
	public static double umfang(double a, double b, double c) {
		// Alles Seiten werden zusammengezählt
		return a + b + c;
	}

	// Fläche ausrechnen
	public static double flaeche(double a, double b, double c) {
		// die heronsche Formel wird angewendet um die Fläche auszurechnen
		double s = (a + b + c) / 2;
		double erg = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return erg;
	}

	// Ist das Dreieck gleichseitig oder nicht
	public static boolean gleichseitig(double a, double b, double c) {
		boolean result = false;
		// es wird überprüft ob alle Seiten gleich lang sind
		if (a == b && a == c) {
			result = true;
		}
		return result;
	}

	// Ist das Dreieck gleichschenklig oder nicht
	public static boolean gleichschenkel(double a, double b, double c) {
		boolean result = false;
		// es werden zuerst zwei Seiten verglichen, wenn sie gleich lang sind wird überprüft ob die dritte Seite nicht gleich lang ist 
		if ((a == b && c != a) || (a == c && a != b) || (b == c && b != a)) {
			result = true;
		}
		return result;
	}

	// Ist das Dreieck rechtwinklig oder nicht
	public static boolean rechterWinkel(double a, double b, double c) {
		boolean result = false;
		// alle drei Seiten werden quadriert
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		// wenn der Satz des Pythagoras erfolgreich gerechnet wird dann ist result true
		if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
			result = true;
		}
		return result;
	}

	// Hypothenuse ausrechnen
	public static double hypothenuse(double a, double b, double c) {
		// alle drei Seiten werden quadriert
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		double h = 0;
		// die Hypothenuse wird ermittelt
		if (a2 + b2 == c2) {
			h = Math.sqrt(a2 + b2);
		} else if (a2 + c2 == b2) {
			h = Math.sqrt(a2 + c2);
		} else if (b2 + c2 == a2) {
			h = Math.sqrt(b2 + c2);
		}
		return h;
	}

}
