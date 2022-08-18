package day08_While_DoWhile;

import java.util.Scanner;

public class Q03_SayininKupu {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8
       */

        Scanner scan= new Scanner(System.in);
        System.out.println("Taban Sayiyi giriniz: ");
        int tabanSayi=scan.nextInt();
        System.out.println("Us sayiyi giriniz: ");
        int usSayi=scan.nextInt();

        int sonuc= (int) Math.pow(tabanSayi,usSayi);
        System.out.println("Girilen sayinin küpü : "+sonuc);




    }


}
