package spital.builder.main;

import spital.builder.classes.IBuild;
import spital.builder.classes.Pacient;
import spital.builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        IBuild builder=new PacientBuilder();
        Pacient pacient1=((PacientBuilder) builder).setArehalat(true).setAremicdejun(true).build();
        System.out.println(pacient1);


    }
}