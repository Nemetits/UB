public class PerfekteZahlen {

	public static void main(String[] args) {
		// Für eine bestimmte Zahlenrange probieren
		for (int i = 0; i <= Integer.MAX_VALUE; i++) {
			teiler(i);
		}
	}

	public static void teiler(int n) {
		int erg = 0;
		// Alle Zahlen bis n werden ausprobiert
		for (int i = 1; i < n; i++) {
			// wenn i ein teiler won n ist wird es zu erg addiert
			if (n % i == 0) {
				erg += i;
			}
		}
		// wenn erg und n gleich sind wird n ausgegeben außer wenn n 0 ist
		if (erg == n && n != 0) {
			System.out.println(n);
		}
	}

}
