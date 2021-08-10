/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Simple Calculation Machine
 * 
 * */
 
import java.util.*;

public class SimpleCalculation{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int firstNum, secondNum, transaction;

        System.out.print("Which transaction do you want to do?\n"
                        +"1 - Addition\n"
                        +"2 - Subtraction\n"
                        +"3 - Multiplication\n"
                        +"4 - Division\n"
                        +":\t");

        transaction = scanner.nextInt();

        System.out.print("First Number : ");
        firstNum = scanner.nextInt();

        System.out.print("Second Number : ");
        secondNum = scanner.nextInt();

        switch(transaction){

            case 1:
                System.out.println("Your result : " + (firstNum + secondNum));
                break;

            case 2:
                System.out.println("Your result : " + (firstNum - secondNum));
                break;    
            
            case 3:
                System.out.println("Your result : " + (firstNum * secondNum));
                break;

            case 4:
                System.out.println("Your result : " + (firstNum / secondNum));
                break;        

            default:
                System.out.println("Sorry! There is a mistake. Please try again!");        

        }


    }

}
