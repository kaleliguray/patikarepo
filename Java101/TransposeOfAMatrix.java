import java.util.Scanner;

public class TransposeOfAMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = scanner.nextInt();
        System.out.print("Enter column : ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter members of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("************************");

        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.print("\n");
        }


    }


}


























