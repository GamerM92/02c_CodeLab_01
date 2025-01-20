package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);
    
        output("Anfangs-Kontostände: ");        // Anfangs-Kontostände
        output("Konto 1: "+ konto1.getKontostand());
        output("Konto 2: "+ konto2.getKontostand());
        output("Konto 3: "+ konto3.getKontostand());

        konto1.faktor(2);  // Verdoppelung
        konto2.faktor(3);  // Verdreifachung
        konto3.faktor(10); // Verzehnfachung

        output("\nAktuelle-Kontostände: ");     // Aktuelle-Kontostände
        output("Konto 1: "+ konto1.getKontostand());
        output("Konto 2: "+ konto2.getKontostand());
        output("Konto 3: "+ konto3.getKontostand());
    }
    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 
}