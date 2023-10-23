package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private int price;
    private int iva;

    Random codRandom = new Random();

    //COSTRUTTORI

    public Prodotto(String name, String description, int price, int iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva= iva;
        code = codRandom.nextInt(1, 10000);
    }

    //METODI

    public String getNameComplete() {
        return name + "-" + code;
    }
    public int getPriceIva() {
        return price + (price * iva / 100);
    }

    //GETTER E SETTER

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }

    public int getCode() {
        return code;
    }
}
