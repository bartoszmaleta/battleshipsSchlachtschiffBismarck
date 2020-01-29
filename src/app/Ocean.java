package app;

import java.util.Arrays;

public class Ocean {
    // INITIALIZATION OF INSTANCE OF SQUARE
    Square square = new Square();

    // DECLARATION OF BOARD
    // private Square[][] ocean = new Square[10][10];
    private Square[][] ocean;

    public Ocean() {
        ocean = new Square[10][10];
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
            for (int i = 0; i < 10; i++) {
                line[i] = new Square();
            }
        }
        return ocean;
    }

    // PLACING SHIP ON OCEAN
    public void placeShip(Ship ship, boolean isVertical) {
        String message = "Not enough space. Recalculate.";
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
//        if (checkIfSquaresHaveShip(ship, x, y)) {
//            return;
//        }
        // placeBarrier(ship, isVertical);
        // if (checkIfBarrier(ship)) {
        //     return;
        // }
        if (isVertical) {
            if (y + ship.size <= 10) {
                for (int i = 0; i < ship.getSize(); i++) {
                    // if (ocean[y + i][x].isOccupied) {
                    //     System.out.println("This square is occupied");
                    //     return;
                    // }
                    ocean[y + i][x] = ship.shipSquares[i];
                    ocean[y + i][x].setIsShip();
                    // CREATING BARRIER
                    ocean[y + i][x].setIsOccupied();    // PLACE OF SHIP
                    ocean[y + i + 1][x].setIsOccupied();    // X, Y + 1
                    ocean[y + i - 1][x].setIsOccupied();    // X, Y - 1
                    ocean[y + i][x + 1].setIsOccupied();    // X + 1, Y
                    ocean[y + i][x - 1].setIsOccupied();    // X - 1, Y
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

    public boolean checkIfSquaresHaveShip(Ship ship, int x, int y) {
        String message = "Ship in a way.";
        for (int i = 0; i < ship.size; i++) {
            if (ocean[y + i][x].getLook() != "~") {
                System.out.println(message);
                return true;
            } else if (ocean[y][x + i].getLook() != "~") {
                System.out.println(message);
                return true;
            }
        }
        return false;
    }

    public void placeBarrier(Ship ship, boolean isVertical) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        if (isVertical) {
            for (y = x - 1; y <= y + 1; y++) {
                for (x = y - 1; x <= x + ship.getSize() + 1; x++) {
                    if (y >= 0 && y < 10 && x >= 0 && x < 10) {
                        ocean[y][x].isOccupied = true;
                    }
                }
            }
        } else {
            for (y = y - 1; y <= y + 1; y++) {
                for (x = x - 1; x <= x + ship.getSize() + 1; x++) {
                    if (y >= 0 && y < 10 && x >= 0 && x < 10) {
                        ocean[x][y].isOccupied = true;
                    }
                }
            }
        }
    }

    public boolean checkIfBarrier(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        String message = "Barrier in a way.";
        if (ship.isVertical) {
            for (int i = y - 1; i <= y + 1; i++) {
                for (int j = x - 1; j <= x + ship.size + 1; j++) {
                    if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                        if (ocean[j][i].isOccupied = true) {
                            System.out.println(message);
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int i = y - 1; i <= y + 1; i++) {
                for (int j = x - 1; j <= x + ship.size + 1; j++) {
                    if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                        if (ocean[i][j].isOccupied = true) {
                            System.out.println(message);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // RAW VERSION OF PRINTING
    public void printOcean() {
        String printedLine = "";
        for (Square[] line : ocean) {
            for (int i = 0; i < line.length; i++) {
                printedLine += line[i].getLook() + "  ";
            }
            System.out.println(printedLine);
            printedLine = "";
        }
    }

    // CONVERTING INPUT TO COORDINATES
    Square getLocationFromCoordinatesInputtedAsString(String coordinates) {
        int x, y;
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
                x = -1;
        }
        return ocean[y][x];
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

        for (Square[] rowArray : ocean) {
            if (counter < 10) {
                System.out.print("(" + counter + ")" + threeSpaces + "|");
            } else {
                System.out.print("(" + counter + ")" + twoSpaces + "|");
            }

            System.out.print(" ");

            for (Square elementOfRow : rowArray) {
                System.out.print(elementOfRow.getLook() + " ");
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