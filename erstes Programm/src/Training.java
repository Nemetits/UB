
public class Training {

	public static void main(String[] args) {
		
		 int[] kek = new int[5];
		 int hallo = 1;
		 double  hallo1 = 1.5;
		 char hallo2 = '*';
		 String hallo3 = "Flapp mag Kekse";
		 
		 System.out.println(hallo3.length());
		 System.out.println(hallo3.charAt(2));
		 System.out.println(hallo3.contains("sd"));
		 System.out.println(hallo3.indexOf("pp"));
		 System.out.println(hallo3.substring(1));
		 System.out.println(hallo3.substring(10, 15));
		 System.out.println(hallo3.toUpperCase());
		 System.out.println(hallo3 + hallo3);
		 System.out.println(hallo3);
		 System.out.println(hallo3 + " kaka " + hallo3);
		 		 
		 kek[kek.length - 1] = 1231231;
		 for (int j= 0; j < 5; j++) {
			 System.out.println(j);
		 }
		 
		System.out.println(kek.length);
		
		
		
		
		
//		System.out.println("Verschlüsselung nach Caesar");
//        System.out.println("===========================");
//        // deklarierung der variablen
//        char vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
//        while (vea != 'a') {
//            String text = TestScannerErweitert.readString("Text: ");
//            int ver = TestScannerErweitert.readInt("Verschiebung: ");
//            char a = 'a';
//            int j = 122;
//            int k = (char) ver;
//            int l = 97;
//            // verschiebung nach Caesar verschlüsselung
//            if (vea == 'v') {
//                for (int i = 0; i < text.length(); i++) {
//                    a = text.charAt(i);
//                    if (Character.isWhitespace(a)) {
//                        i++;
//                        a = text.charAt(i);
//                    }
//                    a = (char) (a + ver);
//                    k = a;
//                    if (j < a) {
//                        k = k - j;
//                        a = (char) ((int) 'a' + (int) k - 1);
//                    }
//                    a = Character.toUpperCase(a);
//                    System.out.print(a);
//
//                }
//
//
//            }else if (vea == 'e') {
//                for (int i = 0; i < text.length(); i++) {
//                    a = text.charAt(i);
//                    if (Character.isWhitespace(a)) {
//                        i++;
//                        a = text.charAt(i);
//                    }
//                    a = (char) (a - ver);
//                    k = a;
//                    if (l > a) {
//                        k = l - k;
//                        a = (char) ((int) 'z' - (int) k + 1);
//                    }
//                    a = Character.toUpperCase(a);
//                    System.out.print(a);
//
//                }
//
//            }
//            System.out.println();
//            vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
//
//        }

    }

}
