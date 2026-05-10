package facade.classes;


import java.util.List;

public class Salon {
    private String numeSpital;
    private List<Integer> nrPaturiLibere;
    private List<Integer> nrPaturiOcupate;

    public Salon(String numeSpital, List<Integer> nrPaturiLibere, List<Integer> nrPaturiOcupate) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
        this.nrPaturiOcupate = nrPaturiOcupate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("numeSpital='").append(numeSpital).append('\'');
        sb.append(", nrPaturiLibere=").append(nrPaturiLibere);
        sb.append(", NrPaturiOcupate=").append(nrPaturiOcupate);
        sb.append('}');
        return sb.toString();
    }

    public void verificaPat(int nrPat){
        for (int pat: nrPaturiLibere){
            if (pat==nrPat){
               System.out.println("Patul este liber!");
               nrPaturiOcupate.add(nrPat);

            }

        }

    }

}
