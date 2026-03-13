package builder.classes;
//Agenția AgeTur oferă pachete de transport cu facilități extra precum: WiFi,
//animale de companie, locuri pentru fumători, aer condiționat, televizor.
// Aceste facilități sunt adăugate doar dacă un client le dorește, nefiind
//incluse în pachetul de bază.
//Să se implementeze modulul de creare pachete de transport pentru
//agenția AgeTur
public class PachetTransport {
    private boolean areWiFi;
    private boolean acceptaAnimale;
    private boolean arelocfumat;
    private boolean areAerConditionat;
    private boolean areTelevizor;

    public PachetTransport(boolean areWiFi, boolean acceptaAnimale, boolean arelocfumat, boolean areAerConditionat, boolean areTelevizor) {
        this.areWiFi = areWiFi;
        this.acceptaAnimale = acceptaAnimale;
        this.arelocfumat = arelocfumat;
        this.areAerConditionat = areAerConditionat;
        this.areTelevizor = areTelevizor;
    }

    public void setAreWiFi(boolean areWiFi) {
        this.areWiFi = areWiFi;
    }

    public void setAcceptaAnimale(boolean acceptaAnimale) {
        this.acceptaAnimale = acceptaAnimale;
    }

    public void setArelocfumat(boolean arelocfumat) {
        this.arelocfumat = arelocfumat;
    }

    public void setAreAerConditionat(boolean areAerConditionat) {
        this.areAerConditionat = areAerConditionat;
    }

    public void setAreTelevizor(boolean areTelevizor) {
        this.areTelevizor = areTelevizor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("areWiFi=").append(areWiFi);
        sb.append(", acceptaAnimale=").append(acceptaAnimale);
        sb.append(", arelocfumat=").append(arelocfumat);
        sb.append(", areAerConditionat=").append(areAerConditionat);
        sb.append(", areTelevizor=").append(areTelevizor);
        sb.append('}');
        return sb.toString();
    }
}
