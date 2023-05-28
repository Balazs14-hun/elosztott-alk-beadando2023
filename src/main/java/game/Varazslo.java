package game;

import util.Utils;

class Varazslo implements Karakter {
    private int eletero;
    private int pozicio;

    public Varazslo() {
        init();
    }

    @Override
    public void init() {
        int newEletero = Utils.kockadobas(6) + 3;
        this.setEletero(newEletero);
    }

    @Override
    public void init(int eletero) {
        this.setEletero(eletero);
    }

    @Override
    public int tamad() {
        return Utils.kockadobas(6);
    }

    @Override
    public int tamad(int tamadasEreje) {
        return tamadasEreje;
    }

    @Override
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
