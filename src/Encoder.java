public class Encoder {
    private PGM pgm;
    private String message;

    Encoder(PGM pgm, String message) {
        this.pgm = pgm;
        this.message = message;
    }

    public void writeMessage() {
        Byte[] carattere = new Byte[8];

        for (int i = 0; i < carattere.length; i++) {
            carattere[i] = this.pgm.readNextByte();
        }
    }

}