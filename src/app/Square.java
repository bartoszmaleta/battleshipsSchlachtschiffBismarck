package app;

public class Square {
    private String look = "~";
    private String label = "water";


        public Square() {
            this.look = look;
    }

    public String getLook() {
        return look;
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