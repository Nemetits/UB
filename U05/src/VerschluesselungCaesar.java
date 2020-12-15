public class VerschluesselungCaesar {

	public static void main(String[] args) {
		// Ausgabe vom Titel und eingabe vom vea
		System.out.println("Verschlüsselung nach Caesar");
		System.out.println("===========================");
		char vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
		while (vea != 'a') {
			// variabeln
			String s = TestScannerErweitert.readString("Text: ");
			int v = TestScannerErweitert.readInt("Verschiebung: ");
			char a = 'a';
			int j = 122;
			int k = (char) v;
			int l = 97;
			s = s.toLowerCase();
			// verschlüsselung
			if (vea == 'v') {
				for (int i = 0; i < s.length(); i++) {
					a = s.charAt(i);
					// wenn es ein Leerzeichen ist wird dieser char einfach übersprungen
					if (Character.isWhitespace(a)) {
						i++;
						a = s.charAt(i);
					}
					a = (char) (a + v);
					k = a;
					if (j < a) {
						k -= j;
						a = (char) ((int) 'a' + (int) k - 1);
					}
					a = Character.toUpperCase(a);
					System.out.print(a);

				}

				// entschlüsseln
			} else if (vea == 'e') {
				for (int i = 0; i < s.length(); i++) {
					a = s.charAt(i);
					if (Character.isWhitespace(a)) {
						i++;
						a = s.charAt(i);
					}
					a = (char) (a - v);
					k = a;
					if (l > a) {
						k = l - k;
						a = (char) ((int) 'z' - (int) k + 1);
					}
					a = Character.toUpperCase(a);
					System.out.print(a);

				}

			}
			System.out.println();
			vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");

		}
	}

}
