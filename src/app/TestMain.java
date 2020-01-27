package app;

import java.util.Arrays;


public class TestMain {

    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.printBoardString();
        // Square[][] oceanBoard = ocean.ocean;
        // System.out.println(Arrays.toString(ocean));
        // printBoardString(oceanBoard);
    }


    // // TESTING PRINTS OF OCEAN
    // public static void printBoardString(Square[][] multiArray) {
    //     int counter = 1;
    //     String space = " ";
    //     String twoSpaces = stringMultiply(space, 2);
    //     String threeSpaces = stringMultiply(space, 3);

    //     for (Square[] rowArray : multiArray) {
    //         if (counter < 10) {
    //             System.out.print("(" + counter + ")" + threeSpaces + "|");
    //         } else {
    //             System.out.print("(" + counter + ")" + twoSpaces + "|");
    //         }

    //         System.out.print(" ");

    //         for (Square elementOfRow : rowArray) {
    //             System.out.print(elementOfRow + " ");
    //         }
    //         counter += 1;
    //         System.out.print("|");
    //         System.out.println();
    //     }

    // }

    // public static String stringMultiply(String s, int n) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < n; i++) {
    //         sb.append(s);
    //     }
    //     return sb.toString();
    // }
}