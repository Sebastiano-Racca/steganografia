/**
 * Rappresenta un pixel all'interno del PGM
 */
public class Byte {
    private String binario;
    private int numero;

    /**
     * Costruttore del Byte
     * @param numero il numero
     */
    Byte(int numero) {
        this.binario = Integer.toBinaryString(numero);
        this.numero = numero;
    }

    /**
     * Restituisce l'ultimo bit significativo
     * @return 
     */
    public int getLSB() {
        return this.numero % 2;
    }

    /**
     * Restituisce il numero in forma decimale
     * @return Il numero
     */
    @Override
    public String toString() {
        return String.valueOf(this.numero);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

}
