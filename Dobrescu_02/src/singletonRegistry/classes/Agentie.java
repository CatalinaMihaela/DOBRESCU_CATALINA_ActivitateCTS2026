package singletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class Agentie {

    private String denumire;
    private int nrAng;

    private static Map<String,Agentie> mapAgentie = new HashMap<>(); //eager initialization


    private Agentie(String denumire, int nrAng) {
        this.denumire = denumire;
        this.nrAng = nrAng;
    }


    public static synchronized Agentie getInstance(String denumire, int nrAng, String oras){
        if(!mapAgentie.containsKey(oras)){
            mapAgentie.put(oras, new Agentie(denumire,nrAng));
        }
        return mapAgentie.get(oras);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAng=").append(nrAng);
        sb.append('}');
        return sb.toString();
    }
}
