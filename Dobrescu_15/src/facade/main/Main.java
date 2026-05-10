package facade.main;


import facade.classes.Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facade facade= new Facade();
        List<Integer> lista1= new ArrayList<>();
        lista1.add(5);
        lista1.add(3);
        lista1.add(7);

        List<Integer> lista2= new ArrayList<>();
        lista2.add(5);
        lista2.add(3);
        lista2.add(7);
        facade.internarePacient("Popescu", 3, "Covid", "Vulpescu", "Infectioase",
                "Bals", lista1, lista2, 5);


    }
}