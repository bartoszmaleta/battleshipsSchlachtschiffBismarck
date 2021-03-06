package app;

import java.util.Scanner;

public class Helpers {
    Scanner scanner = new Scanner(System.in);
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int convertCooridnateXToInt(String coordinates) {
        int convertedCoordinateXToInt = 0;
        String coordinateX = coordinates.substring(0, 1);
        switch (coordinateX) {
        case "A":
            convertedCoordinateXToInt = 0;
            break;
        case "B":
            convertedCoordinateXToInt = 1;
            break;
        case "C":
            convertedCoordinateXToInt = 2;
            break;
        case "D":
            convertedCoordinateXToInt = 3;
            break;
        case "E":
            convertedCoordinateXToInt = 4;
            break;
        case "F":
            convertedCoordinateXToInt = 5;
            break;
        case "G":
            convertedCoordinateXToInt = 6;
            break;
        case "H":
            convertedCoordinateXToInt = 7;
            break;
        case "I":
            convertedCoordinateXToInt = 8;
            break;
        case "J":
            convertedCoordinateXToInt = 9;
            break;
        default:
            System.out.println("Wrong input");
        }
        return convertedCoordinateXToInt;
    }

    public int convertInputCoordinateYToInt(String inputCoordinates) {
        int y = Integer.parseInt(inputCoordinates.substring(1));
        return y;
    }

    public boolean convertStringToBoolean(String yesOrNo) {
        boolean isVertical = true;
        yesOrNo.toLowerCase();
        switch (yesOrNo) {
        case "y":
            isVertical = true;
            break;
        case "n":
            isVertical = false;
            break;
        default:
            System.out.println("You did not choose horizontal or vertical. Default is Vertical");
            isVertical = true;
        }
        return isVertical;
    }

    public void pressAnyKeyToContinue() {
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }

    public void emptyLinesThree() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void displayWelcomeScreen() {
        emptyLinesThree();
        System.out.println("Welcome to BATTLESHIP" +
         "GAME");
        System.out.println("Produced by: ");
        System.out.println("Bartosz Maleta");
        System.out.println("Szymon Niemiec");
        System.out.println("Przemysław Buszek");
        emptyLinesThree();
        pressAnyKeyToContinue();
        clearScreen();
    }

    public void oneDashLine() {
        System.out.println("--------------------");
    }
}