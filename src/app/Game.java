package app;

import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Game {
    Helpers helpers = new Helpers(); // has method clearScreen()
    Player player1;
    Player player2;
    boolean gameProceed = true;
    Scanner scanner = new Scanner(System.in);
    Ocean oceanToPlayForPlayer1;
    Ocean oceanToPlayForPlayer2;

    public Game() {
        player1 = new Player();
        player2 = new Player();
        oceanToPlayForPlayer1 = new Ocean();
        oceanToPlayForPlayer2 = new Ocean();
        playGame();
    }

    public void createTables() {

    }

    private void gamePvP() {
        System.out.println("I am in gamePVP");
        List<Ship> shipsPlayer1 = new ArrayList<>();
        Ship carrier = new Ship(5, "C", 1, 1, true);
        Ship battleship = new Ship(4, "B", 3, 2, false);

        // create boards

        // GETTING NAME FOR PLAYERS FROM INPUTS
        System.out.println("What is the player ONE name = ");
        String nameOfPlayer1 = getPlayerNameFromInput(player1);
        System.out.println("");
        System.out.println("What is the player TWO name = ");
        String nameOfPlayer2 = getPlayerNameFromInput(player2);

        // ROUND PVP GAME
        while (this.gameProceed) {
            // PLAYER 1 OCEAN
            Ocean player1Ocean = player1.getPlayerOcean();
            player1Ocean.printBoardString();
            player1Ocean.placeShip(carrier);
            System.out.println("player1 ocean: ");
            player1Ocean.printBoardString();

            // PLAYER 2 OCEAN
            Ocean player2Ocean = player2.getPlayerOcean();
            player2Ocean.placeShip(battleship);
            System.out.println("player2 ocean: ");
            player2Ocean.printBoardString();

            player2.attackSquare(0, 0, player1Ocean);
            System.out.println("player1 Ocean after hit");
            player1Ocean.printBoardString();

            if (player1Ocean.getLocationFromCoordinatesAsInts(0, 0).getLook() == "O") {
                System.out.println("Square is hit");
            }

            if (isOpponentsSquareHitted(0, 0, player1)) {
                System.out.println("Square is hit from boolean");
            }
            // System.out.println( getIntWithValidation());
            // System.out.println("123");

            break;

        }
    }

    private void gamePvC() {
        System.out.println("I am in gamePVC");
    }

    private void playerTurn(Player attacker, Player opponent) {
        // TODO: ask for coordinate to attack

        

        int x = 3;
        int y = 4;
        attacker.attackSquare(x, y, opponent.getPlayerOcean());
        boolean checkIfHit = isOpponentsSquareHitted(x, y, opponent);
        System.out.println(checkIfHit);
        if (checkIfHit) {
            System.out.println("Good job. You have hit player2 ship.");
        } else {
            System.out.println("You missed");
        }
    }

    private boolean isOpponentsSquareHitted(int x, int y, Player playerToCheck) {
        if (playerToCheck.getPlayerOcean().getOneSquareFromGivenCoordinatesAsInt(x, y) == "O") {
            return true;
        }
        return false;
    }

    private String getPlayerNameFromInput(Player playerToSetName) {
        String nameOfPlayer = scanner.nextLine();
        playerToSetName.setPlayerName(nameOfPlayer);

        return nameOfPlayer;
    }

    private void terminateGame() {
        this.gameProceed = false;
    }

    private int getIntWithValidation() {

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                return x;
            } else {
                System.out.println("Not int!");
                return -1;
            }
        }
        return -1;
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