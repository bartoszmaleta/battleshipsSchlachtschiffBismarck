package app;

public class Player {
    private String playerName;
    private int numberOfShipsRemaining;
    private Ocean playerOcean;
    private boolean hasLost;
    private final int numberOfShipsAtBeginning = 17;

    public Player(String playerName, Ocean playerOcean) {
        this.playerName = playerName;
        this.numberOfShipsRemaining = 17;
        this.playerOcean = playerOcean;
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

    public int getNumberOfShipsRemaining() {
        return numberOfShipsRemaining;
    }

    public void setNumberOfShipsRemaining(int numberOfShipsRemaining) {
        this.numberOfShipsRemaining = numberOfShipsRemaining;
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

    public int getNumberOfShipsAtBeginning() {
        return numberOfShipsAtBeginning;
    }


}