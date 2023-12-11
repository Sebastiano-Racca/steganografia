import java.io.*;

public class PGM {
    private String source;
    private String destination;
    private BufferedReader reader;
    private BufferedWriter writer;

    PGM(String source, String destination) {
        this.source = source;
        this.destination = destination;
        
        this.reader = this.newReader();
        this.writer = this.newWriter();
    }

    private BufferedReader newReader() {
        try {
            return new BufferedReader(new FileReader(this.source));
        } catch(IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
            System.exit(1);
        }

        return null;
    }

    private BufferedWriter newWriter() {
        try {
            return new BufferedWriter(new FileWriter(this.destination));
        } catch(IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
            System.exit(1);
        }

        return null;
    }

    public String[] getHeader() {
        // TODO: restituisce l'header del PGM si interrompe al primo 255 del file, il resto sono pixel, definisci anche il tipo di ritorno della funzione
    }

    public Byte readNextByte() {
        try {
            return new Byte(Integer.parseInt(this.reader.readLine()));
        } catch(IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
            System.exit(1);
        }

        return null;
    }

    public void writeByte(Byte buff) {
        // TODO: scrivi la funzione che scrive un byte nel file di destinazione
    }
    
}
