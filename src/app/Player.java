package app;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String playerName;
    private Ocean playerOcean;
    private Ocean playerOceanToShowOtherPlayer;
    private boolean hasLost;
    private Map<String, Integer> mapOfShips;
    private int health;

    public Player() {
        this.playerOcean = new Ocean();
        this.playerOceanToShowOtherPlayer = new Ocean();
        this.hasLost = false;
        this.mapOfShips = new HashMap<>();
        this.health = 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void subtractHealth() {
        this.health -= 1;
    }

    public Map<String, Integer> getMapOfShips() {
        return mapOfShips;
    }

    public Ocean getPlayerOceanToShowOtherPlayer() {
        return playerOceanToShowOtherPlayer;
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

    public void attackSquare(int x, int y, Ocean opponentOcean) {
        // PLAYER MISSES
        if (!opponentOcean.getOcean()[y][x].isShip) {
            opponentOcean.getOcean()[y][x].setMissLook();
            System.out.println("You missed");
        // PLAYER HITS
        } else {
            opponentOcean.getOcean()[y][x].setIsHit();
            opponentOcean.getOcean()[y][x].setHitLook();
            System.out.println("You hit a ship");
        }
    }

    public void attackPlayerSquare(Ocean opponentOcena) {
        
    }
    

    

}