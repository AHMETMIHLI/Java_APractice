package day04_switchCase;

import java.util.Scanner;

public class Q04_KacınGun {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi:1\nSali:2\nCarsamba:3\nPersembe:4\nCuma:5\nCumartesi:6\nPazar:7\n" +
                "Haftanın kacıncı gununde oldugunuzu giriniz");
        int kacınGun = scan.nextInt();

        if (kacınGun <= 0 || kacınGun > 12) {
            System.out.println("Hatalı veri girdiniz");
        } else {
            System.out.println("Kac gun sonrasını ogrenmek istiyorsunuz: ");
            int kacGunSonrasi = scan.nextInt();
            int bulunanGun = (kacınGun + kacGunSonrasi) % 7;

            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("Haftada 7 gun vardır hatalı veri girdiniz  ");

            }

        }


    }
}

