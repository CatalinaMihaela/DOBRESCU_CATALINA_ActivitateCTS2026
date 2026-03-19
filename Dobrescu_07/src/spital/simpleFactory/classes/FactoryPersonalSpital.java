package spital.simpleFactory.classes;

public class FactoryPersonalSpital {
    public PersonalSpital create(TipFunctie tipFunctie, String nume, int varsta, int anivechime) throws Exception {
        switch (tipFunctie) {
            case Brancardier:return new Brancardier(nume, varsta, anivechime);
            case Asistent: return new Asistent(nume, varsta, anivechime);
            case Medic: return new Medic(nume, varsta, anivechime);
            default:throw new Exception("Nu este din lista");


        }
    }


}
