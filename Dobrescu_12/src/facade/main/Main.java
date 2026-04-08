package facade.main;

import facade.model.CompanieAeriana;
import facade.model.CompanieBus;
import facade.model.Facade;
import facade.model.Hotel;

public class Main {
    public static void main(String[] args) {
        Facade facade= new Facade();
        facade.rezervaPachet("Vega", 500, "Constanta","Wizz", 20, 2,"Astra", 100, "Mercedes");


    }
}