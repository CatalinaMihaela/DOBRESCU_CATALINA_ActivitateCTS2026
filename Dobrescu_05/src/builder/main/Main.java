package builder.main;

import builder.classes.IBuilder;
import builder.classes.PachetTransport;
import builder.classes.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder= new PachetTransportBuilder();
        PachetTransport pachet1 = ((PachetTransportBuilder)builder).setAreWiFi(true).setAcceptaAnimale(true).build();
        System.out.println(pachet1);
        PachetTransport pachet2 = ((PachetTransportBuilder)builder).setAreTelevizor(true).build();
        System.out.println(pachet2);
        PachetTransport pachet3 = ((PachetTransportBuilder)builder).setArelocfumat(true).build();
        System.out.println(pachet3);
    }
}