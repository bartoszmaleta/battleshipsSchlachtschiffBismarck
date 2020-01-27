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
        for (Square[] oneLine : ocean) {
            Square instance = new Square();
            Arrays.fill(oneLine, instance);
        }
    }

    // GETTER FOR OCEAN
    public Square[][] getOcean() {
        return ocean;
    }

    // PRINTING
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

    public static String stringMultiply(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

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

    // TESTING PRINT OF OCEAN IN MAIN

}