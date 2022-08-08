package day03_IfStatements;

import java.util.Scanner;

public class C01_DortIslem {
    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup sonucu yazdiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplama icin-->1'e\nCikarma icin-->2'ye\nBolme için-->3'e\nCarpma icin-->4'de basiniz");
        int islem=scan.nextInt();
        double num1;
        double num2;

        if(islem>0 && islem<5){
            System.out.println("Lutfen iki tam sayı giriniz : ");
            num1=scan.nextDouble();
            num2=scan.nextDouble();
            if(islem==1){
                System.out.println("Toplama isleminin sonucu : "+ num1+"+"+ num2 +"="+ (num1+num2));
            }else if(islem==2){
                System.out.println("Çıkarma isleminin sonucu : "+ num1+"-"+ num2 +"="+ (num1-num2));
            }else if(islem==3){
                System.out.println("Bolme isleminin sonucu : "+ num1+"/"+ num2 +"="+ (num1/num2));
            }else if(islem==4){
                System.out.println("Carpma isleminin sonucu : "+ num1+"x"+ num2 +"="+ (num1*num2));
            }
        }else {
            System.out.println("Hatalı giris yaptınız");
        }




    }
}
