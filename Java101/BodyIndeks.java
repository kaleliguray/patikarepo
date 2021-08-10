/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Body Indeks Calculation
 * 
 * */

import java.util.*;


public class BodyIndeks{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double lenght, weight;

        double boyIndeks;

        System.out.print("Please enter your lenght(m) : ");
        lenght = scanner.nextDouble();

        System.out.print("Please enter your weight(kg) : ");
        weight = scanner.nextDouble();

        boyIndeks = weight / (lenght * lenght);

        System.out.println("Your body ındeks : " + boyIndeks);


    }

}
