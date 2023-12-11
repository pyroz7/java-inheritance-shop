package org.generation.jaita99.inheritance.shop;

import java.util.ArrayList;
import java.util.List;

class Carrello {
    private List <Prodotto> prodotti;

    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Carrello:\n");
        for (Prodotto prodotto : prodotti) {
            result.append(prodotto.toString()).append("\n");
        }
        return result.toString();
    }
}
