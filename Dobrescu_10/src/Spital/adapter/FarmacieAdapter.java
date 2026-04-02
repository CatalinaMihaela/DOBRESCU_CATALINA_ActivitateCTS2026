package Spital.adapter;

import Spital.adapter.ProiectFarmacie.IMedicamentFarmacie;
import Spital.adapter.ProiectSpital.IMedicament;
import Spital.adapter.ProiectSpital.Medicament;

public class FarmacieAdapter implements IMedicamentFarmacie {

    private IMedicament medicamentSpital;

    public FarmacieAdapter(IMedicament medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }


    @Override
    public void cumparaMEdicamet() {
       medicamentSpital.achizitioneazaMEdicament();


    }
}
