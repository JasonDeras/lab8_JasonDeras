package lab8;

import java.io.Serializable;

public class Hackeo implements Serializable {

    private int codigo;
    private int n_riesgo;
    private static final long SerialVersionUID = 777L;
    private String tipo;

    public Hackeo(int codigo, int n_riesgo, String tipo) {
        this.codigo = codigo;
        this.n_riesgo = n_riesgo;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getN_riesgo() {
        return n_riesgo;
    }

    public void setN_riesgo(int n_riesgo) {
        this.n_riesgo = n_riesgo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hackeo{" + "codigo=" + codigo + ", n_riesgo=" + n_riesgo + ", tipo=" + tipo + '}';
    }

}
