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
	 * ein int wird
	 * @param a
	 * @return
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
	 
	 public static int getMinimum(int[] a) {

		 int tem = a[0];
		 for (int i = 0; i < a.length; i++) {
				 if (a[i] < tem) {
					 tem = a[i];
			 }
		 }
		 return tem;
	 }
	 
	 public static double getMittelwert(int[] a) {
		 
		 double mittelwert = 0;
		 for (int i = 0; i < a.length; i++) {
			 mittelwert = mittelwert + a[i];
		 }
		 mittelwert = mittelwert / (double) a.length;
		 return mittelwert;
	 }
	 
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
	 
	 public static void addZahl(int[] a, int z) {

		for (int i = 0; i < a.length; i++){
			a[i] += z;
		}
	 }
	 
	 public static void swap(int[] a, int i, int j) {

		 int tem = a[i];
		 a[i] = a[j];
		 a[j] = tem;
	 }
	 
	 public static void sortMinArray(int[] a) {

		for (int i = 0; i < a.length; i++){
			int min = getMinPos(a, i);
			swap(a, i, min);
		}
	 }
	 
	 public static int[] delDoppelte(int[] a) {
		 int[] tem2 = new int[100];
		 int counter = 0;
		 sortMinArray(a);
		 printIntArray("test ", a);
		 for (int i = 0; i < a.length - 1; i++) {
		 	if (a[i] == a[i + 1]){
		 		i++;
			} else {
				tem2[counter] = a[i];
				counter++;
			}
		 }
		 printIntArray("test ", tem2);
		 int[] ret = new int[counter + 1];
		 for (int i = 0; i < counter; i++){
		 	ret[i] = tem2[i];
		 }
		 ret[counter] = a[a.length - 1];
		 return ret;
	 }
}
