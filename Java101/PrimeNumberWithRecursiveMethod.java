import java.util.Scanner;

public class PrimeNumberWithRecursiveMethod {

    private static final Scanner scanner = new Scanner(System.in);

    static boolean isPrime(int number, int divisor){

        if (number <= 2){
            return (number == 2) ? true : false;
        }
        if(number % divisor == 0){
            return false;
        }
        if((divisor * divisor) > number){
            return true;
        }

        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {

        System.out.print("Enter your number : ");
        int number = scanner.nextInt();

        if (isPrime(number, 2))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");


    }


}
