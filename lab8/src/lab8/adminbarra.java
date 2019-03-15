package lab8;

import javax.swing.*;

public class adminbarra extends Thread {
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int dur;
    private int car;
    
    public adminbarra(JProgressBar barra, int dur, int car) {
        this.barra = barra;
        this.dur = dur;
        this.car = car;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }
    
    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    public boolean isAvanzar() {
        return avanzar;
    }
    
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public boolean isVive() {
        return vive;
    }
    
    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + dur / 2);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
