package br.com.iaguiar;

/**
 * @author isaac.aguiar
 */

public class Exemplos {

    private int codigo=1;

    private long codigoMaior=120304050;

    private double valorDecimal1=10.1;

    private boolean status = false;

    private String texto = "Isaac";

    public Exemplos(int val) {
        this.codigo = val;

    }

    private short shor;

    private byte bi;

    public Exemplos () {

    }

    public String retornaTexto() {
        this.codigo = 0;
        return "Isaac";
    }

    public int retornaInteiro() {
        int val = 10;
        String texto = "Texto";
        this.texto = null;
        return 10;
    }

    public long retornaLong(long num) {
        this.texto = "Isaac";
        return num;
    }

}
