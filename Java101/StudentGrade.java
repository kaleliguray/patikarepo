/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return check Student grades and decide whether the student pass
 * 
 * */

import java.util.*;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculating your lectures' points.... ");

        String[] lectures = {"Matematik","Fizik","Türkçe","Kimya","Müzik"};

        int lectureNumb = lectures.length;

        int[] points = new int[lectureNumb];
        double total = 0D;
        double avragePoints = 0D;

        for(int i = 0; i < points.length; i++){
            System.out.print("Enter your " + lectures[i] + " point : " );
            points[i] = scanner.nextInt();
            if (points[i] >= 0 && points[i] <= 100) {
                total = total + points[i];
            }
            
        }

        scanner.close();

        avragePoints =  total / lectureNumb;

        System.out.println("Your average is : " + avragePoints);

        System.out.print("Your grade is : " );

        if(avragePoints>=55)
        {
            System.out.print("Passed!");
        }
        else
        {
            System.out.print("Failed!");
        }

    }

}