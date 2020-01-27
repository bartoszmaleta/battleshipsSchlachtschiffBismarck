package classes;

public class FieldWithShip extends Field {

    private int size;

    public FieldWithShip() {
        this.isShipHere = true;
        this.apparel = setIsChecked();
    }

    @Override
    public boolean getIsShipHere () {
        return isShipHere;
    }

    @Override
    public boolean getIsChecked () {
        return isChecked;
    }

    @Override
    public String setIsChecked () {
        if (getIsChecked()) {
            this.apparel = "O";
        } else {
            this.apparel = "X";
        }
        return this.apparel;
    }


}
