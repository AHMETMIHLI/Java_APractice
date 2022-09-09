package _09_Arrays;

import java.util.Arrays;

public class Q02_MDElemanlarıToplama {

    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */
       int [][] arr={{10,20,30},{4},{6,7,20},{4,9}};

       int [] yeniArr=new int[arr.length];
       int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
            yeniArr[i]=toplam;
            toplam=0;
        }
        System.out.println("Yeni Array :"+ Arrays.toString(yeniArr));


        // Lambda ile çözüm
        int toplam1=Arrays.stream(arr[0]).sum();
        int toplam2=Arrays.stream(arr[1]).sum();
        int toplam3=Arrays.stream(arr[2]).sum();

        int [] arr3=new int[3];
        arr3[0]=toplam1;
        arr3[1]=toplam2;
        arr3[2]=toplam3;
        System.out.println(Arrays.toString(arr3));




    }
}




/* 2.çözüm yolu methodla
 int [][] arr={{10,20,30},{4},{6,7,20}};

       İcArrayleriTopla(arr);


    }

    private static int[] İcArrayleriTopla(int[][] arr) {
        int toplam=0;
int [] yeniarr=new int[arr.length];

      for (int i = 0; i <arr.length ; i++) {
            for (int j = 0;j<arr[i].length;j++){
                toplam+=arr[i][j];

            }
            yeniarr[i]=toplam;
            toplam=0;
        }
        System.out.println("yeni arrays = "+Arrays.toString(yeniarr));

        return yeniarr;
 */