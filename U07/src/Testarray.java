public class Testarray
{

	public static void main(String[] args) {

		int[] a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		printIntArray("", randomIntArray(50, -1, 1));
		a = randomIntArray(5, 1, 10);
		getMinPos(a, 2);
		a = randomIntArray(10, 0, 9);
		printIntArray("a = ", a);
		addZahl(a, 100);
		printIntArray("a + 100 = ", a);
		a = randomIntArray(3, 1, 10);
		printIntArray("a =", a);
		swap(a, 0, 2);
		printIntArray("a + 100 = ", a);

	}

	public static void printIntArray(String msg, int[] a) {

		String ausgabe = "{";
		ausgabe = ausgabe + a[0];
		for (int i = 1; i < a.length; i++) {
			ausgabe = ausgabe + ", " + a[i];
		}
		System.out.println(msg + ausgabe + "}");
	}

	public static int[] randomIntArray(int anzahl, int von, int bis) {
		int[] ret = new int[anzahl];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int) (Math.random() * (bis - von + 1)) + von;
		}
		return ret;
	}
	
	 public static int getMaximum(int[] a) {

		 for (int i = 0; i < a.length; i++) {
			 for (int j = i + 1; j < a.length; j++) {
				 if (a[i] > a[j]) {
					 int tem = a[i];
					 a[i] = a[j];
					 a[j] = tem;
				 }
			 }
		 }
		 return a[a.length - 1];
	 }
	 
	 public static int getMinimum(int[] a) {
		 getMaximum(a);
		 return a[0];
	 }
	 
	 public static double getMittelwert(int[] a) {
		 
		 int mittelwert = 0;
		 for (int i = 0; i < a.length; i++) {
			 mittelwert = mittelwert + a[i];
		 }
		 mittelwert = mittelwert / a.length;
		 return mittelwert;
	 }
	 
	 public static int indexOf(int[] a, int z) {
		 
		 int ret = -1;
		 for (int i = 0; i < a.length; i++) {
			 if (z == a[i]) {
				 ret = i;
			 } 
		 }
		 return ret;
	 }
	 
	 public static int indexOf(int[] a, int z, int pos) {
		 
		 int ret = -1;
		 for (int i = z; i < a.length; i++) {
			 if (z == a[i]) {
				 ret = i;
			 } 
		 }
		 return ret;
	 }
	 
	 public static int getMinPos(int[] a, int pos) {
		 
		 for (int i = pos; i < a.length -1; i++) {
			 for (int j = 1; j < a.length - 1; j++) {
				 	 if (a[i] < a[j]) {
				 int tem = a[i];
				 a[i] = a[j];
				 a[j] = tem;
			 
				 	 }
			 }
		 }
		 return a[pos];

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
	 
//	 public static void sortMinArray(int[] a) {
//		 
//	 }
	 
//	 public static int[] delDoppelte(int[] a) {
//		 
//	 }

}
