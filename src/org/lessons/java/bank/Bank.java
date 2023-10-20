package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nameAccount = scan.nextLine();

        Conto conto = new Conto(nameAccount);

        boolean continued = true;

        while (continued) {
            System.out.println("Menu:");
            System.out.println("1. Versa denaro");
            System.out.println("2. Preleva denaro");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");

            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.print("Inserisci l'importo da versare: ");
                double importoVersamento = scan.nextDouble();
                conto.pour(importoVersamento);
                System.out.println("Operazione riuscita. " + conto.getSaldoFormattato());
            } else if (choose == 2) {
                System.out.print("Inserisci l'importo da prelevare: ");
                double importoPrelievo = scan.nextDouble();
                conto.withdraw(importoPrelievo);
                System.out.println("Operazione riuscita. " + conto.getSaldoFormattato());
            } else if (choose == 3) {
                System.out.println("Grazie per aver usato il servizio.");
                continued = false;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }

        scan.close();
    }
}
