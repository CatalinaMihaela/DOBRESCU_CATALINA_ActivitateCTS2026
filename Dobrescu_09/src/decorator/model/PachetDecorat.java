package decorator.model;

public class PachetDecorat extends APachet {
    public PachetDecorat(IPachet pachet) {
        super(pachet);
    }

    @Override
    public void anuleazaVanzarea() {
        System.out.println("S-a anulat pachetul cu destinatia"+super.getDestinatiePachet());

    }
}
