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
                System.out.println("Sayı giriniz ");
                int sayi=scan.nextInt();
            if (sayi >=5 && sayi<=10) {
               toplam+=0;
            }else {
                toplam+=sayi;
            }

        }
        System.out.println("toplam = " + toplam);



    }
}

