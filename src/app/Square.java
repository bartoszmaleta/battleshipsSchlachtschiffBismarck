package app;

public class Square {

    protected String look = "~";
    protected String label = "water";

    public Square () {
    }

    public String getLook() {
        return look;
    }

    public String setLabel() {
        return label;
    }

    public String placeShip() {
        return look = "O";
    }

    public String hitSquare(Square square) {
        if (look.equals("O")) {
            look = "#";
        } else {
            look = "X";
        }
        return look;
    }

}