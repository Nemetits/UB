public class Testarray
{

	public static void main(String[] args) {

		int[] a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		printIntArray("", randomIntArray(50, -1, 1));
		a = randomIntArray(5, 1, 10);
		printIntArray("min max",a);
		System.out.println(getMinPos(a, 2));
		System.out.println(getMaximum(a));
		System.out.println(getMinimum(a));
		System.out.println(getMittelwert(a));
		a = randomIntArray(10, 0, 9);
		printIntArray("a = ", a);
		addZahl(a, 100);
		printIntArray("a + 100 = ", a);
		a = randomIntArray(3, 1, 10);
		printIntArray("a = ", a);
		swap(a, 0, 2);
		printIntArray("a + 100 = ", a);
		a = randomIntArray(10, 1, 1000);
		sortMinArray(a);
		printIntArray("sort = ", a);
		int[] b = {1, 2 , 1, 1, 3, 4, 5, 5};
		b = delDoppelte(b);
		printIntArray("del doppelte", b);

	}

	/**
	 * Diese Methode gibt als erstes die Klammer mit dem erstern Element
	 * des arrays in einem String, dann werden mit einer for Schleife die
	 * weiteren Elemente des arrays im String geschrieben. Zum Schluss
	 * wird msg, das String und eine Klammer ausgedruckt.
	 * @param msg ist was vor dem array ausgegeben wird
	 * @param a ist das array das ausgedruckt werden soll
	 */
	public static void printIntArray(String msg, int[] a) {

		String ausgabe = "{";
		ausgabe = ausgabe + a[0];
		for (int i = 1; i < a.length; i++) {
			ausgabe = ausgabe + ", " + a[i];
		}
		System.out.println(msg + ausgabe + "}");
	}

	/**
	 * ein array wird mit der länge anzahl instanziert. Dann werden mit
	 * Math.random zufällige Zahlen von von bis bis ins arraz geschrieben
	 * @param anzahl ist wie lang das array sien soll
	 * @param von ist die kleinste Zahl die im array vorkommen kann
	 * @param bis ist die größte Zahl die im array vorkommen kann
	 * @return ret gibt das array mit den random generierten Zahlen zurück
	 */
	public static int[] randomIntArray(int anzahl, int von, int bis) {

		int[] ret = new int[anzahl];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int) (Math.random() * (bis - von + 1)) + von;
		}
		return ret;
	}

	/**
	 * ein int wird initialisiert indem das ersten Elements geschrieben
	 * wird. mit einer for schleife wird kontrolliert ob das nächte Element
	 * größer als das Element in tem, wenn ja wird das Element ausgetauscht
	 * @param a ist das array das übergeben wird
	 * @return gibt tem zurück und in tem ist das größte Element von a
	 * geschriben
	 */
	 public static int getMaximum(int[] a) {

		 int tem = a[0];
		 for (int i = 0; i < a.length; i++) {
				 if (a[i] > tem) {
					 tem = a[i];
			 }
		 }
		 return tem;
	 }

	/**
	 *  ein int wird initialisiert indem das ersten Elements geschrieben
	 * wird. mit einer for schleife wird kontrolliert ob das nächte Element
	 * kleiner als das Element in tem, wenn ja wird das Element ausgetauscht
	 * @param a ist das array das übergeben wird
	 * @return gibt tem zurück und in tem ist das kleinste Element von a
	 * geschrieben
	 */
	public static int getMinimum(int[] a) {

		 int tem = a[0];
		 for (int i = 0; i < a.length; i++) {
				 if (a[i] < tem) {
					 tem = a[i];
			 }
		 }
		 return tem;
	 }

	/**
	 * bei getMittelwert werden alle Elemente eines arrays zusammengezählt
	 * und dann werden sei durch die anzahl des übergebenen dividiert.
	 * @param a ist der übergebene String
	 * @return gibt den mittelwert zurück
	 */
	public static double getMittelwert(int[] a) {
		 
		 double mittelwert = 0;
		 for (int i = 0; i < a.length; i++) {
			 mittelwert = mittelwert + a[i];
		 }
		 mittelwert = mittelwert / (double) a.length;
		 return mittelwert;
	 }

	/**
	 * mit einer for Schleife wird uberprüft ob es das gesuchte Element gibt
	 * wenn ja wird der index des Elements geschrieben, wenn nicht dann wird
	 * -1 zurück gegeben
	 * @param a ist das übergebene array
	 * @param z ist die zu suchende Zahl
	 * @return gibt den index der Zahl oder -1 zurück
	 */
	 public static int indexOf(int[] a, int z) {
		 
		 int ret = -1;
		 for (int i = 0; i < a.length; i++) {
			 if (z == a[i]) {
				 ret = i;
				 return ret;
			 } 
		 }
		 return ret;
	 }

	/**
	 * mit einer for Schleife wird uberprüft ob es das gesuchte Element ab der
	 * Position pos gibt wenn ja wird der index des Elements geschrieben, wenn
	 * nicht dann wird -1 zurück gegeben
	 * @param a ist das übergebene array
	 * @param z ist das gesuchte Element
	 * @param pos ist die Stelle ab der gesucht werden soll
	 * @return gibt den index der Zahl oder -1 zurück
	 */
	 public static int indexOf(int[] a, int z, int pos) {
		 
		 int ret = -1;
		 for (int i = pos; i < a.length; i++) {
			 if (z == a[i]) {
				 ret = i;
				 return ret;
			 } 
		 }
		 return ret;
	 }

	/**
	 * bei getMinpos wird nach der kleinsten Zahl ab der Position pos gesucht.
	 * Mit einer for schleife wird kontrolliert ob das nächte Element
	 * kleiner als das Element in tem, wenn ja wird das Element ausgetauscht
	 * und in ret wird der index der Zahl geschrieben
	 * @param a ist das übergebene array
	 * @param pos ist die Position ab der gesucht werden soll
	 * @return gibt den index der Zahl zurück
	 */
	 public static int getMinPos(int[] a, int pos) {

		 int tem = a[pos];
		 int ret = 0;
		 for (int i = pos; i < a.length; i++) {
			 if (a[i] <= tem) {
				 tem = a[i];
				 ret = i;
			 }
		 }
		 return ret;
	 }

	/**
	 * bei addZahl wird mit einer for Schleife zu jedem Element eines
	 * arrays die zahl z dazugezählt
	 * @param a ist das array indem die Elemente mit z erhöt werden
	 * @param z ist die Zahl die zu den Elementen von a dazugezählt
	 * werden soll
	 */
	 public static void addZahl(int[] a, int z) {

		for (int i = 0; i < a.length; i++){
			a[i] += z;
		}
	 }

	/**
	 * Bei swap werden zwei Elemente vertauscht. Man speichert als
	 * erstes das Element an i in tem dann wird das Element an j
	 * an der i-ten Stelle gespeichert und das Element in tem wird
	 * an der j-ten Stelle gespeichert.
	 * @param a ist das übergebene array
	 * @param i ist der index des ersten Element
	 * @param j ist der index des zweiten Element
	 */
	 public static void swap(int[] a, int i, int j) {

		 int tem = a[i];
		 a[i] = a[j];
		 a[j] = tem;
	 }

	/**
	 * sortMinarray nutzt getMinpos um das kleinste Element ab einer
	 * Stelle zu finden und dann swap um es umzutauschen um das
	 * array zu sortieren
	 * @param a ist das zu sortierende array
	 */
	public static void sortMinArray(int[] a) {

		for (int i = 0; i < a.length; i++){
			int min = getMinPos(a, i);
			swap(a, i, min);
		}
	 }

	/**
	 * bei del Doppelte wird dass array als erstes sortiert dann wird
	 * überprüft ob ein Element mit dem nächsten Element gleich ist,
	 * wenn ja dann wird der index erhöht, wenn dann das nächste Element
	 * nicht gleich ist wird dieses Element ins tem2 array geschrieben
	 * als letztes werden die so viele Stellen wie es counter gibt entfernt
	 * und das letzte Element wird dann dazugenommen
	 * @param a ist das übergebene array
	 * @return gibt das array ohne doppelte elemente zurück
	 */
	 public static int[] delDoppelte(int[] a) {
		 int[] tem2 = new int[a.length];
		 int counter = 0;
		 sortMinArray(a);
		 for (int i = 0; i < a.length - 1; i++) {
		 	if (a[i] == a[i + 1]){
		 		i++;
			} else {
				tem2[counter] = a[i];
				counter++;
			}
		 }
		 int[] ret = new int[counter + 1];
		 for (int i = 0; i < counter; i++){
		 	ret[i] = tem2[i];
		 }
		 ret[counter] = a[a.length - 1];
		 return ret;
	 }
}
