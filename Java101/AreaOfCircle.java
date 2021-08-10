/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Calculation Area Of Circle , Perimeter of Circle , area of the circle segment
 * 
 * */

import java.util.*;


public class AreaOfCircle{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int radius;
        double pi = 3.14;
        double angle;

        System.out.print("Enter radius : ");
        radius = scanner.nextInt();

        System.out.print("Enter angle : ");
        angle = scanner.nextDouble();

        double perimeterOfCircle = 2 * pi * radius;

        System.out.println("Perimeter of Circle : " + perimeterOfCircle);

        double areaOfCircle = pi * Math.pow(radius,2);

        System.out.println("Area of Circle : " + areaOfCircle);

        double areaOfCircleSegment = (pi * (radius*radius) * angle)/360;

        System.out.println("Area of the circle segment : " + areaOfCircleSegment);




    }

}