/**
 *
 * @author Guray Kaleli,2021
 *
 * @return calculate armstrong number
 *
 * */

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int digitValue;
        int digitNumber = 0;
        int exponentialNumber;
        int total = 0;

        while ( tempNumber != 0){

            tempNumber = tempNumber / 10;
            digitNumber++;

        }


        tempNumber = number;

        while ( tempNumber != 0 ){

            digitValue = tempNumber % 10;

            exponentialNumber = 1;

            for (int i = 0; i < digitNumber; i++){

                exponentialNumber *= digitValue;

            }

            total += exponentialNumber;

            tempNumber = tempNumber / 10;
        }

        if (number == total){
            System.out.println(number + " is an armstrong number");
        }else {
            System.out.println(number + " is not an armstrong number");
        }
    }


}