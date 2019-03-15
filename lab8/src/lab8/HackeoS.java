package lab8;

public class HackeoS extends Hackeo {

    private int hackeoF = 0;

    public HackeoS(int codigo, int n_riesgo, String tipo) {
        super(codigo, n_riesgo, tipo);
    }

    public int getHackeoF() {
        return hackeoF;
    }

    public void setHackeoF(int hackeoF) {
        this.hackeoF = hackeoF;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
