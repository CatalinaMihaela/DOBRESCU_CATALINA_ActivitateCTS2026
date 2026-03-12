package factoryMethode.classes;

import simpleFactory.classes.IPachetTuristic;

public class PachetAllInclusive extends IPachetTuristic {
    public PachetAllInclusive(String destinatie, float pret, int nrnopti) {
        super(destinatie, pret, nrnopti);
    }

    @Override
    public void descriere() {
        System.out.println("All inclusive");
    }
}
