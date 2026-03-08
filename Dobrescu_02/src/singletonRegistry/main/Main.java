package singletonRegistry.main;

import singletonRegistry.classes.Agentie;

public class Main {
    public static void main(String[] args) {

        Agentie ag1 = Agentie.getInstance("AG1",3,"Bucuresti");
        System.out.println(ag1);

        Agentie ag2 = Agentie.getInstance("AG2",4,"Bucuresti");
        System.out.println(ag2);

        Agentie ag3 = Agentie.getInstance("AG3",4,"Cluj");
        System.out.println(ag3);

    }
}