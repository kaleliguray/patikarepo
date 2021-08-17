import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String userWord = scanner.nextLine();

        String palindorme = "";

        for (int i = userWord.length()-1; i >= 0; i--){

            palindorme += userWord.charAt(i);

        }

        if (palindorme.equals(userWord)){
            System.out.println("Your word is palindrome!\nWord: " + userWord + "\npalindrome: "+palindorme);
        }else {
            System.out.println("Your word is not palindrome!\nWord: " + userWord + "\npalindrome: "+palindorme);
        }

    }


}
