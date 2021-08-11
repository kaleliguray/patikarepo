/**
 *
 * @author Guray Kaleli,2021
 *
 * @return EBOB and EKOK
 *
 * */
import java.util.Scanner;

public class EBOBAndEKOK {

    public static int ebob(int firstNumber, int secondNumber){
        int max;

        if (firstNumber > secondNumber){
            max = firstNumber;
        }else {
            max = secondNumber;
        }

        int i=max;

        while (i >= 1){
            i--;
            if ((firstNumber % i == 0) && (secondNumber % i == 0)){
//                System.out.println("EBOB : " + i);
                break;
            }
        }

        return i;
    }

    public static void ekok(int firstNumber, int secondNumber){
        System.out.println("Ekok : " + (firstNumber*secondNumber)/ebob(firstNumber,secondNumber));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = scanner.nextInt();

        System.out.print("Enter second number : ");
        int second = scanner.nextInt();

        System.out.println("Ebob : " + ebob(first,second));

        int ekok = (first*second)/ebob(first,second);

        System.out.println("ekok : " + ekok);

    }


}




















