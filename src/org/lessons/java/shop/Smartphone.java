package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    private int imei;
    private int memory;

    public Smartphone(String name, String description, int price, int iva, int imei, int memory) {
        super(name, description, price, iva);
        this.imei = imei;
        this.memory = memory;
    }


    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
