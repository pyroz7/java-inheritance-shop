package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;

public class Prodotto {
    private final int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(int codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPrezzoConIva() {
        return prezzo.add(prezzo.multiply(iva));
    }
}

class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(int codice, String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String imei, int memoria) {
        super(codice, nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }



    }

