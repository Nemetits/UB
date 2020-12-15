
public class WuerfelSimulation {

	public static void main(String[] args) {
		int i = 0;
		int sechs = 0;
		int fuenf = 0;
		int vier = 0;
		int drei = 0; 
		int zwei = 0;
		int eins = 0;
		int p = 0;
		int n = 34000000;
//		der Titel wird ausgedruckt
		System.out.println("Würfelsimulator");
		System.out.println("===============");
		System.out.println("Bitte warten");
		
//		es wird gewuerfelt und die Punkte werden ausgedruckt
		while (i<1000000000) {
			int a = (int)(Math.random() * 6) + 1;
			if (p == n) {
				p = 0;
				System.out.print(".");
			}
			if (a == 6)
				sechs ++;
			if (a == 5)
				fuenf ++;
			if (a == 4)
				vier ++;
			if (a == 3)
				drei ++;
			if (a == 2)
				zwei ++;
			if (a == 1) 	
				eins ++;
			i++;
			p++;
				
			
		}
//		die Ergebnisse werden ausgedruckt
		System.out.println();
		System.out.println("Anzahl 1: " + eins);
		System.out.println("Anzahl 2: " + zwei);
		System.out.println("Anzahl 3: " + drei);
		System.out.println("Anzahl 4: " + vier);
		System.out.println("Anzahl 5: " + fuenf);
		System.out.println("Anzahl 6: " + sechs);
		System.out.println();
		System.out.println("Anzahl Würfe: " + i);

	}

}
