
public class DoubleUeberlauf {

	public static void main(String[] args) {

		/*
		 * f�r den wert a wird der gr��te double wert genommen
		 */
		double a = Double.MAX_VALUE;
		int i = 1;
		double erg = 0;
		/*
		 * double a wird mit i solange i <= 100000 multipliziert
		 */
		while (i <= 100000) {
			erg = a * i;
			i++;
		}
		System.out.println(erg);

	}

}
