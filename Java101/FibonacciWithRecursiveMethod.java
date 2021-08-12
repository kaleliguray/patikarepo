import java.util.Scanner;

public class FibonacciWithRecursiveMethod {

    public static int fibonacci(int number){

        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userNumber = scanner.nextInt();

        System.out.println("Fibonacci number : " + fibonacci(userNumber));

    }




}





















