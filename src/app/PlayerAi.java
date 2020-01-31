package app;

import java.util.HashMap;
import java.util.Map;

import app.Square;

public class PlayerAi extends Player {

    public void attackPlayerSquare(Ocean opponentOcean) {
        // PLAYER MISSES
        int x = (int) (Math.random() * 10 + 1);
        int y = (int) (Math.random() * 10 + 1);
        if (!opponentOcean.getOcean()[y][x].isShip) {
            opponentOcean.getOcean()[y][x].setMissLook();
            System.out.println("You missed");
        // PLAYER HITS
        } else {
            opponentOcean.getOcean()[y][x].setIsHit();
            opponentOcean.getOcean()[y][x].setHitLook();
            System.out.println("You hit a ship");
        }
    }

    // --------------------------------------------------------------
    // JUST GETTERS AND SETTERS
    
    // public String getAiName() {
    //     return aiName;
    // }

    // public void setAiName(String aiName) {
    //     this.aiName = aiName;
    // }

    // public Ocean getAiOcean() {
    //     return aiOcean;
    // }

    // public void setAiOcean(Ocean aiOcean) {
    //     this.aiOcean = aiOcean;
    // }

    // public Ocean getAiOceanToShowOtherPlayer() {
    //     return aiOceanToShowOtherPlayer;
    // }

    // public void setAiOceanToShowOtherPlayer(Ocean aiOceanToShowOtherPlayer) {
    //     this.aiOceanToShowOtherPlayer = aiOceanToShowOtherPlayer;
    // }

    // public boolean isHasLost() {
    //     return hasLost;
    // }

    // public void setHasLost(boolean hasLost) {
    //     this.hasLost = hasLost;
    // }

    // public Map<String, Integer> getMapOfShips() {
    //     return mapOfShips;
    // }

    // public void setMapOfShips(Map<String, Integer> mapOfShips) {
    //     this.mapOfShips = mapOfShips;
    // }

    // public int getHealth() {
    //     return health;
    // }

    // public void setHealth(int health) {
    //     this.health = health;
    // }

        // -----------------------------------------------------------

    // private boolean checkIfHit(Square[][] board, int x, int y, boolean makingMove) {
        // if (board[y][x].getIsHit()) {
        // } else {
            // hit(board[y][x]);
            // makingMove = true;
        // }
        // return makingMove;
    // }
// 
    // public void hit(Square square) {
        // square.setIsHit();
    // }
// 
    // @Override
    // public boolean getHasLost() {
        // return hasLost;
    // }
// 
    // @Override
    // public void setHasLost() {
        // this.hasLost = true;
    // }
// 
    // @Override
    // public void printOcean() {
// 
    // }
// 
    // public void moveEasy() {
        // boolean makingMove = true;
        // while (makingMove) {
            // int x = (int) (Math.random() * 10 + 1);
            // int y = (int) (Math.random() * 10 + 1);
            // checkIfHit(playerOcean.getOcean(), x, y, makingMove);
        // }
    // }

}