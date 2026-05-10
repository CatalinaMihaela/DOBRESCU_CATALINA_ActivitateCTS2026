package facade.classes;

public class Pacient {
    private String numePacient;
    private int gravitate;
    private String boala;

    public Pacient(String numePacient, int gravitate, String boala) {
        this.numePacient = numePacient;
        this.gravitate = gravitate;
        this.boala = boala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", gravitate=").append(gravitate);
        sb.append(", boala='").append(boala).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean verificaGravitate() {
        if (gravitate <= 2) {
            return false;
        }
        return true;
    }
}

