package app;

import java.util.Scanner;

public class Ocean {

    // DECLARATION OF BOARD
    private Square[][] ocean;

    public Ocean() {
        ocean = new Square[12][12];
        fillOcean();
    }

    // GETTER FOR OCEAN
    public Square[][] getOcean() {
        return ocean;
    }

    // RETURN LOOK OF SQUARE IN GIVEN COORDINATES
    public String getOneSquareFromGivenCoordinatesAsInt(int x, int y) {
        return ocean[y][x].getLook();
    }

    // FILLING OCEAN WITH SQUARES
    public Square[][] fillOcean() {
        for (Square[] line : ocean) {
            for (int i = 0; i < ocean.length; i++) {
                line[i] = new Square();
            }
        }
        return ocean;
    }

    // PLACING SHIP ON OCEAN
    public void placeShip(Ship ship) {
        String message = "Not enough space. Recalculate.";
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        if (checkIfBarrier(ship)) {
            return;
        }
        if (ship.getIsVertical()) {
            if (y + ship.size <= 10) {
                for (int i = 0; i < ship.getSize(); i++) {
                    ocean[y + i][x] = ship.shipSquares[i];
                    ocean[y + i][x].setIsShip();
                }
            } else {
                System.out.println(message);
            }
        } else {
            if (x + ship.size <= 10) {
                for (int i = 0; i < ship.getSize(); i++) {
                    ocean[y][x + i] = ship.shipSquares[i];
                    ocean[y][x + i].setIsShip();
                }
            } else {
                System.out.println(message);
            }

        }
        placeBarrier(ship);
    }
    public void attackSquare(int x, int y) {
        // PLAYER MISSES
        if (!ocean[y][x].isShip) {
            ocean[y][x].setMissLook();
            System.out.println("You missed");
        // PLAYER HITS
        } else {
            ocean[y][x].setIsHit();
            ocean[y][x].setHitLook();
            System.out.println("You hit a ship");
        }
    }

//    public boolean checkIfSquaresHaveShip(Ship ship, int x, int y) {
//        String message = "Ship in a way.";
//        for (int i = 0; i < ship.size; i++) {
//            if (ocean[y + i][x].getLook() != "~") {
//                System.out.println(message);
//                return true;
//            } else if (ocean[y][x + i].getLook() != "~") {
//                System.out.println(message);
//                return true;
//            }
//        }
//        return false;
//    }

    public void placeBarrier(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        if (ship.getIsVertical()) {
            for (int i = y - 1; i <= ship.getSize() + 1; i++) {
                for (int j = x - 1; j <= x + 1; j++) {
                    ocean[i][j].setIsOccupied();
                }
            }
        } else {
            for (int i = y - 1; i <= y + 1; i++) {
                for (int j = x - 1; j <= x + ship.getSize() + 1; j++) {
                    ocean[i][j].setIsOccupied();
                }
            }
        }
    }

    public boolean checkIfBarrier(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        String message = "Barrier in a way.";
        if (ship.getIsVertical()) {
            for (int i = y; i <= ship.getSize(); i++) {
                if (ocean[i][x].isOccupied) {
                    return true;
                }
            }
        } else {
            for (int i = x; i <= ship.getSize(); i++) {
                if (ocean[y][i].isOccupied) {
                    System.out.println(message);
                    return true;
                }
            }
        }
        return false;
    }

//    public void move() {
//        System.out.println("Choose square");
//        Scanner userInput = new Scanner(System.in);
//        String coords = userInput.nextLine();
//        Square square = getLocationFromCoordinatesInputtedAsString(coords);
//        hit(square);
//    }
//
//    public void hit(Square square) {
//        square.setIsHit();
//    }

    // CONVERTING INPUT TO COORDINATES
    Square getLocationFromCoordinatesInputtedAsString(String coordinates) {
        int x = 0, y;
        y = Integer.parseInt(coordinates.substring(1));
        switch (coordinates.substring(0, 1)) {
            case "A":
                x = 0;
                break;
            case "B":
                x = 1;
                break;
            case "C":
                x = 2;
                break;
            case "D":
                x = 3;
                break;
            case "E":
                x = 4;
                break;
            case "F":
                x = 5;
                break;
            case "G":
                x = 6;
                break;
            case "H":
                x = 7;
                break;
            case "I":
                x = 8;
                break;
            case "J":
                x = 9;
                break;
            default:
                System.out.println("Wrong input");
        }
        return ocean[y - 1][x];
    }

    Square getLocationFromCoordinatesAsInts(int x, int y) {
        return ocean[y][x];
    }

    

    // PRINTING BOARD
    public void printBoardString() {
        int counter = 1;
        String space = " ";
        String twoSpaces = stringMultiply(space, 2);
        String threeSpaces = stringMultiply(space, 3);

        System.out.println();
        printLineWithLetters();

        for (int y = 1; y < ocean.length - 1; y++) {
            if (counter < 10) {
                System.out.print("(" + counter + ")" + threeSpaces + "|");
            } else {
                System.out.print("(" + counter + ")" + twoSpaces + "|");
            }

            System.out.print(" ");

            for (int x = 1; x < ocean.length - 1; x++) {
                System.out.print(ocean[y][x].getLook() + " ");
            }
            counter += 1;
            System.out.print("|");
            System.out.println();
        }

        printDashesBelowBoard();
        System.out.println();

    }

    // MULTIPLIER FOR STRINGS
    public static String stringMultiply(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    // PRINT LINE WITH LETTERS FOR ROWS
    public void printLineWithLetters() {
        String space = " ";
        String spaceFromBoundary = " ";
        String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
        String spacesBeforeLettersAboveBoard = spaceFromBoundary + spacesFromNumberingAndStartTabs;
        String spacesBetweenLetters = stringMultiply(space, 1);
        String spaceBetweenFirstTildeAndBoundary = stringMultiply(space, 1);
        String lineAboveBoard = spaceBetweenFirstTildeAndBoundary + spacesBeforeLettersAboveBoard + "A"
                + spacesBetweenLetters + "B" + spacesBetweenLetters + "C" + spacesBetweenLetters + "D"
                + spacesBetweenLetters + "E" + spacesBetweenLetters + "F" + spacesBetweenLetters + "G"
                + spacesBetweenLetters + "H" + spacesBetweenLetters + "I" + spacesBetweenLetters + "J";

        System.out.println(lineAboveBoard);
    }

    // PRINT DASHES BELOW BOARD (DECORATE BOARD)
    public void printDashesBelowBoard() {

        String space = " ";
        String dashString = "-";
        String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
        String dashesFromSpacesBetweeenBoundariesAndTildes = stringMultiply(dashString, 2);
        String dashesFromSpaces = stringMultiply(dashString, (ocean.length - 1));
        String dashesFromArrayBoundaries = stringMultiply(dashString, 2);
        String dashesFromNumberOfElementsOfArray = stringMultiply(dashString, ocean[0].length);
        String dashesUpAndDown = spacesFromNumberingAndStartTabs + dashesFromSpacesBetweeenBoundariesAndTildes
                + dashesFromSpaces + dashesFromArrayBoundaries + dashesFromNumberOfElementsOfArray;
        System.out.println(dashesUpAndDown);
    }

}