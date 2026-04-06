package Spital.decorator;

public abstract class ASpital implements ISpital {

   protected ISpital spital;

    @Override
    public void printezaRezultat() {
        spital.printezaRezultat();
    }

    public abstract void afiseazaRezultatOnline();

    public ASpital(ISpital spital) {
        this.spital = spital;
    }
}
