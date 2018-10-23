package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {
        // sortowanie babelkowe

        /*
        mamy n elementow
        wykonujemy sprawdzanie n-1 razy.
        Przechodzimy po tablicy i sprawdzamy czy elementy sa w poprawnej kolejonosci

        poczatek: 5 4 7 2 1 6 3
        1: 4 5 2 1 6 3 7 - najciezszy element wyplywa na koniec tablicy
        2: 4 2 1 5 3 6 7
        3: 2 1 4 3 5 6 7
        4: 1 2 3 4 5 6 7
        5:
        6: bo mamy 7 elementow (n-1)

        Zlożonosc czasowa: O(n^2)
        Zlozonosc pamieciowa: O(1)

        Usprawnienia do algortmu

       - nie sprawdza posortowanej tablicy
       - sprawdzamy czy w poprzednich przejsciach sa zamiany- jesli nie to algorytm moze sie zakonczyc
       (boolean- ustawic domyslnie jako false). Jesli sa zmiany w przejsciach to petla bedzie dzialala dalej
       - nie musimy uwzgledniac koncowej wartosci tablicy, bo maximum zawsze wyplywa na koniec
       po 1 przejsciu nie musimy sprawdzac ostatniego elementu
       po 2 nie sprawdamy n-2 itp.
         */
// implementacja
    }

    // metoda sort- statyczna w (przekazujemy tablice intow do posortowania o nazwie arrayToSort)
    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length; // dzieki temu mamy dostep o ilosci elementow w tablicy
        int i = 0;                  // wprowadzamy licznik ile razy przeszlismy po tablicy

        // pierwsze usprawnienie- nie wykonujemy sortowania na juz posortowanej tablicy
        boolean swapped = true; // ustawiamy na true zeby petla sie zaczela

// sprawdzenie wykonujemy w petli while. Wykonujemy to az liczba iteracji jest mniejsza od n-1
        while (i < n - 1 && swapped) { // jesli nie wykonales ilosci iteracji ktora gwarantuje posortowanie albo wykonales zamiane to wykonujemy nasz kod
            swapped = false; // przed kazda iteracja ustawiamy na false
            for (int j = 0; j < n - 1 - i; j++) { // przechodzimy po wszystkich elementach w tablicy, nie mozemy wyjsc poza indeks
                // kolejne usprawnienie- odcinanie uporzadkowanej juz czesci tablicy, stad n -1 - i sie wzielo. Eliminujemy dochodzenie do konca tablicy przez odjecie zmiennej i
                if (arrayToSort[j] > arrayToSort[j + 1]) { // odwolujemy sie do pol tablicy do posortowania
                    swap(arrayToSort, j, j + 1);    // wywolujemy funkcje swap
                    swapped = true; // gdy tablica zostala posortowana
                }
            }
            i++;
        }
    }

    private static void swap(int[] arr, int index1, int index2) { //wykonujemy operacje na tablicy
        // przekazujemy tablice, index 1 i index2
        int tmp = arr[index1]; // zapamietujemy index z elementu 1
        arr[index1] = arr[index2]; //
        arr[index2] = tmp;
    }
}
