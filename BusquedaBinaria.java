/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busquedas;

import java.util.Scanner;

/**
 *
 * @author SIL
 */
public class BusquedaBinaria {

    public void BusquedaBinaria() {
        Scanner Leer = new Scanner(System.in);
        int Array[] = {10, 12, 14, 16, 18, 20, 26, 30, 37, 41};
        for (int x = 0; x < Array.length; x++) {
            System.out.print(Array[x] + ",");
        }
        System.out.println("");
        int Inferior = 0;
        int Superior = Array.length - 1;
        System.out.print("Ingrese el numero que quiere buscar: ");
        int x = Leer.nextInt();

        while (Inferior <= Superior) {
            int Mitad = (Superior + Inferior) / 2;
            if (Array[Mitad] == x) {
                System.out.println("El numero " + x + " se encuentra en la poscion " + Inferior);
                break;
            } else if (x < Array[Mitad]) {
                Superior = Mitad - 1;
            } else {
                Inferior = Mitad + 1;
            }
        }
    }

}
