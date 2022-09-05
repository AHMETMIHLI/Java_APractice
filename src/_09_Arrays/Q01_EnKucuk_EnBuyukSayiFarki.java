package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_EnKucuk_EnBuyukSayiFarki {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Array'in uzunlugunu giriniz :");
		int [] arr=new int [scan.nextInt()];

		for (int i = 0; i <arr.length ; i++) {
			System.out.println("Array'in elemanlarını giriniz");
			int num=scan.nextInt();
			arr[i]=num;
		}
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int enKucukSayi=arr[0];
		int enBuyukSayi=arr[arr.length-1];
		int fark=enBuyukSayi-enKucukSayi;
		System.out.println("fark = " + fark);




	}




}


/*

 2.Çözüm yolu Methodla

static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("lutfen bir array uzunlugu giriniz :");
		int [] sayi=new int[scan.nextInt()];

		arrayEkleyenVeDegerlendiren(sayi);

	}
	private static int arrayEkleyenVeDegerlendiren(int[] sayi) {


		for (int i = 0; i <sayi.length ; i++) {
			System.out.print("lutfen   "+(i+1)+" degeri giriniz :" );
			sayi[i]= scan.nextInt();
		}
		System.out.println("girdiginiz array = "+Arrays.toString(sayi));

		Arrays.sort(sayi);

		int enBuyukDeger=sayi[sayi.length-1];
		int enKucukDeger=sayi[0];

		int fark=enBuyukDeger-enKucukDeger;

		System.out.println("girdiginiz değerlerin en büyük ve en kucuk sayıların farkı ="+fark);


		return fark;
	}
 */