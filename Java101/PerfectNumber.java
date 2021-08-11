/**
 *
 * @author Guray Kaleli,2021
 *
 * @return find out if your number is perfect or not
 *
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        List<Integer> postiveNumbers = new ArrayList<>();

        for (int i = 1; i <= number-1; i++){
            if ((number%i == 0)){
                postiveNumbers.add(i);
            }else {
                continue;
            }
        }

        int total = 0;

        for (Integer p: postiveNumbers) {
//            System.out.println("Pozitif bölenler " + p + " ");
            total += p;
        }

        if (total == number){
            System.out.println("Perfect number");
        } else {
            System.out.println("Not perfect number");
        }

    }



}

























