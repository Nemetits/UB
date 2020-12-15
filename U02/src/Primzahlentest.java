
public class Primzahlentest {

	public static void main(String[] args) {
		int a = 2;
		int i = 0;
		int n = 777777777;
		while (a <= n / 2) {
			/*
			 * solange a<=n/2 ist wird überprüft ob n % a == 0, wenn
			 * das einmal vorkommt wird i von 0 zu 1, wenn nicht dann 
			 * wird zu a 1 dazugezählt
			 */
			if (n % a == 0) {
				i = 1;
			}
			a++;
		}
		/*
		 * hier wird überprüft ob i gleich 1 ist, wenn ja dann ist 
		 * n keine Primzahl und wenn nein ist eine Primzahl
		 */
		if (i == 1) {
			System.out.println("Die Zahl ist keine Primzahl");
		} else {
			System.out.println("Die Zahl ist eine Primzahl");
		}

	}

}
