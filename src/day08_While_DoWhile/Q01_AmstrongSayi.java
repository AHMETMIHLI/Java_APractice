package day08_While_DoWhile;

import java.util.Scanner;

public class Q01_AmstrongSayi {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi= scan.nextInt();
        int basamakSayisi=0;
        int tempNumber=sayi;
        int basamakDegeri;
        int sonuc=0;
        int basamakUssu;

        while(tempNumber!=0) {
            tempNumber/=10;
            basamakSayisi++;
        }
        tempNumber=sayi;
        while (tempNumber!=0) {
            basamakDegeri=tempNumber%10;
            tempNumber/=10;
            basamakUssu=1;
            for (int i = 1; i <=basamakSayisi ; i++) {
                basamakUssu*=basamakDegeri;
            }
            sonuc+=basamakUssu;

        }

        if(sayi==sonuc) {
            System.out.println(sayi+" sayisi Armstrong bir sayidir");
        } else {
            System.out.println(sayi+" sayisi Armstrong bir sayi degildir");
        }




        /*
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi= scan.nextInt();

        armstrongSayiMethod(sayi);
    }

    public static void armstrongSayiMethod(int sayi) {
        int kuplerinToplami=0;
        int basamak;
        int temp=sayi;

        while (temp>0){
            basamak=temp%10;
            kuplerinToplami+=Math.pow(basamak,3);
            temp/=10;

        }
        if(sayi==kuplerinToplami){
            System.out.println(sayi+ " Amstrong sayidir");
        }else System.out.println(sayi+ " Amstrong sayi değildir");

         */

    }



}
