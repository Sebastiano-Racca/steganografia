public class Main {
    /**
     * Entry point dell'encoder.
     * @param args[0] Source dell'immagine PGM.
     * @param args[1] Destinazione della nuova immagine.
     * @param args[2] Il messaggio da nascondere.
     */
    public static void main(String[] args) {
        PGM pgm = null;
        Encoder encoder = null;

        try {
            pgm = new PGM(args[0], args[1]);
            encoder = new Encoder(pgm, args[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Sintassi errata:");
            System.err.println("make run SOURCE=[source] DESTINATION=[destination] MESSAGE[message]");
            System.exit(1);
        }

        encoder.encode();
        pgm.close();
        System.out.println("Successo!");

    }
}
