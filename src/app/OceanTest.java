package app;

import java.util.Arrays;

public class OceanTest {
    // INITIALIZATION OF INSTANCE OF SQUARE
    Square square = new Square();

    // DECLARATION OF BOARD
    // private Square[][] ocean = new Square[10][10];
    private Square[][] ocean;

    public OceanTest() {
        ocean = new Square[10][10];
        for (Square[] oneLine : ocean) {
            Square instance = new Square();
            Arrays.fill(oneLine, instance);
        }
    }

    // RETURN LOOK OF SQUARE IN GIVEN COORDINATES
    public String getOneSquareFromGivenCoordinatesAsInt(int x, int y) {
        return ocean[y][x].getLook();
    }


    public void fillOceanWithSquares() {
        for (Square[] row : ocean) {
            for (Square square : row) {
                square = new Square();
            }
        }
    }

    public void placeShip(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        for (int i = 0; i < ship.getSize(); i++) {
            ocean[y][x + 1] = ship.shipSquares[i];
        }
        
    }

    // GETTER FOR OCEAN
    public Square[][] getOcean() {
        return ocean;
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