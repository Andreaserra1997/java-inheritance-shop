package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private int numAccount;
    private String name;
    private double balance;

    public Conto(String name) {
        this.numAccount = new Random().nextInt(10000);
        this.name = name;
        this.balance = 0.0;
    }

    public void pour(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Importo non valido o conto insufficiente.");
        }
    }

    public String getInformazioniConto() {
        return "Numero Conto: " + numAccount + "Proprietario: " + name;
    }

    public String getSaldoFormattato() {
        return String.format("Saldo: %.2f€", balance);
    }

}
