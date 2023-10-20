package org.lessons.java.shop;


public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto("Telefono", "Bellissimo", 799, 22);
        System.out.println(product1.getNameComplete());
        System.out.println("Costo con IVA: " + product1.getPriceIva() + "€");
        System.out.println("Costo senza IVA: " + product1.getPrice() + "€");
        Prodotto product2 = new Prodotto("PC", "Usato", 400, 10);
        System.out.println(product2.getNameComplete());
        System.out.println("Costo con IVA: " + product2.getPriceIva() + "€");
        System.out.println("Costo senza IVA: " + product2.getPrice() + "€");
        Prodotto product3 = new Prodotto("Tablet", "Ricondizionato", 199, 22);
        System.out.println(product3.getNameComplete());
        System.out.println("Costo con IVA: " + product3.getPriceIva() + "€");
        System.out.println("Costo senza IVA: " + product3.getPrice() + "€");
    }
}
