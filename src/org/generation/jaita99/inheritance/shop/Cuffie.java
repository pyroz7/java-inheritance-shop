package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(BigDecimal codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(codice, nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "codice=" + getCodice() +
                ", nome='" + getNome() + '\'' +
                ", descrizione='" + getDescrizione() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", iva=" + getIva() +
                ", colore='" + colore + '\'' +
                ", wireless=" + wireless +
                '}';
    }
 }
