package app;

public class Square {

    String look = "~";
    boolean isHit = false;
    boolean isShip = false;

    public Square() {
    }

    public String getLook() {
        return look;
    }

    public boolean getIsHit() {
        return isHit;
    }

    public boolean getIsShip() {
        return isShip;
    }

    public void setLook() {
        if (isShip) {
            this.look = "X";
        } else {
            this.look = "O";
        }
    }

    public void setIsHit() {
        this.isHit = true;
        setLook();
    }

    public void setIsShip() {
        this.isShip = true;
    }

}