package app;

public class Square {
    public String look = "~";
    // public String hitLook = "X";

    public Square() {
        this.look = look;
        // this.hitLook = hitLook;
    }

    public String getLook() {
        return look;
    }

    public void hitLook() {
        this.look = "X";
    }
}