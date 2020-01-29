package app;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String playerName;
    private Ocean playerOcean;
    private boolean hasLost;
    Map<Integer, String> shipsOfPlayer= new HashMap<>();

    public Player() {
        this.playerOcean = new Ocean();
        this.hasLost = false;
    }

    public String getName() {
        return playerName;
    }

    public boolean getHasLost() {
        return hasLost;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Ocean getPlayerOcean() {
        return playerOcean;
    }

    public void setPlayerOcean(Ocean playerOcean) {
        this.playerOcean = playerOcean;
    }

    public void setHasLost(boolean hasLost) {
        this.hasLost = hasLost;
    }


}