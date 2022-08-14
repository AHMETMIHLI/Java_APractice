package day02_Scanner;

import java.util.Scanner;

public class C07_VucutKıtleEndexi {
    /*
    	/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Kilonuzu girin: ");
        double kilo=scan.nextDouble();
        System.out.print("Boyunuzu cm cinsinden giriniz: ");
        double boy=scan.nextDouble()/100;

        double vkm=kilo/(boy*boy);

        System.out.println("Vucut kitle endeksiniz : "+ vkm);


    }

}
