package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;


public class Televisore extends Prodotto {
    private String dimensioni;
    private boolean smart;

    public Televisore(BigDecimal codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String dimensioni, boolean smart) {
        super(codice, nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisore{" +
                "codice=" + getCodice() +
                ", nome='" + getNome() + '\'' +
                ", descrizione='" + getDescrizione() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", iva=" + getIva() +
                ", dimensioni='" + dimensioni + '\'' +
                ", smart=" + smart +
                '}';
    }

}