public class Encoder {
    private PGM pgm;
    private String message;

    Encoder(PGM pgm, String message) {
        this.pgm = pgm;
        this.message = message + (char) Integer.parseInt("00000000", 2);
    }

    private void writeChar(Carattere carattere) {
        for (int i = 0; i < 8; i++) {
            this.pgm.writeByte(carattere.getByteAt(i));
        }
    }

    public void encode() {
        this.pgm.writeHeader();

        for (int i = 0; i < this.message.length(); i++) {
            char current = this.message.charAt(i);
            Byte[] bytes = new Byte[8];

            for (int j = 0; j < bytes.length; j++) {
                bytes[j] = this.pgm.readNextByte();
            }

            Carattere carattere = new Carattere(bytes);
            carattere.encode(current);
            this.writeChar(carattere);
        }
        
        this.pgm.writeRemainingBytes();
    }

    public static String charToBinaryString(char c) {
        StringBuilder binaryString = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binaryString.append((c >> i) & 1);
        }
        return binaryString.toString();
    }    
}
