package spital.builder.classes;

public class PacientBuilder implements IBuild{
    private Pacient pacient;


    @Override
    public Pacient build() {
        return pacient;
    }

    public PacientBuilder() {
        pacient= new Pacient(false,false,false,false);
    }
    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAremicdejun(boolean aremicdejun) {
        this.pacient.setAremicdejun(aremicdejun);
        return this;
    }

    public PacientBuilder setArepapucidecamera(boolean arepapucidecamera) {
        this.pacient.setArepapucidecamera(arepapucidecamera);
        return this;
    }

    public PacientBuilder setArehalat(boolean arehalat) {
        this.pacient.setArehalat(arehalat);
        return this;
    }
}
