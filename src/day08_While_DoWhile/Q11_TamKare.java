package day08_While_DoWhile;

import java.util.Scanner;

public class Q11_TamKare {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz : ");
        int sayi = scan.nextInt();

        boolean kareMi=false;
        int karekok=0;

        while(!kareMi){
            karekok= (int) Math.sqrt(sayi);
            if(karekok*karekok==sayi){
                kareMi=true;
                System.out.println("Bu sayı tam kare çünkü : "+( karekok+ "*"+karekok + "="+ sayi) +" "+ kareMi);

            }else  System.out.println("Bu sayı tam kare değil: "+ sayi +" "+ kareMi);
            break;
        }



    }
}
