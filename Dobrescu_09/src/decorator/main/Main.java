package decorator.main;

import decorator.model.APachet;
import decorator.model.IPachet;
import decorator.model.Pachet;
import decorator.model.PachetDecorat;

public class Main {
    public static void main(String[] args) {
        IPachet pachet= new Pachet("Londra", 500,5);
        pachet.vindePachet();

        APachet pachetDecorat= new PachetDecorat(pachet);
        pachetDecorat.anuleazaVanzarea();
        pachetDecorat.vindePachet();


    }
}