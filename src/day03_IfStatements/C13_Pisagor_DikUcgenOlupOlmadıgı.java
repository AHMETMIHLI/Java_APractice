package day03_IfStatements;

import java.util.Scanner;

public class C13_Pisagor_DikUcgenOlupOlmadıgı {

     /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.print("Birinci kenarı giriniz :");
         int sayi1=scan.nextInt();
         System.out.print("İkinci kenarı giriniz :");
         int sayi2=scan.nextInt();
         System.out.print("Ucuncu kenarı giriniz :");
         int sayi3=scan.nextInt();

         if((sayi1*sayi1)+(sayi2*sayi2)==sayi3*sayi3){
             System.out.println("Bu bir dik ucgendir");
         }else System.out.println("Bu bir  dik ucgen degildir");

     }
}
