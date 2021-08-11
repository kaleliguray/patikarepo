/**
 *
 * @author Guray Kaleli,2021
 *
 * @return make reverse triangle
 *
 * */
import java.util.Scanner;

public class ReverseTriangle {

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);

        System.out.print("Enter digit number :");
        int number=klavye.nextInt();

        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=2*number-1;k>=(2*i+1);k--){
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
