package Spital.adapter.main;


import Spital.adapter.FarmacieAdapter;
import Spital.adapter.ProiectFarmacie.IMedicamentFarmacie;
import Spital.adapter.ProiectFarmacie.MedicamentFarmacie;
import Spital.adapter.ProiectSpital.IMedicament;
import Spital.adapter.ProiectSpital.Medicament;

public class Main {
    public static void main(String[] args) {
     IMedicamentFarmacie medFarm= new MedicamentFarmacie("Paracetamol", 5.0f, false);
     medFarm.cumparaMEdicamet();
     IMedicament medSpital= new Medicament("Algocalmin",10.0f);
     medSpital.achizitioneazaMEdicament();
     IMedicamentFarmacie medFarmAdaptat= new FarmacieAdapter(medSpital);
     medFarmAdaptat.cumparaMEdicamet();

    }
}