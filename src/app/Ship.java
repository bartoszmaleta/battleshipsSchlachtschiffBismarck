package app;
public class Ship {

    int size;
    Square[] shipSquares;
    String shipLook;
    int initialPosX;
    int initialPosY;
    boolean isVertical;

    public Ship(int size, String shipLook, int initialPosX, int initialPosY, boolean isVertical) {
        this.size = size;
        this.shipSquares = new Square[size];
        fillShipSquares();
        this.shipLook = shipLook;
        this.initialPosX = initialPosX;
        this.initialPosY = initialPosY;
        this.isVertical = isVertical;
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

    public boolean getIsVertical() {
        return isVertical;
    }

    public void fillShipSquares() {
        for (int i = 0; i < shipSquares.length; i++) {
            shipSquares[i] = new Square();
            shipSquares[i].look = shipLook;
        }
    }
}