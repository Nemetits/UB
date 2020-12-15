
public class Weihnachtsbaum {

	public static void main(String[] args) {
		int laenge = 14;
    int s = 1;

//		der Baum und der Stamm wird ausgegeben wird ausgegeben
    while(laenge >= 0) {

        printLeerzeichen(laenge);
        printSterne(s);
        printLeerzeichen(laenge);
        System.out.println();

        laenge--;
        s += 2;
    }

    for(int i = 1; i <=3; i++) {
        printLeerzeichen(13);
        printSterne(3);
        printLeerzeichen(13);
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
