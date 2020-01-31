package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Player {

    private String playerName;
    private Ocean playerOcean;
    private Ocean playerOceanToShowOtherPlayer;
    private boolean hasLost;
    private Map<String, Integer> mapOfShips;
    private int health;
    private List<Ship> playerShips;

    public Player() {
        this.playerOcean = new Ocean();
        this.playerOceanToShowOtherPlayer = new Ocean();
        this.hasLost = false;
        this.mapOfShips = new HashMap<>();
        this.health = 0;
        this.playerShips = new ArrayList<>();
    }

    public List<Ship> getPlayerShipsArray() {
        return playerShips;
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
        
        boolean isShipUnderCoords = opponentOcean.getOcean()[y][x].isShip;

        if (!isShipUnderCoords) {
            opponentOcean.getOcean()[y][x].setMissLook();
            System.out.println("You missed");
        } else {
            opponentOcean.getOcean()[y][x].setIsHit();
            opponentOcean.getOcean()[y][x].setHitLook();
            System.out.println("You hit a ship");
        }
    }
}