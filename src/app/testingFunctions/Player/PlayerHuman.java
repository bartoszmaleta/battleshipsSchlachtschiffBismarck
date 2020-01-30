package app.testingFunctions.Player;

import app.Ocean;
import app.Square;

import java.util.Scanner;

public class PlayerHuman extends Player {

    Scanner input = new Scanner(System.in);
    private String name;
    private int move = 0;

    public PlayerHuman() {
        System.out.print("Name: ");
        name = input.nextLine();
    }


    @Override
    public boolean getHasLost() {
        return hasLost;
    }

    @Override
    public void setHasLost() {
        this.hasLost = true;
    }

    @Override
    public void printOcean() {
        String row;
        for (Square[] line : playerOcean.getOcean()) {
            row = "";
            for (int i = 1; i <= 10; i++) {
                if (!line[i].getIsHit()) {
                    row += "~  ";
                } else {
                    row += line[i].getLook() + "  ";
                }
            }
        }
    }

    public Ocean getOcean() {
        return playerOcean;
    }

    public Square[][] getBoard() {
       return playerOcean.getOcean();
    }

    public void move(Ocean ocean) {
        System.out.println("Choose square");
        Scanner userInput = new Scanner(System.in);
        String coords = userInput.nextLine();
        Square square = getLocationFromCoordinatesInputtedAsString(coords, ocean);
        hit(square);
    }

    public void hit(Square square) {
        square.setIsHit();
    }

    // CONVERTING INPUT TO COORDINATES
    Square getLocationFromCoordinatesInputtedAsString(String coordinates, Ocean ocean) {
        int x = 0, y;
        y = Integer.parseInt(coordinates.substring(1));
        switch (coordinates.substring(0, 1)) {
            case "A":
                x = 1;
                break;
            case "B":
                x = 2;
                break;
            case "C":
                x = 3;
                break;
            case "D":
                x = 4;
                break;
            case "E":
                x = 5;
                break;
            case "F":
                x = 6;
                break;
            case "G":
                x = 7;
                break;
            case "H":
                x = 8;
                break;
            case "I":
                x = 9;
                break;
            case "J":
                x = 10;
                break;
            default:
                System.out.println("Wrong input");
        }
        return ocean.getOcean()[y][x];
    }
}
