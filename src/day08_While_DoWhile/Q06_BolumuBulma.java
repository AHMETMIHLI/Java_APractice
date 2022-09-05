package day08_While_DoWhile;

import java.util.Scanner;

public class Q06_BolumuBulma {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bolunen sayıyı giriniz:");
		int bolunen=scan.nextInt();
		System.out.println("Bölen sayıyı giriniz:");
		int bolen=scan.nextInt();

		int bolum=0;

		while(bolunen>=bolen){
		    bolunen-=bolen;
			bolum++;

		}System.out.println("Bolum = " + bolum);


	}

}


