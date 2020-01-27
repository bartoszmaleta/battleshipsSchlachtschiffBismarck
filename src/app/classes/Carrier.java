package app.classes;

public class Carrier extends Ship {


    public Carrier () {
        this.size = 5;
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
