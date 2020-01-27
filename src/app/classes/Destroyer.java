package app.classes;

public class Destroyer extends Ship {

    public Destroyer() {
        this.size = 2;
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
