package org.lessons.java.shop;

public class Headphone extends Prodotto{
    private String color;
    private boolean isWireless;

    public Headphone(String name, String description, int price, int iva, String color, boolean isWireless) {
        super(name, description, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}