package adapter.model.ProiectExistent;

public class Pachet implements IPachet{
    private String destinatie;
    private float pret;
    private int nrnopti;

    public Pachet(String destinatie, float pret, int nrnopti) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.nrnopti = nrnopti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrnopti=").append(nrnopti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void vindePachet() {
        System.out.println("S-a vandut pachetul cu destinati"+this.destinatie);

    }
}
