package app.classes;

public class Battleship extends Ship {

    public Battleship() {
        this.size = 4;
    }

    @Override
    public String getLook() {
        return look;
    }

    @Override
    public boolean setIsGuessed() {
        this.look = "#";
        return isGuessed = true;
    }


}
