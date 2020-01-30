package app;

public class Helpers {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int convertCooridnateXToInt(String coordinateX) {
        int convertedCoordinateXToInt = 0;
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
}