package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Planet;
import Planets.Saturn;
import Planets.Pluto;
import Planets.PlanetX;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Pluto pluto);

    void visit(PlanetX planetx);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
