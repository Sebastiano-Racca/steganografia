public class Byte {
    private String binario;
    private int numero;

    Byte(int numero) {
        this.binario = Integer.toBinaryString(numero);
        this.numero = numero;
    }
    
    public int getLSB() {
        return this.numero % 2;
    }



    @Override
    public String toString() {
        return String.valueOf(this.numero);
    }
}