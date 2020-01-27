package classes;

public class FieldWithoutShip extends Field {

    public FieldWithoutShip () {
        this.apparel = setIsChecked();
    }

    @Override
    public boolean getIsShipHere() {
        return this.isShipHere;
    }

    @Override
    public boolean getIsChecked() {
        return this.isChecked;
    }

    @Override
    public String setIsChecked() {
        if (getIsChecked()) {
            this.apparel = "O";
        } else {
            this.apparel = "~";
        }
        return this.apparel;
    }
}
