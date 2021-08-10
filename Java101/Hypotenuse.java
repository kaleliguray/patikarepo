/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return calculate Hypotenuse 
 * 
 * */

import java.util.*;

public class Hypotenuse{

    public static void main(String[] args) {

        // identify our Scanner class and take referans from it
        Scanner scanner = new Scanner(System.in);
        
        // create out variables
        int x,y,z;
        double hypotenuse;

        double perimeterOfTriangle;
        double areaOfTriangle;
        double temp;


        System.out.print("First side : " );
        x = scanner.nextInt();

        System.out.print("Second side : " );
        y = scanner.nextInt();

        System.out.print("Third side : " );
        z = scanner.nextInt();

        // using Math library --> pow = x^2,y^2 / sqrd --> √z
        hypotenuse = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        System.out.println("Hypotenuse : " + hypotenuse);

        temp = (float)(x + y + z) / 2;

        perimeterOfTriangle = 2*temp;

        System.out.println("Perimeter Of Triangle : " + perimeterOfTriangle);

        areaOfTriangle = Math.sqrt(temp*(temp-x)*(temp-y)*(temp-z));

        System.out.println("Area of Triangle : " + areaOfTriangle);



    }

}
