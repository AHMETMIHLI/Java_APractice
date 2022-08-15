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
    static int filmTahminSayisi;
    static int kalanTahminSayisi;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> filmler = new ArrayList<>(Arrays.asList("BABA", "JOKER", "DEJAVU", "TITANIC"));
        filmTahmin(filmler);
    }

    public static void filmTahmin(List<String> filmler) {
        char harf;
        int secim;
        do {
            System.out.println("Secmek istediginiz film icin bir numara giriniz. (1-" + filmler.size() + ")");
            secim = scan.nextInt();
        } while (!(secim >= 1 && secim <= filmler.size()));

        List<String> filmAdiList = new ArrayList<>();
        String filmAdi = filmler.get(secim - 1);
        int filmUzunluk = filmler.get(secim - 1).length();

        for (int i = 0; i < filmler.get(secim - 1).length(); i++) {
            filmAdiList.add("*");
        }
        filmTahminSayisi = filmler.get(secim - 1).length() * 2;
        System.out.println("Aranan film : " + filmAdiList);

        do {
            System.out.print("Tahmin icin bir karakter giriniz : ");
            harf = scan.next().toUpperCase().charAt(0);
            for (int i = 0; i < filmUzunluk; i++) {
                if (harf == filmAdi.charAt(i)) {
                    filmAdiList.set(i, String.valueOf(harf));
                }
            }
            filmTahminSayisi--;

            int say = 0;
            for (int i = 0; i < filmUzunluk; i++) {
                if (!filmAdiList.get(i).equals("*")) {
                    say++;
                }
            }
            System.out.println("Aranan film : " + filmAdiList);
            System.out.println("Kalan tahmin hakkiniz : " + filmTahminSayisi);
            if (say == filmUzunluk) break;
        } while (filmTahminSayisi != 0);
    }
}
