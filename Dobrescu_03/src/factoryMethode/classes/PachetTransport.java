package factoryMethode.classes;

public class PachetTransport extends IPachetTuristic {

    public PachetTransport(String destinatie, float pret, int nrnopti) {
        super(destinatie, pret, nrnopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta e un pachet transport"+super.destinatie);
    }
}
