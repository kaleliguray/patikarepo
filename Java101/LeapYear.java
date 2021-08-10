/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Chinese Zodiac depends on birthday
 * 
 * */
 
 import java.util.*;

 public class LeapYear{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter year : ");
        int year = scanner.nextInt();
        boolean leapYear = false;
 
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
            else
                leapYear = true;
        }
        else
            leapYear = false;
 
        if(leapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }


 }