package Spital.decorator;

public class SpitalDecorat extends ASpital{
    public SpitalDecorat(ISpital spital) {
        super(spital);
    }

    @Override
    public void afiseazaRezultatOnline() {
        System.out.println("S-a afisat rezultatul oline.");
    }
}
