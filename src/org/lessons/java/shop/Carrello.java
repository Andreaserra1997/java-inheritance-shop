package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carrello cart = new Carrello();

        while (true) {
            System.out.println("Cosa desideri aggiungere al carrello? (1. Smartphone / 2. Televisore / 3. Cuffie / 0. Fine)");
            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            }
            

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Descrizione: ");
            String descrizione = scan.nextLine();

            System.out.print("Prezzo: ");
            int prezzo = scan.nextInt();

            System.out.print("IVA: ");
            int iva = scan.nextInt();

            if (choice == 1) {
                System.out.print("IMEI: ");
                int imei = scan.nextInt();

                System.out.print("Memoria (GB): ");
                int memoria = scan.nextInt();

                Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
            } else if (choice == 2) {
                System.out.print("Dimensioni (pollici): ");
                int dimensioni = scan.nextInt();

                System.out.print("È Smart? (true / false): ");
                boolean isSmart = Boolean.parseBoolean(scan.nextLine());

                Tv tv = new Tv(nome, descrizione, prezzo, iva, dimensioni, isSmart);
            } else if (choice == 3) {
                System.out.print("Colore: ");
                String colore = scan.nextLine();

                System.out.print("Sono Wireless? (true / false): ");
                boolean isWireless = Boolean.parseBoolean(scan.nextLine());

                Headphone cuffie = new Headphone(nome, descrizione, prezzo, iva, colore, isWireless);
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        System.out.println(cart);
        scan.close();
    }
}
