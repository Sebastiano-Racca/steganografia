public class Carattere {
    private Byte[] bytes;

    Carattere(Byte[] bytes) {
        this.bytes = bytes;
    }

    public void encode(char c) {
        // TODO: dato un nuovo char, sostituisce gli LSB del Carattere corrente
    }

    public Byte getByteAt(int indice) {
        return bytes[indice];
    }
}

// cicla gli 8 byte, prendi l'ultimo bit significativo e lo trasformi in base al carattere dato dall'encoder
