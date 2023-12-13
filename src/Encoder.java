public class Encoder {
    private PGM pgm;
    private String message;

    Encoder(PGM pgm, String message) {
        this.pgm = pgm;
        this.message = message;
    }

    private void writeHeader() {
        // TODO: legge e scrive l'header nel nuovo pgm
    }

    private void writeChar(Carattere carattere) {
        // TODO:  scrive un carattere nel nuovo pgm
    }

    public void encode() {
        // TODO: usa writeHeader() e writeChar() per scrivere ogni linea del PGM, usa Carattere.encode() per fare l'encoding di un carattere
        String[] header = this.pgm.getHeader();
        
        Byte[] bytes = new Byte[8];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = this.pgm.readNextByte();
        }

        Carattere carattere = new Carattere(bytes);
    }

    public static String charToByteString(char carattere) {
        return String.format("%02X", (int) carattere);
    }

}
