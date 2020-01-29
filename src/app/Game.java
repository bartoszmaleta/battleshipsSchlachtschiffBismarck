package app;

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
        Ship carrier = new Ship(5, "C", 0, 0, true);
        Ship battleship = new Ship(4, "B",3,2, false);

        // create boards
        
        // GETTING NAME FOR PLAYERS FROM INPUTS
        System.out.println("What is the player ONE name = ");
        String nameOfPlayer1 = getPlayerNameFromInput(player1);
        System.out.println("What is the player TWO name = ");
        String nameOfPlayer2 = getPlayerNameFromInput(player2);

        // ROUND PVP GAME
        while(this.gameProceed) {

            playerTurn(player1, player2);
            
            String oneSquareOfPlayerOneOcean = player2.getPlayerOcean().getOneSquareFromGivenCoordinatesAsInt(3, 4);            
            System.out.println(oneSquareOfPlayerOneOcean);

            player2.getPlayerOcean().printBoardString();

            playerTurn(player2, player1);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            player1.getPlayerOcean().printBoardString();

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
        if (playerToCheck.getPlayerOcean().getOneSquareFromGivenCoordinatesAsInt(x, y) == "X") {
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