package app;
public class Ship {

    int size;
    Square[] shipSquares;
    String shipLook;
    int initialPosX;
    int initialPosY;

    public Ship(int size, String shipLook, int initialPosX, int initialPosY) {
        this.size = size;
        this.shipSquares = new Square[size];
        this.shipLook = shipLook;
        this.initialPosX = initialPosX;
        this.initialPosY = initialPosY;
        fillShipSquares();
    }


    public String getLook() {
        return shipLook;
    }

    public int getInitialPosX() {
        return initialPosX;
    }

    public int getInitialPosY() {
        return initialPosY;
    }

    public int getSize() {
        return size;
    }

    public void fillShipSquares() {
        for (int i = 0; i < shipSquares.length; i++) {
            shipSquares[i] = new Square();
            shipSquares[i].look = shipLook;
        }
    }
}