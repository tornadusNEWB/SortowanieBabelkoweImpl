package com.sda.kolekcje;

import java.util.Random;

// utworzono klase testujaca
public class TestSortowania {

    public static void main(String[] args) {
        Random random = new Random(); // obiekt klasy random, ktory losowo przydziela liczby do tablicy o dlugosci 50
        int[] tablicaTesotwa = new int[50];

        for (int i = 0; i < tablicaTesotwa.length; i++) {
            tablicaTesotwa[i] = random.nextInt(100); // losowe liczby z przedzialu od 0-100
        }

        TestSortowania.printArray(tablicaTesotwa); // drukuje tablice przed sortowaniem
        long start = System.currentTimeMillis(); // sprawdamy ile czasu algorytm potrzebowal czasu- uzywamy czasu systemowego
        Main.sort(tablicaTesotwa); // wywolujemy sortowanie
        System.out.print("czas potrzebny na sortowanie [ms]: ");
        System.out.println(System.currentTimeMillis() - start); // drukujemy wartosc obecnosc. Kolejny raz odwolujemy sie do metody currentTimeMillis

        TestSortowania.printArray(tablicaTesotwa); // jeszcze raz drukuje tablice, tym razem uporzadkowana
    }

    // metoda do drukowania tablicy - petla for
    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
        System.out.println();
    }
}
