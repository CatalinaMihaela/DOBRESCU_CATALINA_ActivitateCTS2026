package factoryMethode.classes;

import simpleFactory.classes.IPachetTuristic;
import simpleFactory.classes.PachetTransport;

public class FabricaTransport implements IFabrica {
    @Override
    public IPachetTuristic intoarcePachet(String destinatie, float pret, int nrnopti) {
        return new PachetTransport(destinatie, pret, nrnopti);
    }
}
