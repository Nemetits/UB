
public class GgTEuklid
{

	public static void main(String[] args) {

		// der Titel wird ausgegeben
		System.out.println("GgT von Euklid");
		System.out.println("==============");

		// die zwei Zahlen werden ausgegeben
		int a = TestScanner.readInt("Erste Zahl: ");
		int b = TestScanner.readInt("Zweite Zahl: ");

		// der GgT wird ausgerechnet und ausgerdruckt
		System.out.println("Der größte gemeinsame Teiler lautet ");
		if (a == 0)
			System.out.println(b);
		while (b != 0) {
		if (a > b) 
			a -= b;
		 else 
			b -= a;
		}
		System.out.println(a);
	}

}
