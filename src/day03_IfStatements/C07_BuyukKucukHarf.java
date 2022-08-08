package day03_IfStatements;

import java.util.Scanner;

public class C07_BuyukKucukHarf {
    /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir harf giriniz ");
        char harf=scan.next().charAt(0);

        if( harf>='a' && harf<='z'){
            System.out.println("kucuk harf");
        }else if(harf>='A' && harf<='Z'){
            System.out.println("buyuk harf");
        }else System.out.println("hatali giris yaptınız");

    }
}
