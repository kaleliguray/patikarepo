/**
 *
 * @author Guray Kaleli,2021
 *
 * @return Average of numbers divisible by 3 and 4
 *
 * */


import java.util.Scanner;

public class DividedByThreeAndFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your number : ");
        int userNumber = scanner.nextInt();

        int count = 0;
        int total = 0;
        double average = 0D;

        for (int i = 0; i <= userNumber; i++){

            if ((i % 3 == 0) && (i % 4 == 0)){

                total += i;
                count++;
            }

        }

        average = (double)(total/count);

        System.out.println("Average of numbers which can divisible by 3 and 4 : " + (total/count) );

    }

}
