package app;

import app.classes.Water;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Water water = new Water();
        water.setIsGuessed();
        System.out.println(water.getLook());
//
//
//        String dashString = "-";
//
//        String[][] lst = new String[10][10];
//        String[] lstOneLine = lst[1];
//        System.out.println(Arrays.toString(lstOneLine));
//        StringBuilder oneLineStringBuilder = new StringBuilder();
//        String oneLineString = "";
//
//        for (String elem : lstOneLine) {
//            // String elemString = Integer.toString(elem);
//            oneLineString += elem;
//            System.out.println(oneLineString);
//        }
//        System.out.println(oneLineString);
//        String dashesFromComa = stringMultiply(dashString, (lst.length - 1));
//        String dashesFromSpaces = stringMultiply(dashString, (lst.length - 1));
//        String dashesFromArrayBoundaries = stringMultiply(dashString, 2);
//        String dashesFromNumberOfElementsOfArray = stringMultiply(dashString, lstOneLine.length);
//        String dashesFromSpacesBetweeenBoundariesAndTildes = stringMultiply(dashString, 2);
//        String dashesFromNumberingAndStartTabs = stringMultiply(dashString, 6);
//        String space2 = " ";
//        String spacesFromNumberingAndStartTabs = stringMultiply(space2, 6);
//
//        String dashesAboveAndBelow = spacesFromNumberingAndStartTabs + dashesFromComa + dashesFromSpaces
//                + dashesFromArrayBoundaries + dashesFromNumberOfElementsOfArray;
//        System.out.println(dashesAboveAndBelow.length());
//
//        String spaceFromBoundary = " ";
//        String spacesBeforeLettersAboveBoard = spaceFromBoundary + spacesFromNumberingAndStartTabs;
//        String spacesBetweenLetters = stringMultiply(space2, 1);
//        String spaceBetweenFirstTildeAndBoundary = stringMultiply(space2, 1);
//        String lineAboveBoard = spaceBetweenFirstTildeAndBoundary + spacesBeforeLettersAboveBoard + "A"
//                + spacesBetweenLetters + "B" + spacesBetweenLetters + "C" + spacesBetweenLetters + "D"
//                + spacesBetweenLetters + "E" + spacesBetweenLetters + "F" + spacesBetweenLetters + "G"
//                + spacesBetweenLetters + "H" + spacesBetweenLetters + "I" + spacesBetweenLetters + "J";
//
//        System.out.println(lineAboveBoard);
//        System.out.println(dashesAboveAndBelow);
//
//        printBoard(lst);
//
//        System.out.println(dashesAboveAndBelow);
//
//        String[] strArr = new String[5];
//        System.out.println(Arrays.toString(strArr));
//        for (String elem : strArr) {
//            elem = ".";
//        }
//        System.out.println(Arrays.toString(strArr));
//
//        for (int i = 0; i < strArr.length; i++) {
//            strArr[i] = ".";
//        }
//
//        System.out.println(Arrays.toString(strArr));
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        System.out.println(lineAboveBoard);
//        System.out.println(dashesAboveAndBelow);
//
//        String[][] lstWithDots = convertToTilde(lst);
//        printBoard(lstWithDots);
//        printBoardString(lstWithDots);
//
//        System.out.println(dashesAboveAndBelow);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        System.out.println(lineAboveBoard);
//        System.out.println(dashesAboveAndBelow);
//        String dashesUpAndDown = spacesFromNumberingAndStartTabs + dashesFromSpacesBetweeenBoundariesAndTildes
//                + dashesFromSpaces + dashesFromArrayBoundaries + dashesFromNumberOfElementsOfArray;
//        System.out.println(dashesUpAndDown);
//
//        // --------------------------------
//        String[][] lstWithDots2 = convertToTilde(lst);
//        // printBoard(lstWithDots);
//        printLineWithLetters();
//        printBoardString(lstWithDots2);
//        printDashesBelowBoard(lst);
//        // --------------------------------
//
//        printLineWithLetters();
//        lstWithDots2[0][3] = "O";
//        lstWithDots2[1][3] = "O";
//        lstWithDots2[2][3] = "O";
//        lstWithDots2[3][3] = "O";
//        printBoardString(lstWithDots2);
//
//        System.out.println(dashesUpAndDown);
//        System.out.println(dashesAboveAndBelow);
//
//        Square square = new Square();
//        //System.out.println(square.signOfSquare);
//
//    }
//
//    public static void printBoard(String[][] lst) {
//        int counter = 1;
//        String space = " ";
//        String twoSpaces = stringMultiply(space, 2);
//        String threeSpaces = stringMultiply(space, 3);
//
//        for (String[] arr : lst) {
//            if (counter < 10) {
//                System.out.println("(" + counter + ")" + threeSpaces + Arrays.toString(arr));
//            } else {
//                System.out.println("(" + counter + ")" + twoSpaces + Arrays.toString(arr));
//            }
//            counter += 1;
//        }
//
//    }
//
//    public static void printBoardString(String[][] multiArray) {
//        int counter = 1;
//        String space = " ";
//        String twoSpaces = stringMultiply(space, 2);
//        String threeSpaces = stringMultiply(space, 3);
//
//        for (String[] rowArray : multiArray) {
//            if (counter < 10) {
//                System.out.print("(" + counter + ")" + threeSpaces + "|");
//            } else {
//                System.out.print("(" + counter + ")" + twoSpaces + "|");
//            }
//
//            System.out.print(" ");
//
//            for (String elementOfRow : rowArray) {
//                System.out.print(elementOfRow + " ");
//            }
//            counter += 1;
//            System.out.print("|");
//            System.out.println();
//        }
//
//    }
//
//    public static String[][] convertToTilde(String[][] tableToConvert) {
//        String[][] convertedTable = new String[tableToConvert.length][tableToConvert[0].length];
//        for (int i = 0; i < tableToConvert.length; i++) {
//            for (int j = 0; j < tableToConvert[0].length; j++) {
//                convertedTable[i][j] = "~";
//            }
//        }
//
//        return convertedTable;
//    }
//
//    public static String stringMultiply(String s, int n) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(s);
//        }
//        return sb.toString();
//    }
//
//    public static void printLineWithLetters() {
//        String space = " ";
//        String spaceFromBoundary = " ";
//        String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
//        String spacesBeforeLettersAboveBoard = spaceFromBoundary + spacesFromNumberingAndStartTabs;
//        String spacesBetweenLetters = stringMultiply(space, 1);
//        String spaceBetweenFirstTildeAndBoundary = stringMultiply(space, 1);
//        String lineAboveBoard = spaceBetweenFirstTildeAndBoundary + spacesBeforeLettersAboveBoard + "A"
//                + spacesBetweenLetters + "B" + spacesBetweenLetters + "C" + spacesBetweenLetters + "D"
//                + spacesBetweenLetters + "E" + spacesBetweenLetters + "F" + spacesBetweenLetters + "G"
//                + spacesBetweenLetters + "H" + spacesBetweenLetters + "I" + spacesBetweenLetters + "J";
//
//        System.out.println(lineAboveBoard);
//    }
//
//    public static void printDashesBelowBoard(String[][] lst) {
//        String[] lstOneLine = lst[0];
//
//        String space = " ";
//        String dashString = "-";
//        String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
//        String dashesFromSpacesBetweeenBoundariesAndTildes = stringMultiply(dashString, 2);
//        String dashesFromSpaces = stringMultiply(dashString, (lst.length - 1));
//        String dashesFromArrayBoundaries = stringMultiply(dashString, 2);
//        String dashesFromNumberOfElementsOfArray = stringMultiply(dashString, lstOneLine.length);
//        String dashesUpAndDown = spacesFromNumberingAndStartTabs + dashesFromSpacesBetweeenBoundariesAndTildes
//                + dashesFromSpaces + dashesFromArrayBoundaries + dashesFromNumberOfElementsOfArray;
//        System.out.println(dashesUpAndDown);
//    }
//
//    public static int convertLetterCoordinateToInt(String letter) {
//        // remember to upperCase convert!
//        int coordinateX = 0;
//
//        switch (letter) {
//        case "A":
//            coordinateX = 0;
//            break;
//        case "B":
//            coordinateX = 1;
//            break;
//        case "C":
//            coordinateX = 2;
//            break;
//        case "D":
//            coordinateX = 3;
//            break;
//        case "E":
//            coordinateX = 4;
//            break;
//        case "F":
//            coordinateX = 5;
//            break;
//        case "G":
//            coordinateX = 6;
//            break;
//        case "H":
//            coordinateX = 7;
//            break;
//        case "I":
//            coordinateX = 8;
//            break;
//        case "J":
//            coordinateX = 9;
//            break;
//        }
//        return coordinateX;
    }
}