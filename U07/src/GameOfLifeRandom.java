import java.awt.*;
import java.applet.*;

public class GameOfLifeRandom extends Applet
{

	public void paint(Graphics g) {
		final int ANZAHL_ZEILEN = 100;
		final int ANZAHL_SPALTEN = 100;
		final int MAX_SCHRITTE = 20;
		boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		matrix1 = fuellenMatrixSternMitte(matrix1, 20);
		boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		int i = 0;
		do {
			ausgebenMatrix(g, matrix1);
			matrix2 = matrix1.clone();
			matrix1 = berechneMatrix(matrix2, ANZAHL_ZEILEN, ANZAHL_SPALTEN);
			i++;
			delay(200);
		} while (i < MAX_SCHRITTE && existierenUnterschiede(matrix1, matrix2));

	}

	/**
	 * Gibt eine Matrix mit der größe der gegebenen Matrix zurück und fuellt in die
	 * Mitte dieser einen Stern mit der Seitenlaenge größe.
	 * @param m1 gegebene Matrix
	 * @param groesse länge der seiten des Sterns
	 * @return die Matrix in der der Stern eingefügt wurde
	 */
	public static boolean[][] fuellenMatrixSternMitte(boolean[][] m1, int groesse) {
		boolean[][] ret = null;
		m1[(int) Math.floor(m1.length / 2)][(int) Math.floor(m1[0].length / 2)] = true;
		for (int i = 0; i < groesse + 1; i++) {
			m1[(int) Math.floor(m1.length / 2) + i][(int) Math.floor(m1[0].length / 2)] = true;
			m1[(int) Math.floor(m1.length / 2) - i][(int) Math.floor(m1[0].length / 2)] = true;
			m1[(int) Math.floor(m1.length / 2)][(int) Math.floor(m1[0].length / 2) + i] = true;
			m1[(int) Math.floor(m1.length / 2)][(int) Math.floor(m1[0].length / 2) - i] = true;
		}
		ret = m1;
		return ret;
	}

	/**
	 * Die Übergebene Matrix wird am Bildschirm ausgegeben
	 * 
	 * @param g Zeichenflaeche auf der die Matrix ausgegeben wird
	 * @param m die Matrix die ausgegeben werden soll
	 */
	public void ausgebenMatrix(Graphics g, boolean[][] m) {
		int breite = getWidth();
		int hoehe = getHeight();
		g.setColor(Color.gray);
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] == true)
					g.setColor(Color.black);
				g.fillRect(breite / m.length * j, hoehe / m[0].length * i, breite / m.length, hoehe / m[0].length);
				g.setColor(Color.gray);
			}
		}
	}

	/**
	 * Berechnet die Lebenden Nachbarn eines Feldes in der Matrix und gibt sie
	 * zurück wobei Nachbarfelder alle 8 Falder rund ums Feld herum sind.
	 * 
	 * @param m1
	 *          die Matrix in der das Feld liegt
	 * @param zeile
	 *          die Zeile in der das Feld liegt
	 * @param spalte
	 *          die Spalte in der das Feld liegt
	 * @return die anzahl an Nachbarfelder die Leben
	 */
	public static int anzahlLebendeNachbaren(boolean[][] m1, int zeile, int spalte) {
		int ret = 0;
		if (zeile != 0 && spalte != 0 && m1[zeile - 1][spalte - 1] == true)
			ret++;
		if (zeile != 0 && m1[zeile - 1][spalte] == true)
			ret++;
		if (zeile != 0 && spalte != m1[0].length - 1 && m1[zeile - 1][spalte + 1] == true)
			ret++;
		if (spalte != 0 && m1[zeile][spalte - 1] == true)
			ret++;
		if (spalte != m1[0].length - 1 && m1[zeile][spalte + 1] == true)
			ret++;
		if (zeile != m1.length - 1 && spalte != 0 && m1[zeile + 1][spalte - 1] == true)
			ret++;
		if (zeile != m1.length - 1 && m1[zeile + 1][spalte] == true)
			ret++;
		if (zeile != m1.length - 1 && spalte != m1[0].length - 1 && m1[zeile + 1][spalte + 1] == true)
			ret++;
		return ret;
	}

	/**
	 * Berechnet die Lebenden Felder aufgrund von Conway's Game of Life neu und gibt
	 * die neu berechnete Matrix zurück
	 * 
	 * @param m1
	 *          die alte Matrix
	 * @param zeilen
	 *          die anzahl der Zeilen die die Matrix besitzt
	 * @param spalten
	 *          die anzahl an Spalten die die Matrix besitzt
	 * @return die neu berechnete Matrix
	 */
	public static boolean[][] berechneMatrix(boolean[][] m1, int zeilen, int spalten) {
		boolean[][] ret = new boolean[zeilen][spalten];
		int lebendeNachbarn;
		for (int i = 0; i < m1[0].length; i++) {
			for (int j = 0; j < m1.length; j++) {
				lebendeNachbarn = anzahlLebendeNachbaren(m1, j, i);
				if (lebendeNachbarn < 2 || lebendeNachbarn > 3)
					ret[j][i] = false;
				else if (lebendeNachbarn == 3)
					ret[j][i] = true;
				else if (lebendeNachbarn == 2 && m1[j][i])
					ret[j][i] = true;
			}
		}
		return ret;
	}

	/**
	 * Vergleicht zwei Matrizen und überprüft ob unterschiede existieren
	 * 
	 * @param m1
	 *          Matrix 1
	 * @param m2
	 *          Matrix 2
	 * @return true wenn unterschiede existieren ansonsten false
	 */
	public static boolean existierenUnterschiede(boolean[][] m1, boolean[][] m2) {
		boolean ret = false;
		for (int i = 0; i < m1[0].length && ret == false; i++) {
			for (int j = 0; j < m1.length && ret == false; j++) {
				if (m1[i][j] != m2[i][j])
					ret = true;
			}
		}
		return ret;
	}

	/**
	 * Veranlasst dass das Programm millis Millisekunden pausiert
	 * 
	 * @param millis
	 *          Anzahl der Millisekunden die gewartet werden
	 */
	public void delay(int millis) {
		try {
			Thread.sleep(millis);

		} catch (InterruptedException e) {
		}
	}

	/**
	 * Fügt in eine übergebene Matrix an zufälligen Positionen lebende Felder ein im
	 * Verhältnis verhältnis
	 * 
	 * @param m1
	 *          die Matrix in die leben eingefülltwerden soll
	 * @param verhältnis
	 *          das Verhältnis wie viel Leben eingefügt werden soll
	 * @return die Matrix mit eingefülltem Leben
	 */
	public static boolean[][] fuellenMatrixZufaellig(boolean[][] m1, double verhältnis) {
		boolean[][] ret = null;
		int anzahl = (int) (verhältnis * m1.length * m1[0].length);
		int i = 0;
		int zufall1 = 0;
		int zufall2 = 0;
		while (i < anzahl) {
			zufall1 = (int) (Math.random() * m1.length);
			zufall2 = (int) (Math.random() * m1.length);
			if (m1[zufall1][zufall2] == false) {
				m1[zufall1][zufall2] = true;
				i++;
			}
		}
		ret = m1;
		return ret;
	}
}
