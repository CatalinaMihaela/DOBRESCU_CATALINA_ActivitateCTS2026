package Spital.decorator.main;


import Spital.decorator.ASpital;
import Spital.decorator.ISpital;
import Spital.decorator.Spital;
import Spital.decorator.SpitalDecorat;

public class Main {
    public static void main(String[] args) {

        ISpital spital=new Spital(1, "Sectia 1");
        spital.printezaRezultat();
        ASpital spitalDecorat= new SpitalDecorat(spital);
        spitalDecorat.afiseazaRezultatOnline();
        spitalDecorat.printezaRezultat();

    }
}