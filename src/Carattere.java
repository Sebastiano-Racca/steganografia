public class Carattere {
    private Byte[] bytes;

    Carattere(Byte[] bytes) {
        this.bytes = bytes;
    }

    public void encode(char c) {
        String byteString = Encoder.charToByteString(c); // Conversione del carattere in una stringa binaria: Encoder.charToByteString(c) converte il carattere c in una stringa binaria rappresentante il suo valore ASCII. Questa stringa binaria viene utilizzata per ottenere i singoli bit del carattere.

        for (int i = 0; i < 8; i++) { // Ciclo per gli 8 bit: Il metodo utilizza un ciclo for per iterare attraverso gli 8 bit della rappresentazione binaria del carattere.
            int lsb = byteString.charAt(i) - '0'; // Ottieni il valore del bit corrente: int lsb = byteString.charAt(i) - '0' ottiene il valore del bit corrente dalla stringa binaria. Sottraendo il carattere '0', si converte il carattere numerico in un valore intero.

            int nuovoLSB = lsb; // vaffanculo questo non te lo commento
            int numero = this.bytes[i].getLSB(); // Metodo getNumero nella classe Byte: È stata aggiunta una nuova funzione getNumero nella classe Byte per consentire l'accesso al valore del numero intero rappresentato dal byte.
            if (numero % 2 != nuovoLSB) { // Condizione dell'if: numero % 2 != nuovoLSB verifica se l'ultimo bit del numero corrente (numero % 2) è diverso dal nuovo bit (nuovoLSB) che qualche coglione vuole impostare.
                numero = (numero / 2) * 2 + nuovoLSB; // numero = (numero / 2) * 2 + nuovoLSB;: Questo codice serve a modificare l'ultimo bit del numero. La divisione per 2 seguita dalla moltiplicazione per 2 rimuove il bit meno significativo e lo sostituisce con il nuovo bit desiderato (nuovoLSB), che può essere 0 o 1.
                this.bytes[i] = new Byte(numero); // this.bytes[i] = new Byte(numero);: Dopo aver modificato il valore del numero, viene creato un nuovo oggetto Byte con il valore aggiornato, e questo nuovo oggetto viene assegnato all'array bytes nella posizione corrente (i).
            }
        }
    }

    public Byte getByteAt(int indice) {
        return bytes[indice];
    }
}