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
public class Busqueda_Lineal {

    public int BusquedaSecuancial(int Array[]) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Ingrese el numero que desea buscar: ");
        int x = Sc.nextInt();
        int posicion = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == x) {
                posicion = i;
                System.out.println("El numero " + x + " esta en el arreglo y se encuntra en la posicion " + posicion);
                break;
            }
        }
        return posicion;
    }

}
