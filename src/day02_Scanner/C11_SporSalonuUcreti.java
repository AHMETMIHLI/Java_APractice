package day02_Scanner;

import java.util.Scanner;

public class C11_SporSalonuUcreti {
     /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("***Spor salounumuza Hosgeldiniz*** ");

         System.out.print("Adınızı ve soyadınız giriniz:");
         String adSoyad=scan.nextLine();

         System.out.print("Yasinizi giriniz: ");
         int yas=scan.nextInt();

         System.out.print("Kilonuzu giriniz : ");
         double kilo=scan.nextDouble();

         System.out.print("Boyunuzu cm olarak giriniz :");
         double boy=scan.nextDouble();
         boy=boy/100;

         System.out.print("Salona devam edeceğiniz ayı giriniz");
         int ay =scan.nextInt();

         int aylıkUcret=20;

         int toplamUcret=ay*aylıkUcret;

         System.out.println("Toplam odemeniz gereken tutar : "+ toplamUcret+"$");


     }
}
