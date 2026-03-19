package spital.simpleFactory.classes;
//În cadrul aplicației personalul spitalului este de mai multe tipuri. Acestea sunt salvate într-un
//enum { Brancardier, Asistent, Medic}. Să se implementeze modulul care pune la dispoziției
//crearea de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
public class Brancardier implements PersonalSpital{
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
