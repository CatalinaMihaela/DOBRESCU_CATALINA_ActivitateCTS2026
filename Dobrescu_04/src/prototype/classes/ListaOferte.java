package prototype.classes;

import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte{
    private String denumire;
    private List<String > oferte;

    public ListaOferte(String denumire,List<String> oferte) {
        this.denumire=denumire;
        this.oferte = oferte;
    }

    public ListaOferte() {

    }

    @Override
    public IListaOferte copiaza() {
        IListaOferte clona= new ListaOferte();
        ((ListaOferte)clona).denumire=this.denumire;
        ((ListaOferte)clona).oferte=new ArrayList<>();
        for(String eleme: this.oferte){
            ((ListaOferte)clona).oferte.add(eleme);
        }


        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaOferte{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", oferte=").append(oferte);
        sb.append('}');
        return sb.toString();
    }
}

