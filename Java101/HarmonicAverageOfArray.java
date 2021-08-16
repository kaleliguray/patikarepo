/**
 *
 *
 * @author Guray Kaleli,2021
 *
 * @return take input from user to set string limit, 
 *         and user can input each member of string, 
 *         then we can calculate harmonic string mean
 *
 *
 **/

import java.util.Scanner;

public class HarmonicAverageOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array limit : ");
        int arrayLimitNumber = scanner.nextInt();

        int[] array = new int[arrayLimitNumber];

        int i = 0;

        while (i < arrayLimitNumber){

            System.out.print("enter " + (i+1) +".index member : ");
            array[i] = scanner.nextInt();
            i++;
        }

        double harmonicSerie = 0;

        for (int j = 0; j < array.length; j++){

            harmonicSerie += (double) 1 / array[j];
            System.out.println(harmonicSerie);

        }

        System.out.println("Harmonic array average : " + (harmonicSerie/array.length));

    }

}









