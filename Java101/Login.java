/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Check Username and Password
 * 
 * */
 
import java.util.*;

public class Login{

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName;
        int password, newPassword;

        System.out.print("Please enter username : ");
        userName = scanner.nextLine();

        System.out.print("Please enter password : ");
        password = scanner.nextInt();

        if(userName.equals("patika") && password == 1234){

            System.out.println("Welcome.....! Your platform!");

        } else if (!userName.equals("patika") || !(password == 1234)) {

            System.out.println("Your password is wrong. Do you want to reset password? (y/n) ");

            char temp = scanner.next().charAt(0);

            if (temp == 'y') {

                System.out.print("Please enter your new password : ");
                newPassword = scanner.nextInt();

                boolean checking = true;

                while(checking){

                    if ((newPassword == password)) {
                        newPassword = 0;
                        System.out.println("Could not create password, please enter another password.");
                        newPassword = scanner.nextInt();

                    } else {

                        System.out.print("Password has been created!");
                        checking = false;

                    }

                }

            } else if (temp == 'n'){

                System.out.println("Goodbye....");

            }


        } else {

            System.out.println("Error! Try next time!");

        }

    }

}