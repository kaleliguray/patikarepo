/**
 *
 * @author Guray Kaleli,2021
 *
 * @return calculate the digit of a number and sum up digits
 *
 * */

import java.util.Scanner;

public class DigitOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userNumber = scanner.nextInt();
        int valueOfDigit = 0;
        int digit = 0;
        int total = 0;

        int temp = userNumber;

        while (temp != 0){

            temp /= 10;

            valueOfDigit++;
        }

        temp = userNumber;

        for (int i = 0; i < valueOfDigit; i++){

            digit = temp % 10;
            temp /= 10;
            total += digit;

        }


        System.out.println("sum up digits of " + userNumber + " is " + total);

    }



}
