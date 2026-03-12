package simpleFactory.classes;
//Agenția de turism AgeTur oferă pahete turistice cu cazare și transport însă
//are în ofertă și pachete turistice doar cu cazare sau doar cu transport.
//Toate ofertele fac parte din familia pachetelor turistice.
//Să se implementeze modulul de vânzare de pachete turistice pentru
//agenția AgeTur.
public abstract class IPachetTuristic {
    protected String destinatie;
    protected float pret;
    protected int nrnopti;

    public IPachetTuristic(String destinatie, float pret, int nrnopti) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.nrnopti = nrnopti;
    }

    public abstract void descriere();
}
