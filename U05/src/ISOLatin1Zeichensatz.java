public class ISOLatin1Zeichensatz {
    public static void main(String[] args) {

        for (int i = 32, j = 1; i <= 255; i++, j++) {
            if (i < 100)
                System.out.print(" ");
            if (j % 8 == 0)
                System.out.println(i + " " + (char) i);
            else
                System.out.print(i + " " + (char) i + " ");
        }

    }
}
