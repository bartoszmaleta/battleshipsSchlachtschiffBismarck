package app.testingFunctions.Player;

import app.Square;

public class PlayerAI extends Player {

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

    }


    public void moveEasy() {
        boolean makingMove = true;
        while (makingMove) {
            int x = (int) (Math.random() * 10 + 1);
            int y = (int) (Math.random() * 10 + 1);
            checkIfHit(playerOcean.getOcean(), x, y, makingMove);
        }
    }

    private boolean checkIfHit(Square[][] board, int x, int y, boolean makingMove) {
        if (board[y][x].getIsHit()) {
        } else {
            hit(board[y][x]);
            makingMove = true;
        }
        return makingMove;
    }

    public void hit(Square square) {
        square.setIsHit();
    }
}
