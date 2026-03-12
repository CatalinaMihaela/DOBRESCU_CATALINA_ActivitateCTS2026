package factoryMethode.classes;

import simpleFactory.classes.IPachetTuristic;

public interface IFabrica {
    IPachetTuristic intoarcePachet(String destinatie, float pret, int nrnopti);


}
