package builder.classes;

public class PachetTransportBuilder implements IBuilder{
    private PachetTransport pachet;

    public PachetTransportBuilder() {
        this.pachet = new PachetTransport(false, false,false,false,false);
    }

    @Override
    public PachetTransport build() {
        return pachet;

    }
    public PachetTransportBuilder setAreWiFi(boolean areWiFi) {
        this.pachet.setAreWiFi (areWiFi);
        return this;

    }

    public PachetTransportBuilder setAcceptaAnimale(boolean acceptaAnimale) {
        this.pachet.setAcceptaAnimale (acceptaAnimale);
        return this;
    }

    public PachetTransportBuilder setArelocfumat(boolean arelocfumat) {
        this.pachet.setArelocfumat  (arelocfumat);
        return this;
    }

    public PachetTransportBuilder setAreAerConditionat(boolean areAerConditionat) {
        this.pachet.setAreAerConditionat (areAerConditionat);
        return this;
    }

    public PachetTransportBuilder setAreTelevizor(boolean areTelevizor) {
        this.pachet.setAreTelevizor (areTelevizor);
        return this;
    }

}

