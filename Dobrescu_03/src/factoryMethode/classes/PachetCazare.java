package factoryMethode.classes;

public class PachetCazare extends IPachetTuristic {

    public PachetCazare(String destinatie, float pret, int nrnopti) {
        super(destinatie, pret, nrnopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet cazare"+super.destinatie);
    }
}
