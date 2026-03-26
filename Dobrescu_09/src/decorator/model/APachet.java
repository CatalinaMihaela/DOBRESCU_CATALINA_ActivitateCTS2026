package decorator.model;

public abstract class APachet implements IPachet{
    private IPachet pachet;

    public APachet(IPachet pachet) {
        this.pachet = pachet;
    }

    public String getDestinatiePachet(){
        return ((Pachet)pachet).getDestinatie();
    }
    @Override
    public void vindePachet() {
        pachet.vindePachet();

    }
    public abstract void anuleazaVanzarea();
}
