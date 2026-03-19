package spital.FactoryMethod.classes;

public class Fasistent implements IFactory{

    @Override
    public PersonalSpital create(String nume, int varsta, int anivechime) {
        return new Asistent(nume, varsta, anivechime);
    }
}
