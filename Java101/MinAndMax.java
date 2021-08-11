/**
 *
 * @author Guray Kaleli,2021
 *
 * @return find max and min
 *
 * */
import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter : ");
        int size = scanner.nextInt();
        int max=0,min=0;
        int[] numbers = new int[size];

        for (int i = 0; i <= numbers.length-1; i++){
            numbers[i] = scanner.nextInt();
            System.out.println("sayı: " + numbers[i]);
        }

        for (int i = 0; i <= numbers.length-1; i++){
            for (int j=1; j < numbers.length; j++){
                if (numbers[i] <  numbers[j]){
                    max = numbers[j];
                }
            }
            for (int j=numbers.length-1; j >= 0; j--){
                if (numbers[i] > numbers[j]){
                    min = numbers[j];
                }
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }

}






















