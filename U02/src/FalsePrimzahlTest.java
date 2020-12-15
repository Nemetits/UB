
public class FalsePrimzahlTest {

	public static void main(String[] args) {
		int z = 25;
		int i = 2;
		while (i < z) {
			if (z % i != 0) {
				i++;
			} else {
				System.out.println("Die Zahl ist keine Primzahl");
				return;
			}
		}
		System.out.println("Die Zahl ist eine Primzahl");
	}
}
