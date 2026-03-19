package spital.FactoryMethod.main;

import spital.FactoryMethod.classes.*;

public class Main {
    public static void main(String[] args) {
        IFactory fasistent = new Fasistent();
        IFactory fmedic = new Fmedic();
        IFactory fbrancardier = new Fbrancardier();

        PersonalSpital asistent = fasistent.create("Ion", 25, 3);
        PersonalSpital medic = fmedic.create("Maria", 36, 7);
        PersonalSpital brancardier = fbrancardier.create("Paul", 40, 15);
        asistent.descriere();
        medic.descriere();
        brancardier.descriere();

    }
}