
public class Kartentrick {

    /**
     * Der Titel wird ausgegeben, das array karten wird instanziert dann wird
     * fuellen 3 mal, natürlich wird immer ausgegeben und die Spalte gefragt ausgeführt
     * um die gesuchte karte in der Mitte zu bringen. Die Karte an Stelle 3 1 wird ausgedruckt
     * und gefragt ob man nochmals will.
     * * @param args
     */
    public static void main(String[] args) {
        System.out.println("Kartentrick");
        System.out.println("===========");

        do {
            int[][] karten = {{1, 8, 15}, {2, 9, 16}, {3, 10, 17}, {4, 11, 18}, {5, 12, 19}, {6, 13, 20},
                    {7, 14, 21}};
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

    /**
     * Bei der fuellen Methode wird der zweidimensionale array in einer anderen Reihenfolge
     * geschrieben, die spalte gibt an ab wo und wie das array umgestellt werden soll
     * @param karten ist der übergebene array der umgestellt werden soll
     * @param spalte ist ab wo er ugestellt werden soll
     * @return gibt das umgestellte array zurück
     */
    public static int[][] fuellen(int[][] karten, int spalte) {
//        ein array das gleich wie das karten array ist wird instanziert
        int[][] ret = new int[7][3];
//        ein array indem die Reihenfolge der umstellung der spalten wird instanziert
        int[] reihenfolge = {0, 1, 2};
//        drei arrays für die
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];
        int[] arr3 = new int[7];
//        die Reihenfoge der Spalten wird in den reihenfolgen array geschrieben
        if (spalte == 1) {
            reihenfolge[0] = 2;
            reihenfolge[1] = 0;
            reihenfolge[2] = 1;
        } else if (spalte == 3) {
            reihenfolge[0] = 1;
            reihenfolge[1] = 2;
            reihenfolge[2] = 0;
//            die spalten werden nach reihenfolge in den drei arrays geschrieben
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
//        das array mit der ersten Spalte wird in der ret array geschrieben. Mit
//        countern wird nach drei spalten immer eine neue Reihe genutzt
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
//        die counter werden zur stelle erhöht bei der das erste Element des zweiten
//        arrays sein soll
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
//            das ELement an Spalte 0 Reihe 4 wird hinzugefügt
            ret[4][0] = arr2[5];

        }
//        die counter werden zur stelle erhöht bei der das erste Element des dritten
//        arrays sein soll
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
//        die Elemente an Stelle 6 1 und 6 2 werden hinzugefügt
        ret[6][1] = arr3[5];
        ret[6][2] = arr3[6];
        return ret;
    }

    /**
     * Das array wird mit zwei for loops ausgegeben. Wenn die Zahl kleiner Zehn ist
     * dann werden zwei Leerzeichen vorher ausgedrückt wenn die Zahl gräßer Zehn ist
     * dann wird ein Leerzeichen davor ausgegeben.
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
