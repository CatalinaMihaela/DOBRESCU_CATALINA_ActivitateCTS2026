package factoryMethode.classes;

import simpleFactory.classes.IPachetTuristic;
import simpleFactory.classes.PachetCazare;

public class FabricaPachetCazare implements IFabrica {
    @Override
    public IPachetTuristic intoarcePachet(String destinatie, float pret, int nrnopti) {
        return new PachetCazare(destinatie, pret, nrnopti);
    }
}
