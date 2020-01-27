package classes;

public abstract class Field {

    protected boolean isShipHere = false;
    protected boolean isChecked = false;
    protected String apparel = this.setIsChecked();

    public Field() {
    }

    public abstract boolean getIsShipHere ();

    public abstract boolean getIsChecked ();

    public abstract String setIsChecked ();


}
