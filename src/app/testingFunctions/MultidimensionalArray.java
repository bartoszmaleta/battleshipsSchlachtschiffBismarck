package app.testingFunctions;

import java.util.Arrays;

public class MultidimensionalArray {
    /*
     * 2 4 8 4 11 12 9 5 10 3 21 -2
     */
    public static void main(String[] args) {
        int[][] table = new int[3][4];
        // int[row][column] = new int[3 rows] [4 columns]
        table[0][0] = 2;
        table[0][1] = 4;
        table[0][2] = 8;
        table[0][3] = 4;

        table[1][0] = 11;
        table[1][1] = 12;
        table[1][2] = 9;
        table[1][3] = 5;

        table[2][0] = 10;
        table[2][1] = 3;
        table[2][2] = 21;
        table[2][3] = -2;

        System.out.println(table[0][0] + " " + table[0][1] + " " + table[0][2] + " " + table[0][3]);
        System.out.println(table[1][0] + " " + table[1][1] + " " + table[1][2] + " " + table[1][3]);
        System.out.println(table[2][0] + " " + table[2][1] + " " + table[2][2] + " " + table[2][3]);

        System.out.println();

        int counter = 1;
        for (int[] rowArray : table) {
            for (int columnArray : rowArray) {
                // columnArray = 0;
                System.out.print(columnArray + " ");
            }
            System.out.println();
            counter += 1;
        }

        System.out.println();
        System.out.println("converted");

        int[][] convertedTable = convertToZeros(table);
        for (int[] rowArray : convertedTable) {
            for (int elementOfRowOfArray : rowArray) {
                System.out.print(elementOfRowOfArray + " ");
            }
            System.out.println();
            counter += 1;
        }

    }

    public static int[][] convertToZeros(int[][] tableToConvert) {
        // int counter = 1;
        int[][] convertedTable = new int [tableToConvert.length][tableToConvert[0].length];
        for (int i = 0; i < tableToConvert.length; i++) {
            for (int j = 0; j < tableToConvert[0].length; j++) {
                convertedTable[i][j] = 0;
            }
        }



        // System.out.println("print convert");
        // for (int[] row : convertedTable) {
            // for (int elem : row) {
                // System.out.print(elem + " ");
            // }
        // }

        return convertedTable;
    }
}