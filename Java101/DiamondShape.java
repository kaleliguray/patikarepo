/**
 * @author Guray Kaleli,2021
 * @return making a diamond shape
 */

import java.util.Scanner;

public class DiamondShape {

    public static void main(String[] args) {

        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int space = number - 1;
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j <= number - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (number - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
