package day04_switchCase;

import java.util.Scanner;

public class Q01_GecmeNotu {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Notunuz \n 0(dahil) ile 50 arasi ise= 1\n 50(dahil) ile 60 arasi ise= 2" +
				"\n 60(dahil) ile 80 arasi ise= 3\n 80(dahil) ustu = 4 giriniz");
		int not=scan.nextInt();

		switch (not){
			case 1:
				System.out.println("Gecme notunuz D");
				break;
			case 2:
				System.out.println("Gecme notunuz C");
				break;
			case 3:
				System.out.println("Gecme notunuz B");
				break;
			case 4:
				System.out.println("Gecme notunuz A");
				break;
			default:
				System.out.println("Gecerli bir not girin");
		}

	}
}
