/**
 *
 * @author Guray Kaleli,2021
 *
 * @return count multiples of 4 and 5
 *
 * */
import java.util.Scanner;

public class MultipleOfFourAndFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Set a limit number : ");
        int userNumber = scanner.nextInt();

        System.out.println("Multiple of 4");
        for (int i = 1; i < userNumber; i *=4){
            System.out.println(i);
        }

        System.out.println("Multiple of 5");
        for (int i = 1; i < userNumber; i *=5){
            System.out.println(i);
        }



    }

}