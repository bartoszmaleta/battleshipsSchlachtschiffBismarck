package app;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        Ocean ocean = new Ocean();
        // ocean.fillOcean();
        Ship cruiser = new Ship(4, "C", 0,0, false);
        Ship battleship = new Ship(5, "B",4,4, false);
        ocean.placeShip(cruiser);
        ocean.placeShip(battleship);
        ocean.printBoardString();


    }
}