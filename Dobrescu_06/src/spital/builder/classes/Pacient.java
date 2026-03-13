package spital.builder.classes;
// Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
//are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
//papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
//in cadrul aplicației sunt setate cu false. Să se dezvolte modulul  care asigură crearea de obiecte de
//tipul pacient cu opțiuni extra.
public class Pacient {
    private boolean arePatRabatabil;
    private boolean aremicdejun;
    private boolean arepapucidecamera;
    private boolean arehalat;

    public Pacient(boolean arePatRabatabil, boolean aremicdejun, boolean arepapucidecamera, boolean arehalat) {
        this.arePatRabatabil = arePatRabatabil;
        this.aremicdejun = aremicdejun;
        this.arepapucidecamera = arepapucidecamera;
        this.arehalat = arehalat;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAremicdejun(boolean aremicdejun) {
        this.aremicdejun = aremicdejun;
    }

    public void setArepapucidecamera(boolean arepapucidecamera) {
        this.arepapucidecamera = arepapucidecamera;
    }

    public void setArehalat(boolean arehalat) {
        this.arehalat = arehalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", aremicdejun=").append(aremicdejun);
        sb.append(", arepapucidecamera=").append(arepapucidecamera);
        sb.append(", arehalat=").append(arehalat);
        sb.append('}');
        return sb.toString();
    }
}
