package org.generation.jaita99.inheritance.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci un prodotto (1. Smartphone, 2. Televisore, 3. Cuffie, 0. Esci): ");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                break;
            }

            System.out.println("Inserisci il codice: ");
            BigDecimal codice = scanner.nextBigDecimal();
            System.out.println("Inserisci il nome: ");
            String nome = scanner.next();
            System.out.println("Inserisci la descrizione: ");
            String descrizione = scanner.next();
            System.out.println("Inserisci il prezzo: ");
            BigDecimal prezzo = scanner.nextBigDecimal();
            System.out.println("Inserisci l'IVA: ");
            BigDecimal iva = scanner.nextBigDecimal();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci l'IMEI: ");
                    String imei = scanner.nextLine();
                    System.out.println("Inserisci la memoria: ");
                    BigDecimal memoria = scanner.nextBigDecimal();
                    carrello.aggiungiProdotto(new Smartphone(codice, nome, descrizione, prezzo, iva, imei, memoria));
                    break;

                case 2:
                    System.out.println("Inserisci le dimensioni: ");
                    String dimensioni = scanner.next();
                    System.out.println("Il televisore è smart? (true/false): ");
                    boolean smart = scanner.nextBoolean();
                    carrello.aggiungiProdotto(new Televisore(codice, nome, descrizione, prezzo, iva, dimensioni, smart));
                    break;

                case 3:
                    System.out.println("Inserisci il colore: ");
                    String colore = scanner.next();
                    System.out.println("Le cuffie sono wireless? (true/false): ");
                    boolean wireless = scanner.nextBoolean();
                    carrello.aggiungiProdotto(new Cuffie(codice, nome, descrizione, prezzo, iva, colore, wireless));
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }

        System.out.println(carrello);
    }
}