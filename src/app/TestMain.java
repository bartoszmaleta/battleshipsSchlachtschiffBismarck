package app;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.printBoardString();

        // THIS IS JUST A REFERENCE
        System.out.println(ocean.getLocationFromCoordinatesAsInts(4, 3));
        
        String oneSquareOfOcean = ocean.getOneSquareFromGivenCoordinatesAsInt(4, 5);
        System.out.println(oneSquareOfOcean);  // LOOK OF SQUARE IN X = 5, Y = 4
    }
}