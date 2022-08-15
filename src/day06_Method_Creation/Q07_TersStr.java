package day06_Method_Creation;

public class Q07_TersStr {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
    public static void main(String[] args) {

        String str= "Java'yı Seviyorum.";
        String tersStr="";

        String []arr=str.split("");
        for (int i = arr.length-1; i >=0 ; i--) {
            tersStr+=arr[i];

        }
        System.out.println("Ters String: "+ tersStr);


    }


}
