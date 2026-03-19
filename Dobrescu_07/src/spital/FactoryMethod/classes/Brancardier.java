package spital.FactoryMethod.classes;


public class Brancardier implements PersonalSpital {
    private String nume;
    private int varsta;
    private int anivechime;

    public Brancardier(String nume, int varsta, int anivechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.anivechime = anivechime;
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier");


    }
}
