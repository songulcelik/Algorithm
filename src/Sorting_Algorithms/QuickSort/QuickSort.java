package Sorting_Algorithms.QuickSort;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    //yardimci method, pivot degerini bulup alttakine gonderecek
    public static int partition(int[] dizi, int alt, int ust ){

        //pivotun yerinin belirlenmesi. dizinin son elemani olsun
        int pivot=dizi[ust];//neden length-1 demedik. arrayi parcaladigimiz icin yeni bir array yok bu nednele son elemani yok
        int i =(alt-1);

        //fordaki amac alt ve ust arasindaki elemanlari pivot ile karsilasitrip kucuk olanlar sola.
        for (int j=alt;j<ust;j++){
            if (dizi[j]<=pivot){
                i++;
                int temp=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=temp;

            }
        }

        //pivot elemaninin dizideki dogru konumu icin
        int temp= dizi[i+1];
        dizi[i+1]=dizi[ust];
        dizi[ust]=temp;
        return i+1;
    }

    //ana method
    public static void quickSort(int[] dizi, int alt, int ust){
        if (alt<ust){
            int pi= partition(dizi,alt,ust);
            quickSort(dizi, alt, pi-1);//pivotun sol tarafi icin calisir
            quickSort(dizi,pi+1,ust);//pivotun sag tarafi icin calisir
        }



    }


}
