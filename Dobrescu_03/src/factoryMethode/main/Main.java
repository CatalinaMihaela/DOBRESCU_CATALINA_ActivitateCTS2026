package factoryMethode.main;

import factoryMethode.classes.FabricaPachetCazare;
import factoryMethode.classes.FabricaTransport;
import factoryMethode.classes.IFabrica;
import simpleFactory.classes.IPachetTuristic;

public class Main {
    public static IPachetTuristic creazaPachet(IFabrica fabrica){
        IPachetTuristic pachet = fabrica.intoarcePachet("destinatie2",55.20f,4);
        return pachet;

    }
    public static void main(String[] args){
        IFabrica fabricaCazrae = new FabricaPachetCazare();
        IPachetTuristic pachetTuristic1 = creazaPachet(fabricaCazrae);
        IFabrica fabricaTransport = new FabricaTransport();
        IPachetTuristic pachetTuristic2 = creazaPachet(fabricaTransport);

        pachetTuristic1.descriere();
        pachetTuristic2.descriere();

    }
}
