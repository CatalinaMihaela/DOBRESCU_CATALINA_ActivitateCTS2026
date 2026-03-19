package spital.FactoryMethod.classes;

public class Fbrancardier implements IFactory{
    @Override
    public PersonalSpital create(String nume, int varsta, int anivechime) {
        return new Brancardier(nume, varsta,anivechime);
    }
}
