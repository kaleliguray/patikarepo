/**
 * @author Guray Kaleli,2021
 * @return is number palindrom or not
 */
import java.util.Scanner;
public class PalindromNumber {

    public static boolean isPalindrom(int number){

        int temporaryNumber = number;
        int reverseNumber = 0;
        int modOfNumber=0;

        while(temporaryNumber != 0){
            modOfNumber = temporaryNumber % 10;
            reverseNumber = (reverseNumber * 10) + modOfNumber;
            temporaryNumber /= 10;
        }

        return reverseNumber == number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int userNumber = scanner.nextInt();

        System.out.println("Your number is " + isPalindrom(userNumber));



    }


}






















