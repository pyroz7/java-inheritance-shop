package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;
public class Smartphone extends Prodotto {
    private String imei;
    private BigDecimal memoria;

    //COSTRUTTORE

    public Smartphone(BigDecimal codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String imei, BigDecimal memoria) {
        super(codice, nome, descrizione, prezzo, iva);
        this.imei = this.imei;
        this.memoria = this.memoria;
    }

    //GETTER E SETTER IMEI E MEMORIA
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public BigDecimal getMemoria() {
        return memoria;
    }

    public void setMemoria(BigDecimal memoria) {
        this.memoria = memoria;
    }

    //OVERRIDE
    @Override
    public String toString() {
        return "Smartphone{" +
                "codice=" + getCodice() +
                ", nome='" + getNome() + '\'' +
                ", descrizione='" + getDescrizione() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", iva=" + getIva() +
                ", imei='" + imei + '\'' +
                ", memoria=" + memoria +
                '}';
    }

}




