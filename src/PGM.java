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
        String linea = "";
        String[] buffer = new String[1024];
        int i = 0;
        
        while (!linea.equals("255")) {
            linea = readNextLine(); 
            buffer[i] = linea;
            i++;
        }

        return buffer;
    }

    public String readNextLine() {
        try {
            return this.reader.readLine();
        } catch(IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
            System.exit(1);
        }

        return null;
    }

    public Byte readNextByte() {
        return new Byte(Integer.parseInt(this.readNextLine()));
    }

    public void writeLine(String line) {
        try {
            this.writer.write(line);
        } catch(IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
            System.exit(1);
        }
    }

    public void writeByte(Byte buff) {
        this.writeLine(buff.toString());
    }

    private void writeHeader() {
        String[] headerLines = getHeader();
        
        for (int i = 0; i < headerLines.length; i++) {
                writeLine(headerLines[i]);
        }
    }        

}