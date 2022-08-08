package day03_IfStatements;

import java.util.Scanner;

public class C04_QA_Dev_BA_PM {
    /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("IT Unvaninizi giriniz:");
        String unvan=scan.next();

        if(unvan.equalsIgnoreCase("qa")){
            System.out.println("Unvanınız : Quality Analyst");
        }else if(unvan.equalsIgnoreCase("dev")){
            System.out.println("Unvanınız : Developer");
        }else if(unvan.equalsIgnoreCase("ba")){
            System.out.println("Unvanınız :Busines Analyst ");
        }else if(unvan.equalsIgnoreCase("pm")){
            System.out.println("Unvanınız :Project Manager");
        }else System.out.println("Lutfen gecerli bir IT unvanI giriniz");


    }
}
