public class Main {
    public static void main(String[] args) {
        PGM pgm = new PGM("gatto.pgm", "gatto2.pgm");
        Encoder encoder = new Encoder(pgm, "Ciao Mondo!");

        encoder.encode();
        
        System.out.println("Successo!");
    }
}