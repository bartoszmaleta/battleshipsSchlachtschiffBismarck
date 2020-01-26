package app;

public class Coordinate {
    private int x, y;
    
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSame(Coordinate coordinate) {
        if (coordinate.getX() == this.x && coordinate.getY() == this.y) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "\nX = " + x + "\nY = " + y;
    }

}