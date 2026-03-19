package spital.simpleFactory.classes;

public class Asistent implements PersonalSpital {
    private String nume;
    private int varsta;
    private int anivechime;

    public Asistent(String nume, int varsta, int anivechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.anivechime = anivechime;
    }

    @Override
    public void descriere() {
        System.out.println("Asistent");


    }
}
