// package app;

// import java.util.Arrays;

// public class MapOfOcean {
//     private Square[][] mapOfOcean;

//     public MapOfOcean() {
//         this.mapOfOcean = new Square[10][10];
//         // ocean = new Square[10][10];

//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 10; j++) {
//                 this.mapOfOcean[j][i] = new Square(i, j);
//             }
//         }
//     }

//     public Square getSquare(int x, int y) {
//         // return mapOfOcean[y][x];
//         return mapOfOcean[x][y];
//     }

//     public void placeShipHorizontally(Ship ship) {
//         int x = ship.getXofShip();
//         for (int i = 0; i < ship.getSize(); i++) {

//         }
//     }

//     // public boolean checkPlaceOnBoardHorizontally(Ship ship) {
//         // int postionXofShip = ship.getXofShip() - 1;
//         // int postionYofShip = ship.getYofShip() - 1;
//         // if (ship.getSize() + postionXofShip + 2 <= 
//     // }


//     // public void markAsHit(int y, int x) {
//         // Square location = mapOfOcean[y][x];
//         // location = getSquare(x, y).markAsShip();
//     // }




//     // PRINTING BOARD
//     // public String getGamerBoard() {
// // 
//     // }

//     public void printBoardString() {
//         int counter = 1;
//         String space = " ";
//         String twoSpaces = stringMultiply(space, 2);
//         String threeSpaces = stringMultiply(space, 3);

//         printLineWithLetters();

//         for (Square[] rowArray : mapOfOcean) {
//             if (counter < 10) {
//                 System.out.print("(" + counter + ")" + threeSpaces + "|");
//             } else {
//                 System.out.print("(" + counter + ")" + twoSpaces + "|");
//             }

//             System.out.print(" ");

//             for (Square elementOfRow : rowArray) {
//                 System.out.print(elementOfRow.getGamerSquare() + " ");
//             }
//             counter += 1;
//             System.out.print("|");
//             System.out.println();
//         }

//         printDashesBelowBoard();
//     }

//     // MULTIPLIER FOR STRINGS
//     public static String stringMultiply(String s, int n) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb.append(s);
//         }
//         return sb.toString();
//     }

//     // PRINT LINE WITH LETTERS FOR ROWS
//     public void printLineWithLetters() {
//         String space = " ";
//         String spaceFromBoundary = " ";
//         String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
//         String spacesBeforeLettersAboveBoard = spaceFromBoundary + spacesFromNumberingAndStartTabs;
//         String spacesBetweenLetters = stringMultiply(space, 1);
//         String spaceBetweenFirstTildeAndBoundary = stringMultiply(space, 1);
//         String lineAboveBoard = spaceBetweenFirstTildeAndBoundary + spacesBeforeLettersAboveBoard + "A"
//                 + spacesBetweenLetters + "B" + spacesBetweenLetters + "C" + spacesBetweenLetters + "D"
//                 + spacesBetweenLetters + "E" + spacesBetweenLetters + "F" + spacesBetweenLetters + "G"
//                 + spacesBetweenLetters + "H" + spacesBetweenLetters + "I" + spacesBetweenLetters + "J";

//         System.out.println(lineAboveBoard);
//     }

//     // PRINT DASHES BELOW BOARD (DECORATE BOARD)
//     public void printDashesBelowBoard() {

//         String space = " ";
//         String dashString = "-";
//         String spacesFromNumberingAndStartTabs = stringMultiply(space, 6);
//         String dashesFromSpacesBetweeenBoundariesAndTildes = stringMultiply(dashString, 2);
//         String dashesFromSpaces = stringMultiply(dashString, (mapOfOcean.length - 1));
//         String dashesFromArrayBoundaries = stringMultiply(dashString, 2);
//         String dashesFromNumberOfElementsOfArray = stringMultiply(dashString, mapOfOcean[0].length);
//         String dashesUpAndDown = spacesFromNumberingAndStartTabs + dashesFromSpacesBetweeenBoundariesAndTildes
//                 + dashesFromSpaces + dashesFromArrayBoundaries + dashesFromNumberOfElementsOfArray;
//         System.out.println(dashesUpAndDown);
//     }

// }