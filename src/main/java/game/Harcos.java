package game;

import util.Utils;

public class Harcos {
    private int eletero;

    public Harcos() {
        initHarcos();
    }

    public void initHarcos() {
        int newEletero = Utils.kockadobas(6) + 3;
        this.setEletero(newEletero);
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    @Override
    public String toString() {
        return "H";
    }
}
