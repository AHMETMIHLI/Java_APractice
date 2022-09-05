package _09_Arrays;

public class Q04_IstenenDegerlerToplami {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int toplam=9;
        istenenDegereEsitOlanSayiCiftleri(arr,toplam);

    }

    public static void istenenDegereEsitOlanSayiCiftleri(int[] arr, int toplam) {



        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length;j++){
                if (arr[i]+arr[j] == toplam){
                System.out.println(arr[i]+"+"+arr[j]+"="+ toplam);
            }

            }
        }

    }

}




/*
 int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        istenenDegerlerinTopla(arr,istenenToplam);

    }

    private static int[] istenenDegerlerinTopla(int[] arr, int istenenToplam) {

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length;j++){

                if (arr[i]+arr[j] == istenenToplam){

                System.out.println("istenen degere esit olan sayi ciftler ="+arr[i]+" "+arr[j]);
            }

            }

        }


    return arr;
 */