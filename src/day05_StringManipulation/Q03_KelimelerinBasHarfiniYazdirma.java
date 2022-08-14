package day05_StringManipulation;

import java.util.Scanner;

public class Q03_KelimelerinBasHarfiniYazdirma {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */


        Scanner scan= new Scanner(System.in);
        System.out.println("3 kelimeden olusan bir isim,soyisim giriniz : ");
        String isim=scan.nextLine();

        // 1.Cozum :

        String ilkHarf=isim.toUpperCase().substring(0,1); // ilk harfi aldı
        System.out.println(ilkHarf);
        String ikinciHarf=isim.toUpperCase().substring(isim.indexOf(" "));// ilk bosluktan sonraki 2 kelimeyi aldı  EMİN YILMAZ
        System.out.println(ikinciHarf);
        String ucuncuHarf=isim.toUpperCase().substring(isim.lastIndexOf(" ")); // 2 bosluktan sonraki kelimeyi aldı YILMAZ
        System.out.println(ucuncuHarf);

        ikinciHarf=ikinciHarf.trim().substring(0,1).toUpperCase();
        ucuncuHarf=ucuncuHarf.trim().substring(0,1).toUpperCase();
        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);


        // 2.Cozum Yolu:

        String [] arr=new String[3];
        arr=isim.split(" ");
        System.out.print(arr[0] = arr[0].toUpperCase().charAt(0) + ".");
        System.out.print(arr[1] = arr[1].toUpperCase().charAt(0) + ".");
        System.out.print(arr[0] = arr[2].toUpperCase().charAt(0) + ".");


        // 3.Cozum yolu :

        System.out.println();
        int ilkBosluk=isim.indexOf(" ");
        int ikinciBosluk=isim.lastIndexOf(" ");

        String son=isim.substring(0,1).toUpperCase()+"."+
                isim.substring(ilkBosluk+1,ilkBosluk+2).toUpperCase()+"."+
                isim.substring(ikinciBosluk+1,ikinciBosluk+2).toUpperCase()+".";
        System.out.println(son);

    }
}
