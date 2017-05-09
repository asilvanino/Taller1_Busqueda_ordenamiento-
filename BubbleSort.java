package Ordenamientos;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
public class BubbleSort {

    public void BubbleSort() {

        int Arr[] = {0, 5, 7, 1};
        int Auxiliar;
        boolean rotacion = true;
        
        for (int x = 0; x < Arr.length; x++) {
            System.out.print(Arr[x] +",");
        }
        
        System.out.println("");

        while (0 < 1) {
           
            rotacion = true;
           
            for (int i = 1; i < Arr.length; i++) {
                if (Arr[i] < Arr[i - 1]) {
                    Auxiliar = Arr[i];
                    Arr[i] = Arr[i - 1];
                    Arr[i - 1] = Auxiliar;
                    rotacion = false;
                }
            }

            if (rotacion == true) {
                break;
            }
        }

        for (int j = 0; j < Arr.length; j++) {
            System.out.print(Arr[j] + ",");
        }
        
        System.out.println("");
    }
    
}
