package classes;

public class PlayerBoard {

    Field[] playerBoard;

    public PlayerBoard() {
        playerBoard = new Field[10];
    }

    public Field[] getPlayerBoard () {
        return playerBoard;
    }

}