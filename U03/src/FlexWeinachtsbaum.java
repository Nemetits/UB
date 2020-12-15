
public class FlexWeinachtsbaum {

	public static void main(String[] args) {
		System.out.println("Der felxible Weihnachtsbaum");
        System.out.println("===========================");

//		Eingabe der Werte des Baumes
        int baum = TestScanner.readInt("Geben Sie die Höhe des Baumes ein: ");
        int stamm = TestScanner.readInt("Geben Sie die Höhe des Stammes ein: ");

        int laenge = baum-1;
        int s = 1;

//		der Baum und der Stamm wird ausgegeben
        while(laenge >= 0) {

            printLeerzeichen(laenge);
            printSterne(s);
            printLeerzeichen(laenge);
            System.out.println();

            laenge--;
            s += 2;
        }

        for(int i = stamm; i > 0; i--) {
            printLeerzeichen(baum-2);
            printSterne(3);
            printLeerzeichen(baum-2);
            System.out.println("");
        }
    }

//		Leerzeichen
    public static void printLeerzeichen(int anzahl) {

        while(anzahl > 0) {
            System.out.print(" ");
            anzahl --;
        }
    }

//		Sterne
    public static void printSterne(int anzahl) {

        while(anzahl > 0) {
            System.out.print("*");
            anzahl --;
        }

	}

}
