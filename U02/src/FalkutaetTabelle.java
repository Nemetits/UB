
public class FalkutaetTabelle {

	public static void main(String[] args) {
		
		/*
		 * der Titel wird ausgegeben
		 */
		System.out.println("       n      n!");
		System.out.println("================");
		
		int n = 1;
		int nfak = 1;
		int i = 1;
		
//		die Fakultät wird ausgerechnet für alle Zahlen von 1 bis 10
		 
		while (n <= 10) {
			while (i <= n) {
				nfak = nfak * i;
				i++;
			}
//			printZahl wird für n und nfak angewendet
			printZahl(n);
			printZahl(nfak);
//			es springt zu einer neuen Zeile 
			System.out.println();
//			es wird 1 zu n dazugezählt
			n++;
			
		}
	}
	/*
	 * es wird angegeben mit wie vielen Leerstellen die Zahl geschrieben
	 * wird
	 */
	public static void printZahl(int zahl) {
		if (zahl < 10) 
			System.out.print("       " + zahl);
		else if (zahl < 100) 
			System.out.print("      " + zahl);
		else if (zahl < 1000) 
			System.out.print("     " + zahl);
		else if (zahl < 10000) 
			System.out.print("    " + zahl);
		else if (zahl < 100000) 
			System.out.print("   " + zahl);
		else if (zahl < 1000000) 
			System.out.print("  " + zahl);	
		else if (zahl < 10000000) 
			System.out.print(" " + zahl);
		else
			System.out.print("" + zahl);
	}

}
