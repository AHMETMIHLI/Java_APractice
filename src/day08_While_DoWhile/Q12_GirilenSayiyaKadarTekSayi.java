package day08_While_DoWhile;

import java.util.Scanner;

public class Q12_GirilenSayiyaKadarTekSayi {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi= scan.nextInt();

        int i=1;
        while(i<=sayi){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }


    }
}
