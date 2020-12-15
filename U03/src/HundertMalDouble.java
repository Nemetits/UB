
public class HundertMalDouble {

	public static void main(String[] args) {

		// die zwei double werden bestimmt
		double a = 0.1;
		double i = 0.1;
		int b = 0;
		/*
		 * solange b kleiner 100 ist wird a = a + i ausgeführt und zu b 1 addiert
		 */
		while (b < 100) {
			a = a + i;
			b++;
		}

		System.out.println(a);
		/*
		 * man kann beim ergebnis erkennen dass in java die double nicht genau sind, sie
		 * sind nur bis einer bestimmten dezimalstelle genau. 
		 * double 0.1 = 0.1000000000000000055511151231257827021181583404541015625
		 */
	}

}
