/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return program to sort numbers from biggest to smaller
 * 
 * */

import java.util.*;
 

public class SortNumber{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("First number : ");
        num1 = scanner.nextInt();

        System.out.print("Second number : ");
        num2  = scanner.nextInt();

        System.out.print("Third number : ");
        num3 = scanner.nextInt();

        if (num1 < num2) {
            
            if (num2 < num3) {
                
                System.out.println(num1 + " < " + num2 + " < " + num3);
            }else{

                System.out.println(num1 + " < " + num3 + " < " + num2);
            }

        } else if (num2 < num3) {
            
            System.out.println(num2 + " < " + num3 + " < " + num1);

        }else {

           System.out.println(num3 + " < " + num2 + " < " + num1);
        }

        


        





    }

}
