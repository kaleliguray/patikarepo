/**
 *
 * @author Guray Kaleli,2021
 *
 * @return calculating exponent of a number
 *
 * */
import java.util.Scanner;
public class ExponentialNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int userNumber = scanner.nextInt();

        System.out.print("Enter exponential number : ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= userNumber;
        }

        System.out.println("Result : " + result);



    }

}