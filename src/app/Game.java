package app;

import java.util.Scanner;

public class Game {
    Helpers helpers = new Helpers(); // has method clearScreen()

    public Game() {
        playGame();
    }

    private void gamePvP() {
        System.out.println("I am in gamePVP");
    }

    private void gamePvC() {
        System.out.println("I am in gamePVC");
    }

    private void playGame() {
        boolean isRunning = true;

        while (isRunning) {
            Menu menu = new Menu();
            Scanner scanner = new Scanner(System.in);

            menu.showMenu();

            int choosedOption = scanner.nextInt();
            switch (choosedOption) {
            case 1:
                gamePvP();
                break;
            case 2:
                gamePvC();
                break;
            case 7:
                System.exit(0);
                break;
            }
        }
    }
}