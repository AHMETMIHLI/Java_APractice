package day03_IfStatements;

import java.util.Scanner;

public class C10_TrafikCezasi {
    public static void main(String[] args) {
        /*
        TASK :
        Kullanicidan aracin hızını alınız.
        Trafik cezasının degerini hesaplayin.
        54 hız sınırıdır
        eger hızınız 55-74 arasında ise :
        Ceza : 100 $'dir

        Eger hızınız 75-84 arasında ise:
        Ceza : 150 $'dır

        Eger hızınız 85-94 arasında ise:
        Ceza : 320 $'dır

        Eger hızınız94'den fazla ise:
        Ceza : 500 $'dır.

        ve ayrıca ,
        Eger surucunun ehliyeti yoksa cezaya 200 $ eklenir.

        Ornek : Hızınız 77 ike cezanız 150 $'dır ama ehliyetiniz yoksa 350 $ dır.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Ehliyetiniz var ise 1 yoksa 0 yaziniz :");
        int ehliyet=scan.nextInt();
        int hiz;

        if(ehliyet==0 || ehliyet==1) {
            if(ehliyet==0){
                System.out.println("Hızınızı sormadan 200 $ cezanız oldu bile ");
            }
            System.out.println("Aracın hızını giriniz: ");
            hiz = scan.nextInt();

            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("negatif hız olmaz hatali veri giriniz ");
                } else if (hiz >= 55 && hiz <= 74) {
                    System.out.println("Cezanız 100 $'dır");
                } else if (hiz >= 75 && hiz <= 84) {
                    System.out.println("Cezanız 150 $'dır");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("Cezanız 320 $'dır");
                } else if (hiz >= 95) {
                    System.out.println("Cezanız 500 $'dır");
                } else System.out.println("Hız sınırında seyehat ediyorsunuz hayirli yolculuklar");

            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("negatif hız olmaz hatali veri giriniz ");
                } else if (hiz >= 55 && hiz <= 74) {
                    System.out.println("Cezanız 300 $'dır");
                } else if (hiz >= 75 && hiz <= 84) {
                    System.out.println("Cezanız  350$'dır");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("Cezanız 520 $'dır");
                } else if (hiz >= 95) {
                    System.out.println("Cezanız 700 $'dır");
                } else
                    System.out.println("Hız sınırında seyehat ediyorsunuz  ancak ehliyetsiz oldugunuz icin cezaniz 200 $'dır");

            } else System.out.println("Lutfen gecerli bir deger giriniz");
        }else System.out.println("Ehliyetiniz var mı yok mu?");
    }
}
