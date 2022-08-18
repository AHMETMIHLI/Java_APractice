package day07_ForLoop;

import java.util.Scanner;

public class Q10_SesliHarf {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Harf giriniz");
        String harf = scan.next();
        String sesliHarf = "aeıou";

        if (harf.length() == 1) {
            if (sesliHarf.contains(harf) ) {
                System.out.println(harf + " Sesli harftir");
            } else if (harf.charAt(0) >= 'A' && harf.charAt(0) <= 'Z') {
                System.out.println("Girdiginiz Harf buyuk harftir");
            } else if (!sesliHarf.contains(harf) && harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z') {
                System.out.println("Girdiğiniz harf sessiz harftir");
            } else System.out.println("Girdiğiniz karakter harf değildir");

        } else System.out.println("Harf için tek karakter girmeniz gerekmektedir ");


    }
}

 /*
   Scanner scan=new Scanner(System.in);
        System.out.print("lutfen br harf giriniz :");
        String harf=scan.nextLine();
        String sesliHarfler="aeiou";

       if(harf.length()==1){

            if(sesliHarfler.contains(harf)){

                System.out.println("girdiginiz harf sesli harftir");

            }else if(harf.charAt(0)>='A'&& harf.charAt(0)<='Z'){

                System.out.println("girdiginiz harf buyuk harftir");

            }else if(sesliHarfler!=harf){

                System.out.println("girdiginiz harf sessiz harftir");

            }else System.out.println("Yanlis karakter girdiniz!");


        }else  System.out.println("girdiginiz değer 1 karekterden fazla");


 */