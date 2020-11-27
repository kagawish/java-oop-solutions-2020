import java.util.Arrays;

public class Bloc {
    private byte[] data = new byte[3];

    public Bloc(byte b) {
        data[0] = b;
        data[1] = b;
        data[2] = b;
    }

    public String toString() {
        return Arrays.toString(this.data);
    }

    public void simulationErreurTransmission(int i, byte valeur) {
        data[i] = valeur;
    }

    public byte getValeurDecodee() {
        if (data[0] == data[1] || data[0] == data[2]) {
            return data[0];
        } else {
            return data[1];
        }
    }

    public static Bloc[] coder(byte[] v) {
        Bloc[] blocs = new Bloc[v.length];
        for (int i = 0; i < v.length; i++) {
            blocs[i] = new Bloc(v[i]);
        }
        return blocs;
    }

    public static byte[] decoder(Bloc[] blocs) {
        byte[] valeurs = new byte[blocs.length];
        for (int i = 0; i < blocs.length; i++) {
            valeurs[i] = blocs[i].getValeurDecodee();
        }
        return valeurs;
    }
}