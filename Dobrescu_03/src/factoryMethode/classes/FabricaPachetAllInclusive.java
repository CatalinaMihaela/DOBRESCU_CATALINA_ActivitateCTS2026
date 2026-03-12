package factoryMethode.classes;

import simpleFactory.classes.IPachetTuristic;
import simpleFactory.classes.PachetCazaresiTransport;

public class FabricaPachetAllInclusive implements IFabrica{
    @Override
    public IPachetTuristic intoarcePachet(String destinatie, float pret, int nrnopti) {
        return new PachetCazaresiTransport(destinatie, pret,nrnopti);
    }
}
