package day02_Scanner;

import java.util.Scanner;

public class C09_Problem {
     /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
     public static void main(String[] args) {

         double a,b,c;
         Scanner scan= new Scanner(System.in);
         System.out.print("a sayisini giriniz: ");
         a=scan.nextDouble();
         System.out.print("b sayisini giriniz: ");
         b=scan.nextDouble();
         System.out.print("c sayisini giriniz: ");
         c=scan.nextDouble();

        double sonuc=(((a*a)-(b*b))/(c*3));
         System.out.println("Sonuc: "+ sonuc);

     }
}
