package day05_StringManipulation;

import java.util.Scanner;

public class Q10_Regex {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

    Scanner scan= new Scanner(System.in);
        System.out.print("Adinizi girin : ");
        String ad=scan.next().toUpperCase();
        System.out.print("Soyadinizi girin : ");
        String soyAd=scan.next().toUpperCase();
        System.out.print("Kart no girin : ");
        String kartNo=scan.next();
        int uzunluk=kartNo.length();

        ad=ad.charAt(0)+ad.substring(1).replaceAll("\\w","*");
        soyAd=soyAd.charAt(0)+soyAd.substring(1).replaceAll("\\w","*");
        kartNo=kartNo.substring(0,13).replaceAll("\\d","*")+kartNo.substring(12);

        if(uzunluk==16){
            System.out.println("Ad :" + ad);
            System.out.println("Soyad :" + soyAd);
            System.out.println("Kart No :" + kartNo);
        }else  System.out.println("Gecerli kart not giriniz");



    }
}
