package adapter.main;

import adapter.model.PachetMasinaAdapter;
import adapter.model.ProiectExistent.IPachet;
import adapter.model.ProiectExistent.Pachet;
import adapter.model.ProiectNou.IMasina;
import adapter.model.ProiectNou.Masina;

public class Main {
    public static void main(String[] args) {
        IPachet pachet= new Pachet("Paris", 500, 3);
        pachet.vindePachet();

        IMasina masina = new Masina("Mercedes", 200,"rosu");
        masina.inchiriazaMasina();
        System.out.println("Apel dupa adaptare");
        IPachet pachetAdaptat= new PachetMasinaAdapter(masina);
        pachetAdaptat.vindePachet();



    }
}