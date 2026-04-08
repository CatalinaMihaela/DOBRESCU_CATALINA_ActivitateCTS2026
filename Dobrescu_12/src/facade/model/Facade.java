package facade.model;

public class Facade {

    public void rezervaPachet(String numeHotel, int pretNoapte, String orasHotel,String numecompanieAeriana, int pretBilet, int nrLoc,String numecompanieBus, int pretBiletbus, String marcaMasina) {
        Hotel hotel = new Hotel(numeHotel,pretNoapte,orasHotel);
        hotel.inchiriazaCameraHotel();
        CompanieAeriana companieAeriana = new CompanieAeriana(numecompanieAeriana,pretBilet,nrLoc);
        companieAeriana.rezervaBilet();

        CompanieBus companieBus = new CompanieBus(numecompanieBus,pretBiletbus,marcaMasina);
        companieBus.inchiriazaMasina();
    }
}
