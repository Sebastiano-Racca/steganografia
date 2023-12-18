public class Encoder {
    private PGM pgm;
    private String message;

    Encoder(PGM pgm, String message) {
        this.pgm = pgm;
        this.message = message + (char)(00000000);
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

    public static String charToByteString(char carattere) {
        return String.format("%02X", (int) carattere);
    }
}

/* fare l'encoding del messaggio, scrivere il messaggio nel nuovo PGM e scrivere tutto il resto dei byte che non sono stati encodati */
