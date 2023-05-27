package game;

import util.Utils;

public class Varazslo {
    private int eletero;
    private int pozicio;

    public Varazslo() {
        initVarazslo();
    }

    public void initVarazslo() {
        int newEletero = Utils.kockadobas(6) + 3;
        this.setEletero(newEletero);
    }

    public int tamad() {
        return Utils.kockadobas(6);
    }

    public void sebzodik(int tamadasEreje) {
        this.setEletero(this.getEletero() - tamadasEreje);
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getPozicio() {
        return pozicio;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }

    @Override
    public String toString() {
        return "V";
    }
}
