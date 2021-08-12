import java.util.Scanner;

public class ExponentialNumberWithRecursiveMethod {

    private static final Scanner scanner = new Scanner(System.in);

    static int exponentialNumber(int number, int pow){

        if (pow == 0){
            return 1;
        } else if(pow == 1){
            return number;
        }else {
            return (number * exponentialNumber(number, pow - 1));
        }

    }

    public static void main(String[] args) {

        System.out.print("Enter your number : ");
        int userNumber = scanner.nextInt();

        System.out.print("Enter exponential number : ");
        int exponent = scanner.nextInt();

        System.out.println("Result : " + exponentialNumber(userNumber,exponent));


    }

}
