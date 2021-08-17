import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int guessNumber = random.nextInt(100);;
        int userGuess;
        int rightToTry = 10;

        while (rightToTry > 0) {
            System.out.print("Please enter your number(between 0 and 100) : ");
            userGuess = scanner.nextInt();

            if (userGuess > 0 && userGuess < 100) {

                if (guessNumber == userGuess) {

                    System.out.println("Congratulations! Number is : " + guessNumber);
                    break;

                } else if (guessNumber < userGuess) {

                    System.out.println("You need guess a lower number than before");
                    rightToTry -= 2;

                } else {

                    System.out.println("You need guess a bigger number than before");
                    rightToTry -= 2;
                }

                if ( rightToTry == 0) {
                    System.out.println("You didn't find the number!\nNumber is " + guessNumber);
                }

                System.out.println("Your righ to try : " + rightToTry);

            }  else {

                System.out.println("You need to enter a number between 0 and 100");
                rightToTry -= 2;

            }



        }


    }

}
























