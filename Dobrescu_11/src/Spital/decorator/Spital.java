package Spital.decorator;

public class Spital implements ISpital{
    private int pacientID;
    private String numeSectie;

    public Spital(int pacientID, String numeSectie) {
        this.pacientID = pacientID;
        this.numeSectie = numeSectie;
    }

    @Override
    public void printezaRezultat() {
        System.out.println("Rezultatele se printeaza");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("pacientID=").append(pacientID);
        sb.append(", numeSectie='").append(numeSectie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
