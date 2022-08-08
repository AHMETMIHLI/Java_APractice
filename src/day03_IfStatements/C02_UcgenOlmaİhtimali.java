package day03_IfStatements;

import java.util.Scanner;

public class C02_UcgenOlmaİhtimali {
    /*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
	     herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen

	 */
    public static void main(String[] args) {

        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("3 tane pozitif sayi giriniz");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if( a+b>c && c>a-b){
            System.out.println("Ucgen olabiliyor");
            if(a==b && b==c){
                System.out.println("Es Kenar ucgendir");
            }else System.out.println("Es Kenar ucgen degildir");
        }if( a+c>b && b>a-c){
            System.out.println("Ucgen olabiliyor");
            if(a==b && b==c){
                System.out.println("Es Kenar ucgendir");
            }else System.out.println("Es Kenar ucgen degildir");
        }if( b+c>a && a>b-c){
            System.out.println("Ucgen olabiliyor");
            if(a==b && b==c){
                System.out.println("Es Kenar ucgendir");
            }else System.out.println("Es Kenar ucgen degildir");
        }else System.out.println("Girdiginiz degerlele ucgen olusamaz");


    }
}
