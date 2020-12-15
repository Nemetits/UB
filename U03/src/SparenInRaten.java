public class SparenInRaten {

	public static void main(String[] args){
		

		System.out.println("Sparen in Raten");
		System.out.println("===============");
		
//		die Zahlen und die Variablen werden bestimmt
		double i = TestScanner.readDouble("Geben Sie das Guthaben am Jahresanfang ein: ");
		double a = TestScanner.readDouble("Geben Sie die Monatsrate ein: ");
		double g = TestScanner.readDouble("Geben Sie den Jahreszinsatz ein: ");
//		die Zinsen fuer die raten fuer einen Monat werden ausgerechnet
		double rz = (a*g/100)/12 ;
		double rzerg = 0;
		int b = 1;
//		das die zinsen fur das ganze jahr werden ausgerechnet
		while (b<=12){
			rzerg = rzerg + (rz * b);
			b++;
		}
//		der Endbetrag wird ausgerechnet und ausgedruckt 
		System.out.println("Das guthaben am ende des Jahres beträgt: " + Math.floor((i + ((i*g)/100) + (12*a) + rzerg)*100)/100);
	}

}
