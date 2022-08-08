package projeler;

import java.util.Scanner;

public class Banka_KendiProjem {
    /*
        Kullanicidan giris icin kart numarasi ve sifresini isteyin, eger birini yanlis girerse tekrar isteyin
        Kart numarasi aralarda bosluk ile girerse ve eger dogruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin

        Bakiye sorgula,para yatirma,para cekme,para gonderme,sifre degistirme ve cikis

        Para cekme ve para gonderme islemine mevcut bakiyeden buyuk para cekilemez.
        Para gonderme iselminde iban TR ile baslamali ve toplam 26 karakteri olmali, eger degilse menu ekranina geri donun
        Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali.

*/
    static double bakiye = 1000;
    static String kartNo = "12345678";
    static String sifre = "ab1234";

    static String input = "";
    static String pasword = "";
    static Scanner scan = new Scanner(System.in);
    // iban no : TR123456789123456789123456

    public static void main(String[] args) {

        System.out.println("********* BANKAMIZA HOŞGELDİNİZ*********");


        do {
            System.out.println("Kart numarasını giriniz : ");
            input = scan.nextLine().replaceAll(" ", "");
            System.out.println("Sifrenizi giriniz :");
            pasword = scan.nextLine();
            if (!input.equals(kartNo) && !pasword.equals(sifre) || input.replace(" ", "").length() != kartNo.length()) {
                System.out.println("Tekrar deneyin");

            }


        } while (!pasword.equals(sifre) || input.replace(" ", "").length() != kartNo.length());
        AnaMenu();

    }

            public static void AnaMenu (){

                System.out.println("İslem yapmak istediğiniz Menuyu Seçiniz: \nBakiye Sorgulama icin: 1\nPara yatirma icin: 2\nPara Cekmek icin:3\n" +
                        "Para gondermek icin: 4\nSifre Degistirmek icin: 5\nCıkıs icin: 6");
                int islem = scan.nextInt();

                switch (islem) {
                    case 1:
                        bakiyeSorgula();
                        break;
                    case 2:
                        paraYatirma();
                        break;
                    case 3:
                        paraCekme();
                        break;
                    case 4:
                        paraGonderme();
                        break;
                    case 5:
                        sifreDegistirme();
                        break;
                    case 6:
                        cikis();
                        break;
                    default:
                        System.out.println("Gecerli bir secenek seciniz");
                }

            }

            public static void cikis () {
                System.out.println("İslemlerinizi gerçeklestiriniz yine bekleriz");
            }

            private static void sifreDegistirme () {
                System.out.println("Eski sifrenizi giriniz:");
                sifre=scan.nextLine();
                System.out.println("yeni sifrenizi giriniz: ");
                String yeniPasword=scan.nextLine();
                if(!yeniPasword.equals(sifre)){
                    sifre=yeniPasword;
                    System.out.println("Sfireniz basari ile degistirildi");
                    AnaMenu();
                }


            }

            public static void paraGonderme ( ){
                System.out.println("Para gondermek istediginiz ibanı giriniz: ");
                String ibanNo = scan.next();
                if (!ibanNo.startsWith("TR") || ibanNo.length() != 26) {
                    System.out.println("Girdiginiz iban hatalıdır");
                    AnaMenu();
                } else {
                    System.out.println("Para gondermek istediginiz tutatarı giriniz:");
                    double tutar = scan.nextDouble();
                    if (bakiye >= tutar) {
                        bakiye = bakiye - tutar;
                        System.out.println("Para havale sonrası kalan bakiyeniz " + bakiye);
                    } else
                        System.out.println("Bakiyenizden fazla para gonderemezsiniz, islem menusunden yeniden giris yapınız");
                    AnaMenu();

                }
            }

            private static void paraCekme (){
                System.out.println("cekilecek parayı giriniz : ");
                double cekilecekPara = scan.nextDouble();
                bakiye = bakiye - cekilecekPara;
                System.out.println("Para cekme sonrası kalan bakiye : " + bakiye);
                AnaMenu();

            }

            private static void paraYatirma (){

                System.out.println("Yatırılacak parayı giriniz : ");
                double yatanPara = scan.nextDouble();
                bakiye = bakiye + yatanPara;
                System.out.println("Para yatirdıktan sonra bakiyeniz: " + bakiye);
                AnaMenu();

            }

            private static void bakiyeSorgula (){

                System.out.println("Bakiyeniz:" + bakiye);
                AnaMenu();

            }

        }

