package facade.model;

public class CompanieAeriana {
    private String numecompanieAeriana;
    private int pretBilet;
    private int nrLoc;

    public CompanieAeriana(String numecompanieAeriana, int pretBilet, int nrLoc) {
        this.numecompanieAeriana = numecompanieAeriana;
        this.pretBilet = pretBilet;
        this.nrLoc = nrLoc;
    }

    public void rezervaBilet(){
        System.out.print("S-a rezervat biletul la compania "+ this.numecompanieAeriana);
    }
}
