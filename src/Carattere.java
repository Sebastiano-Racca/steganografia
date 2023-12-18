public class Carattere {
    private Byte[] bytes;

    Carattere(Byte[] bytes) {
        this.bytes = bytes;
    }

    public void encode(char c) {

        for (int i = 0; i < this.bytes.length; i++) {
            int lsb = this.bytes[i].getLSB();

            int num = this.bytes[i].getNumero();

            // Set the last bit based on the bitToSet value
            int result = num & 0b11111111111111111111111111111110 | lsb;
            // System.out.println(num + "   " + lsb);

            this.bytes[i].setNumero(result);         
        }
    }

    public Byte getByteAt(int indice) {
        return bytes[indice];
    }
}
