package day05_StringManipulation;

import java.util.Scanner;

public class Q09_StringinYarisiniYazdirma {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */


        Scanner scan= new Scanner(System.in);
        System.out.println("Kelime giriniz:");
        String kelime=scan.next();
        int uzunluk=kelime.length();
        String ilkKelime="";

        if(uzunluk%2==0){
           ilkKelime=kelime.substring(0,uzunluk/2);
            System.out.println(ilkKelime);

        }else System.out.println("Girilen kelime cift uzunlukta degildir ");

    }
}
