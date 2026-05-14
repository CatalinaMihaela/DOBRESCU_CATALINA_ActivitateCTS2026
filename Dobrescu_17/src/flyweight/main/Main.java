package flyweight.main;

import flyweight.classes.FlyweightPacient;
import flyweight.classes.Pacient;
import flyweight.classes.Salon;

public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon (5, 2,3);
        Salon salon1 = new Salon (2, 3,5);
        Salon salon2 = new Salon (1, 1,4);

        FlyweightPacient flyweightPacient=new FlyweightPacient();

        Pacient pacient1= flyweightPacient.getPAcient("Popescu", "0224458877", "Bucuresti");
        pacient1.descriere(salon);
        pacient1.descriere(salon1);
        pacient1.descriere(salon2);

    }
}