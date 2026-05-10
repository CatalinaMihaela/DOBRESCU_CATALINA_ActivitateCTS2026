package facade.classes;

import java.util.List;

public class Facade {

    public void internarePacient(String numePacient, int gravitate, String boala, String numeMedic, String sectie, String numeSpital, List<Integer> nrPaturiLibere, List<Integer> nrPaturiOcupate,int nrPat){
        Pacient pacient = new Pacient(numePacient,  gravitate, boala);
        Medic medic = new Medic(numeMedic,sectie);
        Salon salon= new Salon(numeSpital, nrPaturiLibere, nrPaturiOcupate);
        pacient.verificaGravitate();
        medic.confirmaInternarea(pacient);
        salon.verificaPat(nrPat);

    }
}
