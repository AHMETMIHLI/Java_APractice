package day04_switchCase;

import java.util.Scanner;

public class Q03_GunSayisi {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan= new Scanner(System.in);
        System.out.println("Hangi ayı ogrenmek istiyorsunuz");
        int ay=scan.nextInt();

            switch (ay){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Girdiginiz ayda 31 gun vardır");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Girdiginiz ayda 30 gun vardır");
                    break;

                case 2:
                    System.out.println("lutfen bulundugunuz yılı giriniz");
                    int  year=scan.nextInt();
                    if (year%4==0){
                        System.out.println("girdiğiniz ayda 29 gun vardır");
                    }else {
                        System.out.println("girdiğiniz ayda 28 gun vardır");
                    }
                    break;

                default:
                    System.out.println("Yanlıs giris yaptınız");

            }



    }
}
