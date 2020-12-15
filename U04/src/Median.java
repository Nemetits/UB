
public class Median {

	public static void main(String[] args) {

		// der Titel wird ausgegeben
		System.out.println("Median");
		System.out.println("======");
		// die drei Zahlen werden angegeben
		int eins = TestScanner.readInt("1. Zahl: ");
		int zwei = TestScanner.readInt("2. Zahl: ");
		int drei = TestScanner.readInt("3. Zahl: ");
		// man überprueft auf Spezialfaelle und ermittelt den Median und gibt sie
		// anschliesend aus
		if (eins == zwei)
			System.out.println("Der Median lautet " + eins);
		else if (eins == drei)
			System.out.println("Der Median lautet " + eins);
		else if (zwei == drei)
			System.out.println("Der Median lautet " + zwei);
		else if (eins == zwei && zwei == drei)
			System.out.println("Der Median lautet " + eins);
		else if (eins != zwei && zwei != drei && eins != drei) {
			if (eins < zwei)
				if (eins > drei)
					System.out.println("Der Median lautet " + eins);
				else
					System.out.println("Der Median lautet " + drei);
			else
				System.out.println("Der Median lautet " + zwei);
		}

	}

}
