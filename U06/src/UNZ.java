public class UNZ {

    public static int convert(int z, int b) {
        int output = 0;
        int loop_z = z;
        int stellen = 0;
        // z darf nie unter 0 gehen
        while (loop_z > 0) {
            // solange loop größer 0 ist wird stellen++ gemacht
            stellen++;
            // komma verschieben und Zahl nach dem komma wegstreichen
            loop_z /= 10;
            for (int i = 0, j = stellen - 1; i <= stellen - 1; i++, j--) {
                // z % 10 = die letzte stelle einer zahl * b hoch j
                output += (z % 10) * Math.pow(b, j);
                // Stelle entfernen
                z /= 10;
            }
        }
        return output;

    }
}
