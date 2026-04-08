package facade.model;

public class CompanieBus {
    private String numecompanieBus;
    private int pretBiletbus;
    private String marcaMasina;

    public CompanieBus(String numecompanieBus, int pretBiletbus, String marcaMasina) {
        this.numecompanieBus = numecompanieBus;
        this.pretBiletbus = pretBiletbus;
        this.marcaMasina=marcaMasina;
    }

    public void inchiriazaMasina(){
        System.out.println("S-a inchiriat masina"+this.marcaMasina+"pentru transportul la hotel");
    }
}
