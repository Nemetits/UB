
public class ZeichensatzAnalyse {

	public static void main(String[] args) {
		String isLetter = "";
		int count = 0;
		String isDigit = "";
		int count2 = 0;
		String isWhitespace = "";
		String isLowerCase = "";
		int count3 = 0;
		String isUpperCase = "";
		int count4 = 0;
		for(int i=32; i<=255; i++) {
			if (Character.isLetter((char) i)) {
				isLetter += (char) i + ((count + 1) % 31 == 0 ? "\n" : " ");
				count++;
			}
			if (Character.isDigit((char) i)) {
				isDigit += (char) i + ((count2 + 1) % 31 == 0 ? "\n" : " ");
				count2++;
			}
			if (i == 32) {
				isWhitespace += (char) i; 
			}
			if (Character.isLowerCase((char) i)) {
				isLowerCase += (char) i + ((count3 + 1) % 31 == 0 ? "\n" : " ");
				count3++;
			}
			if (Character.isUpperCase((char) i)) {
				isUpperCase += (char) i + ((count4 + 1) % 31 == 0 ? "\n" : " ");
				count4++;
			}
		}
		System.out.println("isLetter");
		System.out.println(isLetter);
		System.out.println("isDigit");
		System.out.println(isDigit);
		System.out.println("isWhitespace");
		System.out.println("32" + isWhitespace);
		System.out.println("isLowerCase");
		System.out.println(isLowerCase);
		System.out.println("isUpperCase");
		System.out.println(isUpperCase);
	}

}
