package game;

import util.Utils;

public class Varazslo {
    private int eletero;

    public Varazslo() {
        initVarazslo();
    }

    public void initVarazslo() {
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
        return "V";
    }
}
