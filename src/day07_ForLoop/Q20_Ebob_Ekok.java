package day07_ForLoop;

import java.util.Scanner;

public class Q20_Ebob_Ekok {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2 = scan.nextInt();

        int ekok = 0;
        int ebob = 0;

        if (sayi1 < sayi2) {                   // kucuk sayıyaya kadar sayıların ortak bolenleri eşittir.
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
        }else if(sayi1>sayi2){
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
        }
        System.out.println("Ebob = " + ebob);

        ekok=(sayi1*sayi2)/ebob;
        System.out.println("Ekok = " + ekok);
    }
}