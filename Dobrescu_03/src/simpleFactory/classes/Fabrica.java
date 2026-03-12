package simpleFactory.classes;

public class Fabrica {
    public IPachetTuristic intoarcePachet(TipPachet tip, String destinatie, float pret, int nrnopti) throws Exception {
        switch(tip){
            case PachetCazare : return new PachetCazare(destinatie, pret, nrnopti);
            case PachetTransport:return new PachetTransport(destinatie, pret, nrnopti);
            case PachetCazaresiTransport: return new PachetCazaresiTransport(destinatie, pret,nrnopti);
            case PachetAllInclusive:return new PachetAllInclusive(destinatie, pret, nrnopti);
            default: throw new Exception("Nu este un tip valid de pachet");
        }
    }
}
