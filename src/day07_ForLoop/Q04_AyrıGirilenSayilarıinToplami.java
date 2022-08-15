package day07_ForLoop;

import java.util.Scanner;

public class Q04_AyrıGirilenSayilarıinToplami {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i < 6; i++) {
            if (i == 1) {
                System.out.println( "Sayi 1:");
                int sayi1 = scan.nextInt();
                if (sayi1 < 5 || sayi1 > 10) {
                    toplam += sayi1;
                }
            } else if (i == 2) {
                System.out.println( "Sayi 2:");
                int sayi2 = scan.nextInt();
                if (sayi2 < 5 || sayi2 > 10) {
                    toplam += sayi2;
                }
            } else if (i == 3) {
                System.out.println( "Sayi 3:");
                int sayi3 = scan.nextInt();
                if (sayi3 < 5 || sayi3 > 10) {
                    toplam += sayi3;
                }
            } else if (i == 4) {
                System.out.println( "Sayi 4:");
                int sayi4 = scan.nextInt();
                if (sayi4 < 5 || sayi4 > 10) {
                    toplam += sayi4;
                }
            } else if (i == 5) {
                System.out.println( "Sayi 5:");
                int sayi5 = scan.nextInt();
                if (sayi5 < 5 || sayi5 > 10) {
                    toplam += sayi5;
                }
            }

        }
        System.out.println("Sayiların toplami : "+ toplam);
    }
}