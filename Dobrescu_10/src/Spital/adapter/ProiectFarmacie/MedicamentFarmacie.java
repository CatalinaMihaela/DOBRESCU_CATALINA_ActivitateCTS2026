package Spital.adapter.ProiectFarmacie;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String numeMedicament;
    private float pretMedicament;
    private boolean esteNecesaraReteta;

    public MedicamentFarmacie(String numeMedicament, float pretMedicament, boolean esteNecesaraReteta) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
        this.esteNecesaraReteta = esteNecesaraReteta;
    }

    @Override
    public void cumparaMEdicamet() {
        System.out.println("S-a cumparat medicamentul de la farmacie");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentFarmacie{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", pretMedicament=").append(pretMedicament);
        sb.append(", esteNecesaraReteta=").append(esteNecesaraReteta);
        sb.append('}');
        return sb.toString();
    }
}
