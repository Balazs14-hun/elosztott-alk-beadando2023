package game;

import java.util.Random;

public class Jatek {
    private Jatekter jatekter;
    private Harcos harcos;
    private Varazslo varazslo;

    public Jatek() {
        this.jatekter = new Jatekter();
        this.harcos = new Harcos();
        this.varazslo = new Varazslo();
    }

    private void initJatek() {
        this.jatekter.initJatekter();
        this.jatekter.setJatekter(0, this.harcos.toString());
        this.harcos.setPozicio(0);
        this.jatekter.setJatekter(2, this.varazslo.toString());
        this.varazslo.setPozicio(2);
    }

    public void jatekInditas() {
        initJatek();
        System.out.println("Kezdodik a jatek:");
        // alaphelyzet kiirasa
        System.out.println(this);

        while (this.harcos.getEletero() > 0 && this.varazslo.getEletero() > 0) {
            jatekKor();
            System.out.println(this);
        }
        if (this.harcos.getEletero() > 0) {
            System.out.println("Harcos nyert!");
        } else if (this.varazslo.getEletero() > 0) {
            System.out.println("Varazslo nyert!");
        } else {
            System.out.println("Dontetlen...");
        }
        System.out.println("Jatek vege!");
    }

    private void jatekKor() {
        Random rand = new Random();
        int harcosUjPozicio = rand.nextInt(this.jatekter.getJatekterMeret());
        int varazsloUjPozicio = rand.nextInt(this.jatekter.getJatekterMeret());
        this.harcos.setPozicio(harcosUjPozicio);
        this.varazslo.setPozicio(varazsloUjPozicio);
        this.jatekter.initJatekter();

        if (harcosUjPozicio == varazsloUjPozicio) {
            this.jatekter.setJatekter(harcosUjPozicio, "X");
            this.harc();
        } else {
            this.jatekter.setJatekter(harcosUjPozicio, this.harcos.toString());
            this.jatekter.setJatekter(varazsloUjPozicio, this.varazslo.toString());
        }
    }

    private void harc() {
        this.varazslo.sebzodik(this.harcos.tamad());
        this.harcos.sebzodik(this.varazslo.tamad());
    }

    public String kiirAllas() {
        String toRetrun = "";
        if (this.harcos.getPozicio() == this.varazslo.getPozicio()) {
            toRetrun += this.jatekter.toString() + " --> ";
            toRetrun += "harc: ";
            toRetrun += this.harcos.toString() + ":" + this.harcos.getEletero();
            toRetrun += ", ";
            toRetrun += this.varazslo.toString() + ":" + this.varazslo.getEletero();
            return toRetrun;
        } else {
            toRetrun += this.jatekter.toString() + " --> ";
            toRetrun += this.harcos.toString() + ":" + this.harcos.getEletero();
            toRetrun += ", ";
            toRetrun += this.varazslo.toString() + ":" + this.varazslo.getEletero();
            return toRetrun;
        }
    }

    @Override
    public String toString() {
        return this.kiirAllas();
    }
}
