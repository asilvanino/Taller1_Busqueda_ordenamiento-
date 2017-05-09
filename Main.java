
import Ordenamientos.*;
import Busquedas.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SIL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Bubble SORT");
        BubbleSort BS = new BubbleSort();
        BS.BubbleSort();
        System.out.println("");

        System.out.println("Insertion SORT");
        InsertionSort IS = new InsertionSort();
        IS.InsetionSort();
        System.out.println("");
        
        System.out.println("Merge Sort");
        System.out.println("");
        
        System.out.println("QUICKSORT");
        QuickSort QS = new QuickSort();
        int Array[] = {1, 5, 6, 3, 7, 8, 2, 5, 6, 2, 4, 8, 6, 9, 6, 6, 32, 5, 863, 485, 2, 4, 5, 6};
        for (int x = 0; x < Array.length; x++) {
            System.out.print(Array[x] + ",");
        }
        System.out.println("");
        QS.QuickSort(Array, 0, Array.length - 1);
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + ",");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("Busqueda Lineal");
        int Arr [] = {0,8,9,78,5,6,3,4,71,56,34,26,1,2,5,7,10,11,35};
        for (int z = 0; z < Arr.length; z++) {
            System.out.print(Arr[z] +",");
        }
        System.out.println("");
        Busqueda_Lineal BL = new Busqueda_Lineal();
        BL.BusquedaSecuancial(Arr);
       
        System.out.println("");
        System.out.println("Busqueda Binaria");
        BusquedaBinaria BB = new BusquedaBinaria();
        BB.BusquedaBinaria();
 
    }

}
