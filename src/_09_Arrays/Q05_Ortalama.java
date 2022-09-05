package _09_Arrays;

public class Q05_Ortalama {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         *
         * Output : 4
         */

       int input[]= {1,2,3,4,5,6,7} ;
       int ortalama=0;
       int toplam=0;

        for (int i = 0; i < input.length; i++) {
            toplam+=input[i];
            }

        ortalama+=toplam/ input.length;
        System.out.println("Ortalama: "+ ortalama);

        for (int i = 0; i < input.length ; i++) {
            if(input[i]>ortalama){
                System.out.println("Ortalamadan büyük olan elemanlar : "+ input[i]);

        }
        }




    }

}
