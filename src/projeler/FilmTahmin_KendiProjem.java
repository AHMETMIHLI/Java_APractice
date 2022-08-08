package projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin_KendiProjem {
    /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
 */
    static List<String> film = new ArrayList<>(Arrays.asList("BABA","JOKER","TİTANİC"));
    static int tahminSayisi=0;
    static int dogruTahmin=0;
    static boolean filmDogru=false;
    static String str=" ";
    static char harf=' ';
    static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {

       tahmin();

    }

    private static void tahmin() {


       while(!filmDogru){

           System.out.println("Tahmin ettiginiz film için harf giriniz: ");
           harf=scan.next().toLowerCase().charAt(0);
           str+=harf;

           for (int i = 0; i <film.get(i).length() ; i++) {


           }


        }
        System.out.println();
    }

}
