
public class Doppelfaktorielle {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int ergebnis = 1;
		/*
		 * es wird überprüft ob die zahl durch 2 teilbar ist 
		 * wenn n durch 2 teilbar ist dan ist i 2 sonst ist i 1,
		 * kurzgesagr wird überprüft ob n gerade oder ungerade ist
		 * wenn die Zahl gerade ist dann wird ergebnis = ergebnis * i 
		 * und i=i+2 solange i<=n ist 
		 */
		if(n%2==0) {
			
			int i = 2;
			while(i<=n) {
				ergebnis = ergebnis*i;
				i = i + 2;
			}
			/*
			 * wenn die Zahl ungerade ist dann ist i 1 und es wird 
			 * ergebnis = ergebnis * i und i++ solange i<=n ist
			 */
				
		} else {
			
			int i = 1;
			while(i<=n) {
				ergebnis = ergebnis*i;
				i = i +2;
		}
					
			
		}
		System.out.println(ergebnis);

	}

}
