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
    List<Ship> player1Ships = new ArrayList<>();
    List<Ship> player2Ships = new ArrayList<>();

    public Game() {
        player1 = new Player();
        player2 = new Player();
        playGame();
    }

    public void createTables() {

    }

    private void gamePvP() {
        System.out.println("I am in gamePVP");

        // GETTING NAME FOR PLAYERS FROM INPUTS
        System.out.println("What is the player ONE name = ");
        String nameOfPlayer1 = getPlayerNameFromInput(player1);
        System.out.println("");
        System.out.println("What is the player TWO name = ");
        String nameOfPlayer2 = getPlayerNameFromInput(player2);

        // ROUND PVP GAME
        // PLAYER 1 OCEAN
        Ocean player1Ocean = player1.getPlayerOcean();
        System.out.println("player1 ocean before placing ships: ");
        player1Ocean.printBoardString();

        // PLACING SHIPS
        placePlayerShipOnBoardAndAddToListOfShips(player1);
        System.out.println("player1 ocean: ");
        player1Ocean.printBoardString();

        // CREATING SUM OF ALL SHIPS
        Map<String, Integer> mapOfPlayer1Ships = createMapOfShips(player1, player1Ships);
        int sumOfPlayer1Ships = sumOfAllShips(mapOfPlayer1Ships, player1);
        System.out.println("Remaining sum of health of player 1 ships = " + sumOfPlayer1Ships);
        player1.setHealth(sumOfPlayer1Ships);

        // -------------------------------------------
        System.out.println("--------------------");
        // PLAYER 2 OCEAN
        Ocean player2Ocean = player2.getPlayerOcean();
        System.out.println("player2 ocean before placing ships: ");
        player2Ocean.printBoardString();

        // // PLACING SHIPS
        placePlayerShipOnBoardAndAddToListOfShips(player2);
        System.out.println("player2 ocean after: ");
        player2Ocean.printBoardString();

        // // CREATING SUM OF ALL SHIPS
        Map<String, Integer> mapOfPlayer2Ships = createMapOfShips(player2, player2Ships);
        int sumOfPlayer2Ships = sumOfAllShips(mapOfPlayer2Ships, player2);
        System.out.println("Remaining sum of health of player 2 ships = " + sumOfPlayer2Ships);
        player2.setHealth(sumOfPlayer2Ships);
        System.out.println("heaathy = " + player1.getHealth());
        System.out.println("heaathy = " + player2.getHealth());
        
        // System.out.println("--------------------");
        // // TURNS
        // int healthPlayer1 = player1.getHealth();
        // int healthPlayer2 = player2.getHealth();
        

        while (this.gameProceed) {
            if (player1.getHealth() != 0 && player2.getHealth() != 0) {
                // helpers.clearScreen();
                System.out.println("Player 1 health = " + player1.getHealth());
                System.out.println("Player 2 health = " + player2.getHealth());
                playerTurn(player1, player2);
                playerTurn(player2, player1);
            } else {
                if (isPlayerOneWinner(sumOfPlayer1Ships, sumOfPlayer2Ships)) {
                    System.out.println("Bravo PLAYER ONE = " + player1.getName() + "! Very good job!");
                    this.gameProceed = false;
                } else {
                    System.out.println("Bravo PLAYER TWO = " + player2.getName() + "! Very good job!");
                    this.gameProceed = false;
                }
            }
        }
    }

    private void gamePvC() {
        System.out.println("I am in gamePVC");
    }

    private void placePlayerShipOnBoardAndAddToListOfShips(Player playerToPlaceShips) {
        // // CARRIER
        // System.out.println("Please enter if ship Carrier with 5 squares is gonna be
        // vertical or not (y/n): ");
        // boolean answerIfVerticalCarrier = getInputWithIsVertical();

        // System.out.println("Please enter coordinate: ");
        // String coordinatesToConvertCarrier = getStringCoordinate();
        // int xCarrier = helpers.convertCooridnateXToInt(coordinatesToConvertCarrier) +
        // 1;
        // int yCarrier =
        // helpers.convertInputCoordinateYToInt(coordinatesToConvertCarrier);

        // // BATTLESHIP
        // System.out.println("Please enter if ship Battleship with 4 squares is gonna
        // be vertical or not (y/n): ");
        // boolean answerIfVerticalBattleship = getInputWithIsVertical();

        // System.out.println("Please enter coordinate: ");
        // String coordinatesToConvertBattleship = getStringCoordinate();
        // int xBattleship =
        // helpers.convertCooridnateXToInt(coordinatesToConvertBattleship) + 1;
        // int yBattleship =
        // helpers.convertInputCoordinateYToInt(coordinatesToConvertBattleship);

        // // CRUISER
        // System.out.println("Please enter if ship Cruiser with 3 squares is gonna be
        // vertical or not (y/n): ");
        // boolean answerIfVerticalCruiser = getInputWithIsVertical();

        // System.out.println("Please enter coordinate: ");
        // String coordinatesToConvertCruiser = getStringCoordinate();

        // int xCruiser = helpers.convertCooridnateXToInt(coordinatesToConvertCruiser) +
        // 1;
        // int yCruiser =
        // helpers.convertInputCoordinateYToInt(coordinatesToConvertCruiser);

        // // SUBMARINE
        // System.out.println("Please enter if ship Submarine with 3 squares is gonna be
        // vertical or not (y/n): ");
        // boolean answerIfVerticalSubmarine = getInputWithIsVertical();

        // System.out.println("Please enter coordinate: ");
        // String coordinatesToConvertSubmarine = getStringCoordinate();

        // int xSubmarine =
        // helpers.convertCooridnateXToInt(coordinatesToConvertSubmarine) + 1;
        // int ySubmarine =
        // helpers.convertInputCoordinateYToInt(coordinatesToConvertSubmarine);

        // // DESTROYER
        // System.out.println("Please enter if ship Destroyer with 2 squares is gonna be
        // vertical or not (y/n): ");
        // boolean answerIfVerticalDestroyer = getInputWithIsVertical();

        // System.out.println("Please enter coordinate: ");
        // String coordinatesToConvertDestroyer = getStringCoordinate();

        // int xDestroyer =
        // helpers.convertCooridnateXToInt(coordinatesToConvertDestroyer) + 1;
        // int yDestroyer =
        // helpers.convertInputCoordinateYToInt(coordinatesToConvertDestroyer);

        // Ship carrier = new Ship(5, "C", xCarrier, yCarrier, answerIfVerticalCarrier);
        // Ship battleship = new Ship(4, "B", xBattleship, yBattleship,
        // answerIfVerticalBattleship);
        // Ship cruiser = new Ship(3, "c", xCruiser, yCruiser, answerIfVerticalCruiser);
        // Ship submarine = new Ship(3, "S", xSubmarine, ySubmarine,
        // answerIfVerticalSubmarine);
        // Ship destroyer = new Ship(2, "D", xDestroyer, yDestroyer,
        // answerIfVerticalDestroyer);
        // ----------------------------------------------------------------------

        Ship carrier = new Ship(5, "C", 1, 1, true);
        Ship battleship = new Ship(4, "B", 3, 1, true);
        Ship cruiser = new Ship(3, "c", 5, 1, true);
        Ship submarine = new Ship(3, "S", 2, 10, false);
        Ship destroyer = new Ship(2, "D", 7, 7, false);

        playerToPlaceShips.getPlayerOcean().placeShip(carrier);
        playerToPlaceShips.getPlayerOcean().placeShip(battleship);
        playerToPlaceShips.getPlayerOcean().placeShip(cruiser);
        playerToPlaceShips.getPlayerOcean().placeShip(submarine);
        playerToPlaceShips.getPlayerOcean().placeShip(destroyer);

        if (playerToPlaceShips == player1) {
            player1Ships.add(carrier);
            player1Ships.add(battleship);
            player1Ships.add(cruiser);
            player1Ships.add(submarine);
            player1Ships.add(destroyer);
        } else {
            player2Ships.add(carrier);
            player2Ships.add(battleship);
            player2Ships.add(cruiser);
            player2Ships.add(submarine);
            player2Ships.add(destroyer);
        }

    }

    private void playerTurn(Player attacker, Player opponent) {
        // INPUT COORDINATES
        System.out.println("Please enter coordinate you want to attack: ");
        String coordinatesToConvert = getStringCoordinate();
        int x = helpers.convertCooridnateXToInt(coordinatesToConvert) + 1; // why i have to add 1 ???
        int y = helpers.convertInputCoordinateYToInt(coordinatesToConvert); // why i dont have to add 1 ???
        System.out.println("x = " + x + ", y = " + y);

        // int x = 1; // or 1
        // int y = 1; // or 1
        attacker.attackSquare(x, y, opponent.getPlayerOcean());
        System.out.println("Opponent ocean: ");
        opponent.getPlayerOcean().printBoardString();
        boolean checkIfHit = isOpponentsSquareHitted(x, y, opponent);
        System.out.println(checkIfHit); // to delete
        if (checkIfHit) {
            System.out.println("Good job. You have hit >>>> " + opponent.getName() + " <<<< ship.");
            opponent.getPlayerOceanToShowOtherPlayer().getOcean()[y][x].look = "O";
            opponent.subtractHealth();
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

    private boolean getInputWithIsVertical() {
        String askIfIsVertical = scanner.nextLine();
        boolean ifVertical = helpers.convertStringToBoolean(askIfIsVertical);
        return ifVertical;
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
    private boolean isPlayerOneWinner(int sumOfPlayer1Ships, int sumOfPlayer2Ships) {
        if (sumOfPlayer2Ships == 0) {
            return true;
        } else {
            return false;
        }
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
        // playerWithShips.getMapOfShips().put(playerWithShips.)
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