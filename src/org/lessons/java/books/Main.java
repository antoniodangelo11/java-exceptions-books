package org.lessons.java.books;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        int numBooks = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Inserisci il numero di libri nel catalogo: ");
                numBooks = input.nextInt();
                input.nextLine();

                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Errore: Inserisci un numero valido.");
                input.nextLine();
            }
        }

        // Popolo l'array di Book
        Book[] catalog = new Book[numBooks];

        // Inserisco i libri
        for (int i = 0; i < catalog.length; i++) {
            System.out.println("\nInserisci i dati del libro " + (i + 1));

            boolean addBook = false;

            while (!addBook) {
                try {
                    System.out.print("Titolo: ");
                    String title = input.nextLine();

                    System.out.print("Numero di pagine: ");
                    int pageCount = input.nextInt();
                    input.nextLine();

                    System.out.print("Autore: ");
                    String author = input.nextLine();

                    System.out.print("Editore: ");
                    String publisher = input.nextLine();

                    Book book = new Book(title, pageCount, author, publisher);
                    catalog[i] = book;

                    addBook = true;

                } catch (IllegalArgumentException e) {
                    System.out.println("Errore: " + e.getMessage() + " Riprova.");
                }
            }
        }

        // Mostro i libri aggiunti all'array
        System.out.println("\nCatalogo dei libri:");

        for (Book p : catalog) {
            System.out.println("\n" + p);
        }

        // Chiudo lo Scanner
        input.close();
    }
}

