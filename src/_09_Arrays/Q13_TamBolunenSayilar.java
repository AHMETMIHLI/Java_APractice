package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_TamBolunenSayilar {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
       Scanner scan= new Scanner(System.in);
       int [] arr= new int[8];

       int i=0;
       while (i<8){
           System.out.println("Sayi giriniz : ");
           arr[i]=scan.nextInt();
           i++;
       }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]%3==0){
                System.out.print(arr[j]+" ");
            }

        }


    }

}





/* 2.çözüm yolu
 Scanner scan=new Scanner(System.in);

        int arr[]=new int[8];
        int sayac=0;

        for (int i=0; i<arr.length;i++){
            System.out.print((i+1)+". elemanı giriniz  :");
            arr[i]=scan.nextInt();

            if (arr[i]%3==0){

               sayac++;

            }


        }
        System.out.println("3 e bolune bilen sayıların adedi :"+sayac);

 */