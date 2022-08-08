package projeler;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UcusRun {

    public static void main(String[] args) {
   /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
    Uçuş Projesi;
    1- Constructor kullanarak yolcu üretiyoruz, yolcu bilgilerini scanner ile değil,
    constructor'dan gelen encapsulated bilgilerle elde ediyoruz,
            2- method class'ından ucus() methodunu çağırıp,  içerisinde kullanacğımız değerleri getter method ile ekliyoruz.
            3- bilet yazdırmadan hemen önce, indirimden faydalanmışsan onu belirten bir dinamik sout gönderiyor.
    faydalanmamışsan indirimsiz yolcu + ödenecek tutar yazdırıyor
    4- bilet yazdırırken Flight No ve Gate Number dinamik olarak oluşturulmuştur.
    flight no oluşturma şekli: bulduğumuz seneyi alıyor2022 + bulunduumuz saati alıyor concat edip yazdırıyor .
    Gate number oluşturma şekli:  gidilecek şehir ismi + mathrandom(10)

     */

       YolcuBilgileri yb = new YolcuBilgileri("B","Tek",30);
        List<String> yolcu=new ArrayList<>();


       ucus(yb.getYas(),yb.getYolculukTipi(),yb.getRota());

        }

    public static void ucus(int yas, String yolculukTipi, String rota) {

        double yolculukBUcreti=500*0.10;
        double yolculukCUcreti=700*0.10;
        double yolculukDUcreti=900*0.10;

        Scanner scan=new Scanner(System.in);
        System.out.println("*****Java Airlans'a hosgeldiniz****");
        System.out.println("Gideceginiz yonu seciniz:\nB C D Rotasından birini seciniz");
        rota=scan.next().toUpperCase();
        System.out.println("Yolculuk Tipinizi giriniz :\nTek yada Cift seklinde ");
        yolculukTipi=scan.next();
        System.out.println("Yasinizi giriniz : ");
        yas=scan.nextInt();

        if (yolculukTipi.equalsIgnoreCase("Tek")){
            if(rota.equals("B")) {
                if (yas>0 && yas <=12) {
                    double tekYonindirimliFiyat = yolculukBUcreti * 0.50;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+  " $");
                } else if (yas <= 24) {
                    double tekYonindirimliFiyat = yolculukBUcreti * 0.90;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+  " $");
                } else if(yas>24 && yas <65){
                    double tekYonFiyat=yolculukBUcreti;
                    System.out.println("Odemeniz gereken Tutar:"+ tekYonFiyat+ " $");
                } else if (yas >= 65) {
                    double tekYonindirimliFiyat = yolculukBUcreti * 0.70;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+  " $");
                }
            }else if(rota.equals("C")) {
                if (yas>0 && yas <=12) {
                    double tekYonindirimliFiyat = yolculukCUcreti * 0.50;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+  " $");
                }else if (yas <= 24) {
                    double tekYonindirimliFiyat = yolculukCUcreti * 0.90;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+  " $");
                }else if(yas>24 && yas <65) {
                    double tekYonFiyat = yolculukCUcreti;
                    System.out.println("Odemeniz gereken Tutar:" + tekYonFiyat + " $");
                } else if (yas >= 65) {
                    double tekYonindirimliFiyat = yolculukCUcreti * 0.70;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+ " $");
                }
            }else if(rota.equals("D")) {
                if (yas > 0 && yas <= 12) {
                    double tekYonindirimliFiyat = yolculukDUcreti * 0.50;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat + " $");
                }else if (yas <= 24) {
                    double tekYonindirimliFiyat = yolculukDUcreti * 0.90;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+ " $");
                }else if(yas>12 && yas <65){
                    double tekYonFiyat=yolculukDUcreti;
                    System.out.println("Odemeniz gereken Tutar:"+ tekYonFiyat+ " $");
                } else if (yas >= 65) {
                    double tekYonindirimliFiyat = yolculukDUcreti * 0.70;
                    System.out.println("Odemeniz gereken tutar: " + tekYonindirimliFiyat+ " $");
                }
            }else System.out.println("Gecerli bir rota giriniz");

        }else if (yolculukTipi.equalsIgnoreCase("Cift")) {
            if(rota.equals("B")) {
                if (yas>0 && yas <=12) {
                    double toplamFiyat = (yolculukBUcreti * 0.50*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat+ " $");
                }else if (yas <=24) {
                    double gidisDonusIndirimFiyati = (yolculukBUcreti * 0.90*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }else if(yas>24 && yas<65){
                    double toplamFiyat = (yolculukBUcreti * 0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat+ " $");
                } else if (yas >= 65) {
                    double gidisDonusIndirimFiyati = (yolculukBUcreti * 0.70*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }
            }else if(rota.equals("C")) {
                if (yas>0 && yas <=12) {
                    double toplamFiyat = (yolculukCUcreti * 0.50*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat+ " $");
                } else if (yas <=24) {
                    double gidisDonusIndirimFiyati = (yolculukCUcreti * 0.90*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }else if(yas>24 && yas<65) {
                    double toplamFiyat = (yolculukCUcreti * 0.80) * 2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat + " $");
                }else if (yas >= 65) {
                    double gidisDonusIndirimFiyati = (yolculukCUcreti * 0.70*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }
            }else if(rota.equals("D")) {
                if (yas>0 && yas <=12) {
                    double toplamFiyat = (yolculukDUcreti * 0.50*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat+ " $");
                } else if (yas <=24) {
                    double gidisDonusIndirimFiyati = (yolculukDUcreti * 0.90*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }else if(yas>24 && yas<65) {
                    double toplamFiyat = (yolculukDUcreti * 0.80) * 2;
                    System.out.println("Odemeniz gereken tutar: " + toplamFiyat + " $");
                }else if (yas >= 65) {
                    double gidisDonusIndirimFiyati = (yolculukDUcreti * 0.70*0.80)*2;
                    System.out.println("Odemeniz gereken tutar: " + gidisDonusIndirimFiyati+ " $");
                }

        }else System.out.println("Gideceginiz yonden emin olunuz");


    }else System.out.println("Gecerli bir veri giriniz");
}
}