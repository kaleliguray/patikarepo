/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return suggest an activity based on the weather
 * 
 * */
 
import java.util.*;

public class WeatherActivity{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the weather temperature : ");
        int degree = scanner.nextInt();

        if(degree < 5){
            System.out.println("Skiing");
        } else if( degree >= 5 || degree <= 25){

            if (degree <= 15) {
                System.out.println("Cinema");
            }
            if (degree >= 10) {
                System.out.println("Picnic");
            }

        } else {
            System.out.println("Swimming");
        }

    }

}
