
public class SatellitenZeit {
	
	public static void main(String[] args) {
		
//		der Titel wird ausgedruckt
		System.out.println("Satellitenzeit");
        System.out.println("==============");

//      die Zeit wird angegeben
        int t = TestScanner.readInt("Geben Sie die Sekunden ein: ");

//      die Werte werden berechnet
        int s = t;

        int d = s/86400;
        s = s - (d*86400);

        int h = s/3600;
        s = s - (h*3600);

        int m = s/60;
        s = s - (m*60);
        
//		die Ergebnisse werden ausgedruckt
        System.out.println("Die umgerechnete Zeit ist:");

        System.out.println("d " + d + " h " + h + " m " + m + " s " + s);
	}

}
