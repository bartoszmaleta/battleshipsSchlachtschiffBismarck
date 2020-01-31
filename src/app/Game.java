package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// TODO: 
// - PvAI                           WIP
// - Graphics                       NICE TO HAVE
// - Difficulty                     SHOULD
// - Statistics                     NICE TO HAVE
// - List<Ship> in Player class     SHOULD

public class Game {
    Helpers helpers = new Helpers(); // has method clearScreen()
    Player player1;
    Player player2;
    boolean gameProceed = true;
    Scanner scanner = new Scanner(System.in);
    List<Ship> player1Ships = new ArrayList<>();
    List<Ship> player2Ships = new ArrayList<>();
    PlayerAi ai;
    List<Ship> aiShips = new ArrayList<>();

    public Game() {
        player1 = new Player();
        player2 = new Player();
        playGame();
    }

    private void gamePvP() {
        // INITIALIZATION OF PLAYERS
        
        // SETTING NAME FOR PLAYERS FROM INPUTS
        settingPlayersName();

        printAndPlaceOceansBeforeAndAfterPlacingShips(player1);

        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        settingHealthOfPlayer1();

        // NEXT PLAYER
        helpers.pressAnyKeyToContinue();
        helpers.clearScreen();
        helpers.oneDashLine();
        // -------------------------------------------
        printAndPlaceOceansBeforeAndAfterPlacingShips(player2);

        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        // TODO: should be one method with parameter
        // TODO: need to create field in Player class with ArrayList of Ships!!!
        settingHealthOfPlayer2();

        // -------------------------------------------
        helpers.pressAnyKeyToContinue();

        while (this.gameProceed) {
            if (player1.getHealth() != 0 && player2.getHealth() != 0) {
                helpers.clearScreen();

                playerTurn(player1, player2);

                helpers.pressAnyKeyToContinue();
                helpers.clearScreen();

                playerTurn(player2, player1);
            } else {
                if (isPlayerOneWinner(player1.getHealth(), player2.getHealth())) {
                    congratsToWinner(player1);
                    terminateGame();
                } else {
                    congratsToWinner(player2);
                    terminateGame();
                }
            }
        }
    }

    private void gamePvC() {
        ai = new PlayerAi();

        // SETTING NAME FOR PLAYERS FROM INPUTS
        settingPlayersName();

        printAndPlaceOceansBeforeAndAfterPlacingShips(player1);

        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        settingHealthOfPlayer1();

        // NEXT PLAYER
        helpers.pressAnyKeyToContinue();
        helpers.clearScreen();
        helpers.oneDashLine();
        // -------------------------------------------
        // AI - SETTING NAME
        ai.setPlayerName("AI");

        // AI - PRINT AND PLACING SHIPS
        

        // AI - SETTING HEALTH
        settingHealthOfAi();

        while (this.gameProceed) {
            if (player1.getHealth() != 0 && ai.getHealth() != 0) {
                helpers.clearScreen();

                playerTurn(player1, ai);

                helpers.pressAnyKeyToContinue();
                helpers.clearScreen();

                playerTurn(ai, player1);
            } else {
                if (isPlayerOneWinner(player1.getHealth(), ai.getHealth())) {
                    congratsToWinner(player1);
                    terminateGame();
                } else {
                    congratsToWinner(ai);
                    terminateGame();
                }
            }
        }

    }

    private void placePlayerShipOnBoardAndAddToListOfShips(Player playerToPlaceShips) {
        // TODO: TO FIX THIS METHOD ===> have to create a field in Player class:
        // ArrayList<Ship> shipsOfPlayer

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
        System.out.println();
        System.out.println();
        System.out.println();
        helpers.clearScreen();

        // WHOS TURN
        System.out.println("ROUND OF PLAYER ===> " + attacker.getName());

        // SHOW OCEANS + MY HEALTH:
        showHealth(attacker);
        System.out.println("My ocean: ");
        attacker.getPlayerOcean().printBoardString();

        System.out.println("My opponent ocean: ");
        opponent.getPlayerOceanToShowOtherPlayer().printBoardString();

        // INPUT COORDINATES
        System.out.println("Please enter coordinate you want to attack: ");
        String coordinatesToConvert = getStringCoordinate();
        int x = helpers.convertCooridnateXToInt(coordinatesToConvert) + 1; // why i have to add 1 ???
        int y = helpers.convertInputCoordinateYToInt(coordinatesToConvert); // why i dont have to add 1 ???
        System.out.println("x = " + x + ", y = " + y);

        // int x = 1; // or 1
        // int y = 1; // or 1

        attacker.attackSquare(x, y, opponent.getPlayerOcean());

        helpers.clearScreen();
        helpers.emptyLinesThree();
        System.out.println("Opponent ocean: ");

        opponent.getPlayerOcean().printBoardString();
        boolean checkIfHit = isOpponentsSquareHitted(x, y, opponent);
        // System.out.println(checkIfHit); // to delete
        if (checkIfHit) {
            System.out.println("Good job. You have hit >>>> " + opponent.getName() + " <<<< ship.");
            opponent.getPlayerOceanToShowOtherPlayer().getOcean()[y][x].look = "O";
            opponent.subtractHealth();
        } else {
            System.out.println("You missed");
            opponent.getPlayerOceanToShowOtherPlayer().getOcean()[y][x].look = "X";
        }

        helpers.pressAnyKeyToContinue();
        helpers.emptyLinesThree();
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

    public void settingHealthOfPlayer1() {
        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        Map<String, Integer> mapOfPlayer1Ships = createMapOfShips(player1, player1Ships);
        int sumOfPlayer1Ships = sumOfAllShips(mapOfPlayer1Ships, player1);
        System.out.println("Remaining sum of health of player 1 ships = " + sumOfPlayer1Ships); // // to comment
        player1.setHealth(sumOfPlayer1Ships);
    }

    public void settingHealthOfPlayer2() {
        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        Map<String, Integer> mapOfPlayer2Ships = createMapOfShips(player2, player2Ships);
        int sumOfPlayer2Ships = sumOfAllShips(mapOfPlayer2Ships, player2);
        System.out.println("Remaining sum of health of player 2 ships = " + sumOfPlayer2Ships); // to comment
        player2.setHealth(sumOfPlayer2Ships);
    }

    public void settingHealthOfAi() {
        // // CREATING SUM OF ALL SHIPS AND SETTING HEALTH
        Map<String, Integer> mapOfAiShips = createMapOfShips(ai, aiShips);
        int sumOfAiShips = sumOfAllShips(mapOfAiShips, ai);
        System.out.println("Remaining sum of health of ai ships = " + sumOfAiShips); // to comment
        ai.setHealth(sumOfAiShips);
    }

    public void printAndPlaceOceansBeforeAndAfterPlacingShips(Player playerToShowOceans) {
        // // PRINTING PLAYER OCEAN BEFORE PLACING
        System.out.println(">>>> " + playerToShowOceans.getName() + " <<<< ocean before placing ships: ");
        playerToShowOceans.getPlayerOcean().printBoardString();

        // PRINTING PLAYER 1 OCEAN BEFORE PLACING
        placePlayerShipOnBoardAndAddToListOfShips(playerToShowOceans);
        System.out.println(">>>> " + playerToShowOceans.getName() + " <<<< ocean");
        playerToShowOceans.getPlayerOcean().printBoardString();
    }

    private void settingPlayersName() {
        helpers.emptyLinesThree();
        System.out.println("What is the player ONE name: ");
        getPlayerNameFromInput(player1);

        helpers.emptyLinesThree();

        System.out.println("What is the player TWO name: ");
        getPlayerNameFromInput(player2);
        helpers.emptyLinesThree();
        helpers.pressAnyKeyToContinue();
        helpers.clearScreen();
    }

    private void congratsToWinner(Player winner) {
        System.out.println("Bravo PLAYER = " + winner.getName() + "! Very good job!");
    }

    private void showHealth(Player playerToShowHealth) {
        System.out.println();
        System.out.println(">>>> " + playerToShowHealth.getName() + " <<<< and You have "
                + playerToShowHealth.getHealth() + " health.");
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
        return "A1"; // to fix!!
    }

    public Map<String, Integer> createMapOfShips(Player playerWithShips, List<Ship> ships) {

        // TODO: CREATE FOR LOOP

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
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        helpers.displayWelcomeScreen();

        while (isRunning) {

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