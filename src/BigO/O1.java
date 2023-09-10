package BigO;
//Array ne kadar buyuk olursa olsun, algortimanin calistirilma suresi hep sabit kalacaktir. orn: ilk elemani vaya son elemnai getiren algoritma
public class O1 { // O(1) -->    Constast Complexity eleman sayisindan bagimsiz. algoritmanin suresi sabit bir sure aliyorsa

    public static void main(String[] args) {
        int[] arr= {10, 2,5,34,56,4654,8947,326599, 623222154};
        //arrayin son elemanini ekrana yazdiralim.
        System.out.println(arr[arr.length-1]);


    }

}

