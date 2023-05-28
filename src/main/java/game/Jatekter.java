package game;

import java.util.*;

public class Jatekter {
    private final List<String> jatekter;

    public Jatekter() {
        jatekter = Arrays.asList(new String[3]);
        initJatekter();
    }

    public void initJatekter() {
        jatekter.replaceAll(ignored -> "_");
    }

    public void setJatekter(int place, String newItem) {
        this.jatekter.set(place, newItem);
    }

    public int getJatekterMeret() {
        return jatekter.size();
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        for (String s : this.jatekter) {
            toReturn.append(s);
        }

        return toReturn.toString();
    }
}
