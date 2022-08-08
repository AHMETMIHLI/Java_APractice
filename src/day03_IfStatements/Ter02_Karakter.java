package day03_IfStatements;

import java.util.Scanner;

public class Ter02_Karakter {
     /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */
     public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.print("Bir karakter giriniz: ");
         char karakter=scan.next().charAt(0);

         String sonuc=(karakter>='a' && karakter<='z') ? "Kucuk harf" : (karakter>='A' && karakter<='Z') ?
                 "Buyuk Harf" : "Harf Degil";

         System.out.println(sonuc);


     }
}
