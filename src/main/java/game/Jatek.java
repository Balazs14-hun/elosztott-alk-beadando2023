package game;

public class Jatek {
    private Jatekter jatekter;
    private Harcos harcos;
    private Varazslo varazslo;

    public Jatek() {
        this.jatekter = new Jatekter();
        this.harcos = new Harcos();
        this.varazslo = new Varazslo();
        initJatek();
    }

    public void initJatek() {
        jatekter.initJatekter();
        jatekter.setJatekter(0, this.harcos.toString());
        jatekter.setJatekter(2, this.varazslo.toString());
    }

    @Override
    public String toString() {
        String toRetrun = "";

        toRetrun += this.jatekter.toString() + " --> ";
        toRetrun += this.harcos.toString() + ":" + this.harcos.getEletero();
        toRetrun += ", ";
        toRetrun += this.varazslo.toString() + ":" + this.varazslo.getEletero();

        return toRetrun;
    }
}
