package classes;

public class FieldWithoutShip extends Field {

    public FieldWithoutShip () {

    }

    @Override
    public boolean getIsShipHere () {
        return this.isShipHere;
    }

    @Override
    public String getApparel () {
        return this.apparel;
    }
}
