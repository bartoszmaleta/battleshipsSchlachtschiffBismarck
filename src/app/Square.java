package app;

public class Square {

    private String look = "~";
    private String label = "water";

    public Square () {
        this.label = setLabel();
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