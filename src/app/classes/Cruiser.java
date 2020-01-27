package app.classes;

public class Cruiser extends Ship {

    public Cruiser() {
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
