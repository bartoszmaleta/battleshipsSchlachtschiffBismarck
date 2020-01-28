package app;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        Ocean ocean = new Ocean();
        List<Ship> ships = new ArrayList<>();
        Ship carrier = new Ship(5, "C", 5, 2);
        Ship battleship = new Ship(4, "B",4,6);
        Ship cruiser = new Ship(3, "c", 5,0);
        Ship submarine = new Ship(3, "S", 3, 2);
        Ship destroyer = new Ship(2, "D", 7, 8);
        ships.add(carrier);
        ships.add(battleship);
        ships.add(cruiser);
        ships.add(submarine);
        ships.add(destroyer);
        for (Ship ship : ships) {
            //zapytanie
            ocean.placeShip(ship, false);
        }
        ocean.printBoardString();
        System.out.println(ocean.getOcean()[0][6].getLook());




    }
}