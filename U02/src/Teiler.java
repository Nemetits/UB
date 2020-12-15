
public class Teiler {

	public static void main(String[] args) {
		
		int i = 1;
		int z = 20;
		/*
		 * solange i<=z wird überprüft ob z%i==0, wenn ja dann wird i ausgedruckt,
		 * wenn nicht dann wird zu i 1 dazugezählt 
		 */
		while (i<=z) {
			if (z%i==0) {
			System.out.println(i);
			}
			i++;
		}
	}
}


