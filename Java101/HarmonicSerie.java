/**
 *
 * @author Guray Kaleli,2021
 *
 * @return find harmonic serie of a number
 *
 * */
import java.util.Scanner;

public class HarmonicSerie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userNumber = scanner.nextInt();

        double harmonicSerie = 0;

        while( userNumber != 0){

            harmonicSerie += (double)1 / userNumber;

            userNumber--;

        }

        System.out.println(harmonicSerie);

    }


}
