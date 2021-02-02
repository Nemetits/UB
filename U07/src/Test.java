public class Test {
    public static int[][] fuellen(int[][] karten, int spalte) {
        int[][] ret = new int[7][3];
        int[] helparray = new int[3];
        switch (spalte) {
            // Wenn spalte 0 ist, wird das Array gefüll
            case 0: {
                for (int i = 0; i < ret.length; i++) {
                    for (int j = 0; j < ret[i].length; j++) {
                        switch (j) {
                            case 0: {
                                ret[i][j] = i + 1;
                                break;
                            }
                            case 1: {
                                ret[i][j] = i + 8;
                                break;
                            }
                            case 2: {
                                ret[i][j] = i + 15;
                                break;
                            }
                        }
                    }
                }
                break;
            }
            /*
             * Die Spalten werden je nach dem welche Zahl eingegeben wird geordnet. Dabei
             * * ist die eingegebene Zahl die Spalte die in der Mitte sein soll.
             * */
            case 1: {
                helparray[0] = 2;
                helparray[1] = 0;
                helparray[2] = 1;
                break;
            }
            case 2: {
                helparray[0] = 0;
                helparray[1] = 1;
                helparray[2] = 2;
                break;
            }
            case 3: {
                helparray[0] = 1;
                helparray[1] = 2;
                helparray[2] = 0;
                break;
            }
        }
        return null;
        // Die Karten werden neu zeilenweis in d
    }
}