public class Encoder {
    private PGM pgm;
    private String message;

    Encoder(PGM pgm, String message) {
        this.pgm = pgm;
        this.message = message;
    }

    public void encode() {
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
