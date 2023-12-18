public class Carattere {
    private Byte[] bytes;

    Carattere(Byte[] bytes) {
        this.bytes = bytes;
    }

    public void encode(char c) {
        String binChar = Encoder.charToBinaryString(c);

        for (int i = 0; i < this.bytes.length; i++) {
            int lsb = Character.getNumericValue(binChar.charAt(i));
            int num = this.bytes[i].getNumero();

            int result = (num & 0xFE) | lsb;

            this.bytes[i].setNumero(result);         
        }
    }

    public Byte getByteAt(int indice) {
        return bytes[indice];
    }
}
