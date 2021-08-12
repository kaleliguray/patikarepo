import java.util.Scanner;

public class FibonnaciNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter limit : ");
        int limitOfloop = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1;
        int thirdNumber;

        System.out.print(firstNumber + " " + secondNumber);
        for (int i = 2; i <= limitOfloop; i++){
            thirdNumber = firstNumber + secondNumber;
            System.out.print(" " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

    }

}
