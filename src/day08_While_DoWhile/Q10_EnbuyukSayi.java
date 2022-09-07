package day08_While_DoWhile;

import java.util.Scanner;

public class Q10_EnbuyukSayi {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan= new Scanner(System.in);
        int count=0;
        int max=0;

        while(count<5){
            System.out.println("Sayi giriniz : ");
            int sayi=scan.nextInt();
            count++;
           if(sayi>max){
               max=sayi;

            }
        }
        System.out.println("max = " + max);


    }
}


