package Sorting_Algorithms.BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        //swap var mi yok mu? varsa diger iterasyona gececegim
        boolean swapped= false;//bi dongude bir swap olduysa donguyu tekra etmek lazim
        do {
            swapped=false;
            for (int i=1;i< arr.length;i++){
                //iki sayiyi karsilastirip, soldaki sagdakinden buyukse swap yap
                if (arr[i-1]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swapped=true;
                }
            }

        }while (swapped);

    }

}
