package app.classes;

public class Submarine extends Ship {

    public Submarine() {
        this.size = 3;
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

