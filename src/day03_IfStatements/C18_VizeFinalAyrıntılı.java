package day03_IfStatements;

import java.util.Scanner;

public class C18_VizeFinalAyrıntılı {

        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.print("Vize sınav sonucunu girin: ");
            double vize=scan.nextDouble();
            System.out.print("Vize sınav sonucunu girin: ");
            double finall=scan.nextDouble();

            System.out.print("Vize sınav yuzdesini girin: ");
            double vizeYuzde=scan.nextDouble();
            System.out.print("Final sınav yuzdesini girin: ");
            double finalYuzde=scan.nextDouble();

            double ortamlama=(vize*vizeYuzde)+(finall*finalYuzde);
            System.out.println("Ortalamanız : "+ ortamlama);

            if(ortamlama>=90){
                System.out.println("Gecme notunuz AA");
            }else if(ortamlama>=80 && ortamlama<90){
                System.out.println("Gecme notunuz BA");
            }else if(ortamlama>=70 && ortamlama<80){
                System.out.println("Gecme notunuz BB");
            }else if(ortamlama>=60 && ortamlama<70){
                System.out.println("Gecme notunuz CB");
            }else if(ortamlama>=50 && ortamlama<60){
                System.out.println("Gecme notunuz CC");
            }else if(ortamlama>=40 && ortamlama<50){
                System.out.println("Gecme notunuz DC");
            }else if(ortamlama>=30 && ortamlama<40){
                System.out.println("Gecme notunuz DD");
            }else if(ortamlama<30){
                System.out.println("Gecme notunuz FF");
            }

        }

}
