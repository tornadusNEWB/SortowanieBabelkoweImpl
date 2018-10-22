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

    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length;
        int i = 0;

        // pierwsze usprwanienie
        boolean swapeed = true;


        while (i < n - 1 && swapeed) {
            swapeed = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swap(arrayToSort, j, j + 1);
                    swapeed = true;
                }
            }
            i++;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
