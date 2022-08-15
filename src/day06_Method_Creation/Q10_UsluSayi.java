package day06_Method_Creation;

import java.util.Scanner;



public class Q10_UsluSayi {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi Giriniz:");
        int sayi = scan.nextInt();

        sayininKuvveti(sayi);
        System.out.println(sayininKuvveti(sayi));

    }

    private static boolean sayininKuvveti(int sayi) {
        boolean sayininUssu = false;
        int carpim = 1;

        for (int i = 1; i < sayi; i++) {
            carpim *= 3;
            if (carpim == sayi) {
                sayininUssu = true;
                break;
            }
        }


        return sayininUssu;
    }
}