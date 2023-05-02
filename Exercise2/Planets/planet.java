package Planets;

import Explorers.Explorer;

public class PlanetX implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
