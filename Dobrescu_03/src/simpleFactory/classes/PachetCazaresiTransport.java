package simpleFactory.classes;

public class PachetCazaresiTransport extends IPachetTuristic{
    public PachetCazaresiTransport(String destinatie, float pret, int nrnopti) {
        super(destinatie, pret, nrnopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este unu pachet de cazare si transport"+super.destinatie);
    }
}
