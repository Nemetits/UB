
public class TextStatistik {

	public static void main(String[] args) {
		System.out.println("Textstatistik");
		System.out.println("=============");
		String s = TestScannerErweitert.readString("Text: ");
		while (s.length() < 1) {
			System.out.println("Text muss mindestens ein Zeichen enthalten");
			s = TestScannerErweitert.readString("Text: ");
		}
		int zeichen = 0;
		int leerzeichen = 0;
		int selbstlaute = 0;
		int buchstaben = 0;
		for (int j = 0; j < s.length(); j++) {
			if (Character.isLetter(s.charAt(j))) {
				buchstaben++;
				zeichen++;
				char c = Character.toLowerCase(s.charAt(j));
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					selbstlaute++;
				}
			}
			else if (Character.isWhitespace(s.charAt(j))) {
				leerzeichen++;
				zeichen++;
				}
			}
		System.out.println("Anzahl Selbslaute: " + selbstlaute);
		System.out.println("Anzahl Buchstaben: " + buchstaben);
		System.out.println("Anzahl Leerzeichen: " + leerzeichen);
		System.out.println("Anzahl Zeichen: " + zeichen);
	}
}
