package app;

import java.util.HashMap;
import java.util.Map;

import app.Square;

public class PlayerAi extends Player {

    @Override
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