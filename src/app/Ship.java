package app;

public class Ship {

    int size;
    Square[] shipSquares;
//    Square[][] barrier;
    String shipLook;
    int initialPosX;
    int initialPosY;
    boolean isVertical;

    public Ship(int size, String shipLook, int initialPosX, int initialPosY, boolean isVertical) {
        this.size = size;
        this.shipSquares = new Square[size];
        this.shipLook = shipLook;
        this.initialPosX = initialPosX;
        this.initialPosY = initialPosY;
        this.isVertical = isVertical;  
        fillShipSquares();
//        fillBarrier(this.initialPosX, this.initialPosY, this.isVertical);
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

    public boolean getIsVertical() {
        return isVertical;
    }

//    public void fillBarrier(int initialPosX, int initialPosY, boolean isVertical) {
//        if (isVertical) {
//            barrier = new Square[size + 2][3];
//            for (int y = initialPosX - 1; y <= y + 1; y++) {
//                for (int x = initialPosY - 1; x <= x + size + 1; x++) {
//                    barrier[y][x].isOccupied = true;
//                }
//            }
//        } else {
//            barrier = new Square[3][size + 2];
//            for (int y = initialPosY - 1; y <= y + 1; y++) {
//                for (int x = initialPosX - 1; x <= x + size + 1; x++) {
//                    barrier[y][x].isOccupied = true;
//                }
//            }
//        }
//    }
}