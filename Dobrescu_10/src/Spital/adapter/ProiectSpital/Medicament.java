package Spital.adapter.ProiectSpital;

//Spitalul deține un mic magazin pentru medicamente  și au o aplicație pentru cumpărarea d
//medicamente pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și dorește să
//integreze sistemul informatic al farmaciei cu sistemul software existent în micul magazin de
//medicamente.  Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât
//aplicația farmaciei să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa
//Medicament din aplicația spitalului are metodele achizitioneazaMedicament() și prezintaReteta().
//Metoda prezintaReteta() este apelată din achizitioneazaMedicament() pentru verificarea rețetei.
//Clasa Medicament din aplicația farmaciei are o singură metodă cumpărăMedicament() în care nu
//se face verificarea rețetei, deoarece farmacia o să vândă medicamente și fără rețetă.

public class Medicament implements IMedicament {

    private String numeMedicament;
    private float pretMedicament;
    private boolean esteNecesaraReteta;

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", pretMedicament=").append(pretMedicament);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void achizitioneazaMEdicament() {
        if (prezintaReteta()==true){
        System.out.println("S-a achizitionat medicamentul"+numeMedicament);}
        else{
            System.out.println("Nu e nevoie de reteta");
        }
    }

    @Override
    public boolean prezintaReteta() {
       return esteNecesaraReteta;

    }
}
