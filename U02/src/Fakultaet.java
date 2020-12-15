
public class Fakultaet {

	public static void main(String[] args) {
		int n = 6;
		int i = 1;
		int ergebnis = 1;
		/*
		 * solange i<=n ist wird ergebnis = ergebnis*i und i++ gemacht
		 */
		while(i<=n) {
			ergebnis = ergebnis*i;
			i++;
		}
//		das ergebnis wird ausgedruckt
		System.out.println(ergebnis);		
	}

}
