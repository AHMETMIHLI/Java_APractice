package day03_IfStatements;

import java.util.Scanner;

public class C05_KanBagisi {
    public static void main(String[] args) {
        /*
        TASK :
        kullanicidan yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilodan hafif ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Yasinizi girin:");
        int yas=scan.nextInt();
        System.out.print("Kilonuzu giriniz: ");
        double kilo=scan.nextDouble();

        if(yas>0 && yas<18){
            System.out.println("Sartlanız uygun degil kan bagisi yapamazsınız");
        }else if(yas>=18){
            if(kilo>0 && kilo<50){
                System.out.println("Yasiniz uygun ancak kilonuz kan bagisi yapmaya uygun degil");
            }else if(kilo>=50) {
                System.out.println("Sartlanız uygun kan bagisi yapabilirsiniz ");
            }else System.out.println("Kilonuzu hatali yazdiniz");
        }else System.out.println("Hatali veri girdiniz");
    }
}
