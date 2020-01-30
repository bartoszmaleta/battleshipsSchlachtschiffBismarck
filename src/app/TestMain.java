package app;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        Ocean ocean = new Ocean();
        List<Ship> ships = new ArrayList<>();

        Ship carrier = new Ship(5, "C", 3, 2, true);
        Ship battleship = new Ship(4, "B",1,1, false);
        Ship cruiser = new Ship(3, "c", 8,4, false);
//        Ship submarine = new Ship(3, "S", 5, 7, true);
//        Ship destroyer = new Ship(2, "D", 7, 8, true);
    
        ships.add(carrier);
        ships.add(battleship);
//        ships.add(cruiser);
    //    ships.add(submarine);
//        ships.add(destroyer);
      
        for (Ship ship : ships) {

            //zapytanie
            ocean.placeShip(ship);
    }
}