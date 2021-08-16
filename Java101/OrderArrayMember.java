import java.util.Scanner;

public class OrderArrayMember {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Limit : ");
        int arrayLimit = scanner.nextInt();
        int[] arrays = new int[arrayLimit];
        int tempValue;

        for (int i=0; i < arrays.length; i++){
            System.out.print((i+1)+". eleman : ");
            arrays[i] = scanner.nextInt();
        }

        for (int i=0; i < arrays.length-1; i++){
            for (int j=i+1; j<arrays.length;j++){
                if (arrays[j] < arrays[i]){
                    tempValue = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = tempValue;

                }
            }
        }

        for (int i:arrays) {
            System.out.print(" " + i);
        }

    }

}
