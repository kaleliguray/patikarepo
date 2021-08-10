/**
 *
 * @author Guray Kaleli,2021
 *
 * @return count even number and multiple of 4 until user enter an odd number
 *
 * */

import java.util.Scanner;

public class EvenNumberAndMultipleOfFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;
        boolean odd = false;
        int total = 0;

        while (!odd){
            System.out.println("Enter a number : ");
            userNumber = scanner.nextInt();

            if ((userNumber % 2 == 0) && (userNumber % 4 == 0)){
                total += userNumber;
                odd = false;
            }else{
                odd = true;
            }

        }

        System.out.println("Total : " + total);

    }

}