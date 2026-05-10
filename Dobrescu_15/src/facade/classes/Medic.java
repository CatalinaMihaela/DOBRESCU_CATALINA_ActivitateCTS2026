package facade.classes;

public class Medic {
    private String numeMedic;
    private String sectie;

    public Medic(String numeMedic, String sectie) {
        this.numeMedic = numeMedic;
        this.sectie = sectie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("numeMedic='").append(numeMedic).append('\'');
        sb.append(", sectie='").append(sectie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void confirmaInternarea(Pacient pacient){
        if(pacient.verificaGravitate()==true){
            System.out.println("Se interneaza pacientul!");
        }else{
        System.out.println("Nu se interneaza pacientul!");}

    }
}
