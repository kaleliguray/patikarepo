import java.util.Arrays;
import java.util.Scanner;

public class ArrayCloseMaxNumberAndMinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userInput = scanner.nextInt();

        int[] arrays = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(arrays);
        int min=0,max=0;

       for (int i = 0; i < arrays.length; i++){


           if (arrays[i] < userInput) {
               min = arrays[i];
           }
           if (arrays[i] > userInput){
               max = arrays[i];
               break;
           }

       }

        System.out.println("min : " + min);
        System.out.println("max : " + max);


    }


}
