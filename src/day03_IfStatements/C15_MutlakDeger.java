package day03_IfStatements;

import java.util.Scanner;

public class C15_MutlakDeger {
    /*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi girin : ");
        int sayi =scan.nextInt();

        int mutlakDeger=Math.abs(sayi);
        System.out.println("Sayinin mutlak degeri : "+ mutlakDeger);
    }

}
