package day03_IfStatements;

import java.util.Scanner;

public class Ter03_UcBasamakliSayi {
    /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
          o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
          Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Pozitif tam sayi giriniz: ");
        int sayi= scan.nextInt();

        String sonuc= (sayi>99 && sayi<1000) ? "3 Basamakli Sayi" : (sayi%2==0) ? "3 basamakli olmayan  cift  sayi"
                : "3 basamakli olmayan tek sayi";
        System.out.println(sonuc);
    }
}
