package lab8;

public class HackeoR extends Hackeo {

    private int hackeoE = 0;

    public HackeoR(int codigo, int n_riesgo, String tipo) {
        super(codigo, n_riesgo, tipo);
    }

    public int getHackeoE() {
        return hackeoE;
    }

    public void setHackeoE(int hackeoE) {
        this.hackeoE = hackeoE;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
