
public class Kartentrick {

	public static void main(String[] args) {
		System.out.println("Kartentrick");
		System.out.println("===========");
		
		do {
			 int[][] karten = {{1, 8, 15}, {2, 9, 16}, {3, 10, 17}, {4, 11, 18}, {5, 12, 19}, {6, 13, 20}, {7, 14, 21}};
			ausgeben(karten);
			int spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			System.out.println("Karte " + karten[3][1] +
			" wurde gewählt");
		} while (Character.toLowerCase(
				TestScannerErweitert.readChar("Nochmals (j/n)? ")) == 'j');
	}

	public static int[][] fuellen (int[][] karten, int spalte){
		int[][] ret = new int[7][3];
		int counter1 = 0;
		if (spalte == 1){
			for (int i = 2; i < 3; i++){
				int counter2 = 0;
				for (int j = 0; j < 6; j++){
					ret[counter2][counter1] = karten[j][i];
					counter2++;
					if (counter1 == 2){
						counter1 = -1;
					}
					counter1++;
				}
				if (i == 2){
					i = 0;
				}
			}
		} else if (spalte == 2) {
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 7; j++){
					ret = new int[i][j];
				}
			}
		} else {
			for (int i = 1; i < 3; i++){
				for (int j = 0; j < 7; j++){
					ret = new int[i][j];
				}
				if (i == 2){
					i = -1;
				}
			}
		}
		return ret;
	}

	public static void ausgeben(int[][] karten) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				if (karten[i][j] < 10) {
					System.out.print("  " + karten[i][j]);
				} else {
					System.out.print(" " + karten[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}

}
