package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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
        List<Ship> player1Ships = new ArrayList<>();
        Ship carrier = new Ship(5, "C", 1, 1, true);
        Ship battleship = new Ship(4, "B", 2, 1, true);
        Ship cruiser = new Ship(3, "c", 3, 1, true);
        Ship submarine = new Ship(3, "S", 4, 1, true);
        Ship destroyer = new Ship(2, "D", 5, 1, true);

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
            System.out.println("player1 ocean before placing ships: ");
            player1Ocean.printBoardString();
            
            player1Ocean.placeShip(carrier);
            player1Ocean.placeShip(battleship);
            player1Ocean.placeShip(cruiser);
            player1Ocean.placeShip(submarine);
            player1Ocean.placeShip(destroyer);

            player1Ships.add(carrier);
            player1Ships.add(battleship);
            player1Ships.add(cruiser);
            player1Ships.add(submarine);
            player1Ships.add(destroyer);

            System.out.println("player1 ocean: ");
            player1Ocean.printBoardString();

            // PLAYER 2 OCEAN
            Ocean player2Ocean = player2.getPlayerOcean();
            player2Ocean.placeShip(battleship);
            System.out.println("player2 ocean: ");
            player2Ocean.printBoardString();

            // player2.attackSquare(1, 1, player1Ocean);
            // System.out.println("player1 Ocean after hit");
            // player1Ocean.printBoardString();

            // if (player1Ocean.getLocationFromCoordinatesAsInts(0, 0).getLook() == "O") {
            //     System.out.println("Square is hit");
            // }

            // if (isOpponentsSquareHitted(0, 0, player1)) {
            //     System.out.println("Square is hit from boolean");
            // }

            playerTurn(player1, player2);
            // player2.getPlayerOceanToShowOtherPlayer().printBoardString();

            // playerTurn(player2, player1);
            // player1.getPlayerOceanToShowOtherPlayer().printBoardString();

            Map<String, Integer> mapOfPlayer1Ships = createMapOfShips(player1, player1Ships);
            int sumOfPlayer1Ships = sumOfAllShips(mapOfPlayer1Ships, player1);
            System.out.println(sumOfPlayer1Ships);
            
            System.out.println(getIntWithValidation());
            System.out.println("123");

            break;

        }
    }

    private void gamePvC() {
        System.out.println("I am in gamePVC");
    }

    private void playerTurn(Player attacker, Player opponent) {
        // INPUT COORDINATES
        // String coordinatesToConvert = getStringCoordinate();
        // int x = helpers.convertCooridnateXToInt(coordinatesToConvert);
        // int y = helpers.convertInputCoordinateYToInt(coordinatesToConvert);
        

        int x = 1;  // or 1
        int y = 1;  // or 1
        attacker.attackSquare(x, y, opponent.getPlayerOcean());
        boolean checkIfHit = isOpponentsSquareHitted(x, y, opponent);
        System.out.println(checkIfHit); // to delete
        if (checkIfHit) {
            System.out.println("Good job. You have hit " + opponent.getName() +  " ship.");
            opponent.getPlayerOceanToShowOtherPlayer().getOcean()[y][x].look = "O";
        } else {
            System.out.println("You missed");
            opponent.getPlayerOceanToShowOtherPlayer().getOcean()[y][x].look = "X";
        }
        
        System.out.println("My ocean: ");
        attacker.getPlayerOcean().printBoardString();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ocean of my opponent ocean: ");
        opponent.getPlayerOceanToShowOtherPlayer().printBoardString();
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
                System.out.println("Enter int");
                return -1;
            }
        }
        return -1;
    }

    private String getStringCoordinate() {
        while (scanner.hasNext()) {
            if (scanner.hasNext()) {
                String letterFromCoordinate = scanner.nextLine();
                return letterFromCoordinate;
            } else {
                System.out.println("Error! Not a letter");
                return "Enter a letter";
            }
        }
        return "";
    }

    public Map<String, Integer> createMapOfShips(Player playerWithShips, List<Ship> ships) {
        // for (Ship ship : ships) {
            // player.getMapOfShips().put(, value)
        // }

        // for (Ship ship : ship) {
        //     playerWithShips.getMapOfShips().put(playerWithShips.)
        // }

        playerWithShips.getMapOfShips().put(ships.get(0).getLook(), ships.get(0).getSize());
        playerWithShips.getMapOfShips().put(ships.get(1).getLook(), ships.get(1).getSize());
        playerWithShips.getMapOfShips().put(ships.get(2).getLook(), ships.get(2).getSize());
        playerWithShips.getMapOfShips().put(ships.get(3).getLook(), ships.get(3).getSize());
        playerWithShips.getMapOfShips().put(ships.get(4).getLook(), ships.get(4).getSize());

        return playerWithShips.getMapOfShips();
    }

    public int sumOfAllShips(Map<String, Integer> shipsOfPlayer, Player playerToSumShips) {
        int sum = 0;
        for (int value : shipsOfPlayer.values()) {
            sum += value;
        }

        return sum;
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