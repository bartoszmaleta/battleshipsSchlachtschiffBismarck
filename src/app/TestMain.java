package app;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        Ocean ocean = new Ocean();
        List<Ship> ships = new ArrayList<>();
        Ship carrier = new Ship(5, "C", 0, 0, true);
        Ship battleship = new Ship(4, "B",3,2, false);
    //    Ship cruiser = new Ship(3, "c", 2,4, false);
    //    Ship submarine = new Ship(3, "S", 3, 2, true);
    //    Ship destroyer = new Ship(2, "D", 7, 8, true);
        ships.add(carrier);
        ships.add(battleship);
//        ships.add(cruiser);
    //    ships.add(submarine);
//        ships.add(destroyer);
        for (Ship ship : ships) {
            ocean.placeShip(ship, ship.isVertical);
        }

        ocean.attackSquare(8, 8);
        ocean.attackSquare(3, 2);
        ocean.attackSquare(4, 2);
        ocean.attackSquare(2, 2);
        ocean.attackSquare(1, 2);
        ocean.attackSquare(3, 2);
        ocean.attackSquare(6, 3);
        
        ocean.printBoardString();
        System.out.println(ocean.getOcean()[0][6].getLook());
        System.out.println(ocean.getOcean()[2][3].getIsOccupied());
        System.out.println(ocean.getOcean()[2][2].getIsOccupied());
        // System.out.println(ocean.getOcean()[2][2].isOccupied());


    }
}