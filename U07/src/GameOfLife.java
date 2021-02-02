import java.awt.*;
import java.applet.*;
import java.util.Random;

public class GameOfLife extends Applet {
    /**
     * Die ganzen Variablen und Konstanten werden initialisiert und instanziert.
     * Dann wird eine Schleife solagne ausgeführt bis counter kleiner als die
     * Schritte sind oder die Unterschiede
     * @param g Graphic Applet
     */
    public void paint(Graphics g) {
        // Fixe Anzahl von Zeilen und Spalten
        final int ANZAHL_ZEILEN = 11;
        final int ANZAHL_SPALTEN = 11;
        // Maximale Anzahl von Iterationsschritten
        final int MAX_SCHRITTE = 5;
        boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
        matrix1 = fuellenMatrixZufaellig(matrix1, 20);
        boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
        int counter = 0;
        do {
            ausgebenMatrix(g, matrix1);
            matrix2 = matrix1.clone();
            matrix1 = berechneMatrix(matrix2, ANZAHL_ZEILEN, ANZAHL_SPALTEN);
            counter++;
            bremse(200);
        } while (counter < MAX_SCHRITTE || exisitierenUnterschiede(matrix1, matrix2) == false);
    }

    /**
     * Diese Methode instanziert ein boolean array indem das übergebene array kopiert
     * wird und dann das Kreuz geschrieben wird. Als erstes wird der Punkt in der Mitte
     * geschrieben, dann mit einem for loop werden in richtung x, -x, y und -y so viele
     * Punkte wie übergeben geschrieben.
     * @param matrix ist das übergebene array
     * @param groesse ist die gräße des Kreuzes
     * @return
     */
    public static boolean[][] fuellenMatrixSternMitte(boolean[][] matrix, int groesse) {
        boolean[][] ret = matrix;
        ret[matrix.length / 2][matrix.length / 2] = true;
        for (int i = 0; i < groesse; i++) {
            ret[(matrix.length / 2) + i][matrix[0].length / 2] = true;
            ret[(matrix.length / 2) - i][matrix[0].length / 2] = true;
            ret[matrix.length / 2][(matrix[0].length / 2) + i] = true;
            ret[matrix.length / 2][(matrix[0].length / 2) - i] = true;
        }
        return ret;
    }

    /**
     * Bei ausgebenMatrix wird die breite und die höhe ermittelt, dann wird die Farbe
     * der Kästchen bestimmt. Mit zwei for loops wird dann die Farbe der Kästchen die true
     * sind bestimmt und die anderen werden mit der gleichen Farbe gefüllt mit der die
     * ersten zwei Felder gefüllt werden.
     * @param g Graphic Applet
     * @param matrix das übergebene array
     */
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

    /**
     * bei anzahlLebendeNachbarn werden alle möglichkeiten geprüft bei der ein Element einen
     * Nachbarn haben kann, wenn es einen Nachbarn hat, dann wird ret int um eines erhöht.
     * @param matrix1 ist das array bei dem die Nachbaren geprüft werden.
     * @param zeile ist die Zeile indem sich das zu prüfende Element befindet
     * @param spalte ist die Spalte indem sich das zu prüfende Element befindet
     * @return gibt die Anzahl der lebenden Nachbarn zurück
     */
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

    /**
     * Bei berechneMatrix wird überprüft wie viele nachbarn das Element hat. wenn das Element
     * kleiner 2 oder größer 3 Nachbarn hat dann wird das Element false, wenn das Element 3
     * Nachbarn hat dann wird das Element true bei allen anderen fällen wird es auch true.
     * Um die Nachbarn zu ermitteln wird anzahlLebendeNachbarn benutzt.
     * @param matrix
     * @param zeilen
     * @param spalten
     * @return
     */
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

    /**
     * bei existierenUnterschiede werden alle Elemente an der gleichen Position verglichen,
     * wenn sie bei auch nur einer Stelle nicht gleich sind wird der ret boolean true.
     * @param matrix1 das array das geändert wurde
     * @param matrix2 das array bevor es geändert wurde
     * @return
     */
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

    /**
     * Bei fuellenMatrixZuefallig wird bei jeder Stelle des arrays ein neuer Random Wert
     * in einen double gefüllt und mit prozent verglichen, wenn der Random Wert kleiner
     * ist dann ist das Element an der Stelle j i true sonst ist es false.
     * @param matrix ist das übergebene array
     * @param prozent ist die Wahrscheinlichkeit der Elemente true zu sein
     * @return gibt das array mit den Random generierten true Elementen zurück
     */
    public static boolean[][] fuellenMatrixZufaellig(boolean[][] matrix, double prozent){
        double rand = 0;
        boolean[][] ret = matrix;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                 rand = Math.random();
                 if (rand < prozent){
                     ret[j][i] = true;
                 }
            }
        }
        return ret;
    }
}
