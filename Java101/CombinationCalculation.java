/**
 *
 * @author Guray Kaleli,2021
 *
 * @return factorial and combination calculation
 *
 * */

import java.util.Scanner;

public class CombinationCalculation {

    public static int factorial(int number){
        int fac = 1;
        for (int i = 1; i<=number; i++){
            fac *= i;
        }
        return fac;
    }

    public static double combunation(int num1, int num2){

          return (double)(factorial(num1) / (factorial(num2) * (factorial((num1-num2)))));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Combination calculation : " + combunation(firstNumber,secondNumber));

    }

}