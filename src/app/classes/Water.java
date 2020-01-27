package app.classes;

public class Water extends Square {

    public Water() {
        this.look = "~";
    }


    @Override
    public String getLook() {
        return look;
    }

    @Override
    public boolean setIsGuessed() {
        this.look = "X";
        return isGuessed = true;
    }

}
