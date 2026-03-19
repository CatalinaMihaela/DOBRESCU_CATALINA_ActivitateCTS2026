package spital.FactoryMethod.classes;

public class Fmedic implements IFactory{
    @Override
    public PersonalSpital create(String nume, int varsta, int anivechime) {
        return new Medic(nume, varsta,anivechime);
    }
}
