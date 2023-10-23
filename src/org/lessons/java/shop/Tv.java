package org.lessons.java.shop;

public class Tv extends Prodotto{
    private int dimensions;
    private boolean isSmart;

    public Tv(String name, String description, int price, int iva, int dimensions, boolean isSmart) {
        super(name, description, price, iva);
        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }


    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
