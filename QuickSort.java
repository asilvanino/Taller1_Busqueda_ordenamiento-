/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

/**
 *
 * @author Andres SILVA
 */
public class QuickSort {

    public void QuickSort(int Arreglo[], int i, int d) {
        int mitad = i + (d - i) / 2;
        int izquierda = i;
        int derecha = d;
        int pivote = Arreglo[mitad];

        while (izquierda <= derecha) {
            while (Arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (Arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda <= derecha) {
                int cambio = Arreglo[izquierda];
                Arreglo[izquierda] = Arreglo[derecha];
                Arreglo[derecha] = cambio;
                izquierda++;
                derecha--;
            }
        }

        if (i < derecha) {

            QuickSort(Arreglo, i, derecha);
        }
        if (d > izquierda) {

            QuickSort(Arreglo, izquierda, d);
        }

    }
}
