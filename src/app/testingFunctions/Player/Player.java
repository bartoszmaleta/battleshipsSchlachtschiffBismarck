package app.testingFunctions.Player;

import app.Ocean;
import app.Square;

import java.util.HashMap;
import java.util.Map;

public abstract class Player {

    Ocean playerOcean;
    boolean hasLost = false;
    Map<String, Integer> ships = new HashMap<>();

    public abstract boolean getHasLost();

    public abstract void setHasLost();

    public abstract void printOcean();

}
