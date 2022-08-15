package day06_Method_Creation;

import java.util.Scanner;

public class Q01_KelimeDondur {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str = scan.next();

        String kelimeDondur = kelime(str);
        System.out.println(kelimeDondur);


    }

    private static String kelime(String str) {

        if (str.substring(0, 2).equals("gh")) {

        } else if (str.substring(0, 1).equalsIgnoreCase("g")) {
            str = str.substring(0, 1) + str.substring(2);

        } else if (str.substring(1, 2).equalsIgnoreCase("h")) {
            str = str.substring(1, 2) + str.substring(2);

        } else {
            str = str.substring(2);
        }

        return str;
    }
}

