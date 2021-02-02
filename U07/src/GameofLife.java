import java.awt.*;
import java.applet.*;

public class GameofLife extends Applet {
    public void paint(Graphics g) {
        // Fixe Anzahl von Zeilen und Spalten
        final int ANZAHL_ZEILEN = 11;
        final int ANZAHL_SPALTEN = 11;
        // Maximale Anzahl von Iterationsschritten
        final int MAX_SCHRITTE = 5;
        boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
        matrix1 = fuellenMatrixSternMitte(matrix1, 5);
        boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
        int counter = 0;
        do {
            ausgebenMatrix(g, matrix1);
            matrix2 = matrix1.clone();
            matrix1 = berechneMatrix(matrix2, ANZAHL_ZEILEN, ANZAHL_SPALTEN);
            counter++;
            bremse(1000);
        } while (counter < MAX_SCHRITTE && exisitierenUnterschiede(matrix1, matrix2));
    }

    public static boolean[][] fuellenMatrixSternMitte(boolean[][] matrix, int groesse) {
        boolean[][] ret = matrix;
        matrix[matrix.length / 2][matrix.length / 2] = true;
        for (int i = 0; i < groesse; i++) {
            ret[(matrix.length / 2) + i][matrix[0].length / 2] = true;
            ret[(matrix.length / 2) - i][matrix[0].length / 2] = true;
            ret[matrix.length / 2][(matrix[0].length / 2) + i] = true;
            ret[matrix.length / 2][(matrix[0].length / 2) - i] = true;
        }
        return ret;
    }

    public void ausgebenMatrix(Graphics g, boolean[][] matrix) {
        int breite = getWidth();
        int hoehe = getHeight();
        g.setColor(Color.darkGray);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i]) {
                    g.setColor(Color.red);
                }
                g.fillRect((breite + 5) / matrix.length * j, (hoehe + 5) / matrix[0].length * i, (breite - 5) / matrix.length,
                        (hoehe - 5) / matrix[0].length);
                g.setColor(Color.darkGray);
            }
        }
    }

    public static int anzahlLebendeNachbaren(boolean[][] matrix1, int zeile, int spalte) {
        int ret = 0;
        if (zeile != 0 && spalte != 0 && matrix1[zeile - 1][spalte - 1])
            ret++;
        if (zeile != 0 && matrix1[zeile - 1][spalte])
            ret++;
        if (zeile != 0 && spalte != matrix1[0].length - 1 && matrix1[zeile - 1][spalte + 1])
            ret++;
        if (spalte != 0 && matrix1[zeile][spalte - 1])
            ret++;
        if (spalte != matrix1[0].length - 1 && matrix1[zeile][spalte + 1])
            ret++;
        if (zeile != matrix1.length - 1 && spalte != 0 && matrix1[zeile + 1][spalte - 1])
            ret++;
        if (zeile != matrix1.length - 1 && matrix1[zeile + 1][spalte])
            ret++;
        if (zeile != matrix1.length - 1 && spalte != matrix1[0].length - 1 && matrix1[zeile + 1][spalte + 1])
            ret++;
        return ret;
    }

    public static boolean[][] berechneMatrix(boolean[][] matrix, int zeilen, int spalten){
        boolean[][] ret = new boolean[zeilen][spalten];
        int nachbaren;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                nachbaren = anzahlLebendeNachbaren(matrix, j, i);
                if (nachbaren < 2 || nachbaren > 3)
                    ret[j][i] = false;
                else if (nachbaren == 3)
                    ret[j][i] = true;
                else if (matrix[j][i])
                    ret[j][i] = true;
            }
        }
        return ret;
    }
    public static boolean exisitierenUnterschiede (boolean[][] matrix1, boolean[][] matrix2){
        boolean ret = false;
        for (int i = 0; i < matrix1[0].length; i++){
            for (int j = 0; j < matrix2.length; j++){
                if (matrix1[j][i] != matrix2[j][i]){
                    ret = true;
                }
            }
        }
        return ret;
    }

    /**
     * Veranlasst dass das Programm millis Millisekunden pausiert
     * @param millis Anzahl der Millisekunden die gewartet werden
     */
    public void bremse(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }
}
