public class Carattere {
    private Byte[] bytes;

    Carattere(Byte[] bytes) {
        this.bytes = bytes;
    }

    public void encode(char c) {
        // TODO: dato un nuovo char, sostituisce gli LSB del Carattere corrente
        // cicla gli 8 byte, prendi l'ultimo bit significativo e lo trasformi in base al carattere dato dall'encoder
        String byteString = Encoder.charToByteString(c);

        for (int i = 0; i < 8; i++) {
            int lsb = byteString.charAt(i) - '0'; // Ottieni il valore del bit all'indice i

            // Imposta l'ultimo bit del byte corrente
            int nuovoLSB = lsb;
            int numero = this.bytes[i].getNumero();
            if (numero % 2 != nuovoLSB) {
                numero = (numero / 2) * 2 + nuovoLSB;
                this.bytes[i] = new Byte(numero);
            }
        }
    }
    }

    public Byte getByteAt(int indice) {
        return bytes[indice];
    }