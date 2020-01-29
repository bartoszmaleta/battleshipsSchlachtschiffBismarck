package app;

import java.util.Scanner;

public class Game {
    Helpers helpers = new Helpers(); // has method clearScreen()
    Player player1;
    boolean gameProceed = true;
    Scanner scanner = new Scanner(System.in);


    public Game() {
        player1 = new Player();
        playGame();
    }

    public void createTables() {

    }

    private void gamePvP() {
        System.out.println("I am in gamePVP");
        // create boards

        while(this.gameProceed) {
            String nameOfPlayer = scanner.nextLine();
            player1.setPlayerName(nameOfPlayer);
            // player1Turn
        }
    }

    private void gamePvC() {
        System.out.println("I am in gamePVC");
    }

    private void player1Turn(Player player, Player playerOpponent) {

    }

    private void playGame() {
        boolean isRunning = true;

        while (isRunning) {
            // WELCOME SCREEN
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