
public class Nullstellenrechner {

	public static void main(String[] args) {
		int a = 4;
		int b = -7;
		int c = 3;

		if (a != 0) {
			double d = Math.pow(b, 2) - (4 * a * c);
			if (d < 0) {
				System.out.println("Geht Nicht D<0");
			}
			if (d > 0) {
				System.out.println("Zwei Nullstellen D>0");

				double x1 = (-b + Math.sqrt(d)) / (2 * a);
				double x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.println(x1);
				System.out.println(x2);
				
			} else {
				System.out.println("Eine Loesung D=0");

				double x0 = (-b + Math.sqrt(d)) / (2 * a);
				System.out.println(x0);
			}
		} else {
			System.out.println("keine quadratische Funktion");
		}

	}
	
	

}
