package com.cc.java;

public class Konto {

    private int kontostand; // Anfangswert

public Konto(int kontostand){
    this.kontostand= kontostand;
}


    public int getKontostand() {
        return kontostand;
    }

    public void faktor(int faktor) {
        this.kontostand *= faktor;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

}
