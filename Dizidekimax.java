import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner girilensayi = new Scanner(System.in);

       int[] numbers = {15,12,788,1,-1,-778,2,0};
       int min = numbers[0];
       int max = numbers[0];

       System.out.println("Bir sayı giriniz :");
       int number= girilensayi.nextInt();

       Arrays.sort(numbers);
       for (int i:numbers){
           if (i < number){
               min = i;
           }
           if (i > number){
               max = i;
               break;
           }
       }
        System.out.println("Girilen sayıdan küçük en yakın sayı  :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı  :" + max);


    }
}