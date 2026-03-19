package spital.simpleFactory.main;

import spital.simpleFactory.classes.FactoryPersonalSpital;
import spital.simpleFactory.classes.PersonalSpital;
import spital.simpleFactory.classes.TipFunctie;

public class Main {
    public static void main(String[] args) throws Exception {
        FactoryPersonalSpital factory= new FactoryPersonalSpital();
        PersonalSpital asistent= factory.create(TipFunctie.Asistent, "A.A",25,2);
        PersonalSpital medic=factory.create(TipFunctie.Medic, "M.O",50,20);
        PersonalSpital brancardier=factory.create(TipFunctie.Brancardier,"D.O",30,8);

        asistent.descriere();
        medic.descriere();
        brancardier.descriere();

    }
}