package classes;

public abstract class Field {

    protected boolean isShipHere = false;
    protected String apparel = "~";

    public Field() {
    }

    public abstract boolean getIsShipHere ();

    public abstract String getApparel ();
}
