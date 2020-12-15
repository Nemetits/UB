
public class VerschluesselungDrehen {

	public static void main(String[] args) {
		// titel wird ausgedruckt
		System.out.println("Verschlüsselung durch Drehen");
		System.out.println("============================");

		for (boolean b = true; b != false;) {
			String s = TestScannerErweitert.readString("Text: ");
			while (s.length() < 1) {
				System.out.println("Text muss mindestens ein Zeichen enthalten");
				s = TestScannerErweitert.readString("Text: ");
			}
			System.out.print("Verschlüsselt: ");
			int i = 0;
			int j = s.length() - 1;
//			int c = s.length() - 1;
			String a = "";
			while (i <= s.length() / 2) {
				a += s.charAt(i);
				a += s.charAt(j);
				j--;
				i++;
			}
			if (s.length() % 2 == 0)
				System.out.println(a.substring(0, a.length() - 2));
			else
				System.out.println(a.substring(0, a.length() - 1));
			char d = TestScannerErweitert.readChar("Nochmal (j/n)? ");
			if (d == 'j')
				b = true;
			else
				b = false;
		}
	}

}
