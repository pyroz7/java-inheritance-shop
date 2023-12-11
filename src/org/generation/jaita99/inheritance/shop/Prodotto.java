package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;

public class Prodotto {
    //ATTRIBUTI

    private BigDecimal codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva ;

    //COSTRUTTORI

    public Prodotto (BigDecimal codice,String nome,String descrizione,BigDecimal prezzo,BigDecimal iva){
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //GETTER E SETTER


    public BigDecimal getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(){
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

