
public class Kartentrick {

	public static void main(String[] args) {
		System.out.println("Kartentrick");
		System.out.println("===========");

		do {
			int[][] karten = { { 1, 8, 15 }, { 2, 9, 16 }, { 3, 10, 17 }, { 4, 11, 18 }, { 5, 12, 19 }, { 6, 13, 20 },
					{ 7, 14, 21 } };
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
			System.out.println("Karte " + karten[3][1] + " wurde gewählt");
		} while (Character.toLowerCase(TestScannerErweitert.readChar("Nochmals (j/n)? ")) == 'j');
	}

	public static int[][] fuellen(int[][] karten, int spalte) {
		int[][] ret = new int[7][3];
		int[] reihenfolge = { 0, 1, 2 };
		int[] arr1 = new int[7];
		int[] arr2 = new int[7];
		int[] arr3 = new int[7];
		if (spalte == 1) {
			reihenfolge[0] = 2;
			reihenfolge[1] = 0;
			reihenfolge[2] = 1;
		} else if (spalte == 3) {
			reihenfolge[0] = 1;
			reihenfolge[1] = 2;
			reihenfolge[2] = 0;
		}
		for (int i = 0; i < 7; i++) {
			arr1[i] = karten[i][reihenfolge[0]];
		}
		for (int i = 0; i < 7; i++) {
			arr2[i] = karten[i][reihenfolge[1]];
		}
		for (int i = 0; i < 7; i++) {
			arr3[i] = karten[i][reihenfolge[2]];
		}
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < 7; i++) {
			if (i == 3 || i == 6) {
				counter1 = 0;
				counter2++;
			} else if (i == 4) {
				counter1 = 1;
			} else if (i == 5) {
				counter1 = 2;
			}
			ret[counter2][counter1] = arr1[i];
			if (i < 3) {
				counter1++;
			}
		}

		counter1 = 1;
		counter2 = 2;
		for (int i = 1, j = 0; i < 9 && j < 7; i++, j++) {
			if (i == 3) {
				counter1 = 0;
				counter2++;
			} else if (i == 6) {
				counter1 = 1;
				counter2++;
			} else if (i == 5) {
				counter1 = 2;
			} else if (i == 4) {
				counter1 = 1;
			}
			ret[counter2][counter1] = arr2[j];
			if (i < 3) {
				counter1++;
			}
			ret[4][0] = arr2[5];

		}
		counter1 = 2;
		counter2 = 4;
		for (int i = 2, j = 0; i < 7 && j < 7; i++, j++) {
			if (i == 3 || i == 6) {
				counter1 = 0;
				counter2++;
			} else if (i == 4) {
				counter1 = 1;
			} else if (i == 5) {
				counter1 = 2;
			}
			ret[counter2][counter1] = arr3[j];
			if (i < 3) {
				counter1++;
			}
		}
		ret[6][1] = arr3[5];
		ret[6][2] = arr3[6];
		return ret;
	}
/**
 * 
 * @param karten ist das array das ausgedruckt wird wird
 */
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
