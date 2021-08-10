/**
 * @author Guray Kaleli, 24/06/2021
 * 
 * @return input the students' points of course and determine their points according to our control 
 * 
 * */
import java.util.Scanner;

public class OrtNotHesap{

	public static void main(String[] args) {

		// identify our Scanner class and take referans from it
		Scanner scanner = new Scanner(System.in);
		
		// maked up our variables
		int math,physic,chemistry,turkish,history,music;

		System.out.print("Math Point : ");
		math = scanner.nextInt();

		System.out.print("Physic Point : ");
		physic = scanner.nextInt();

		System.out.print("Chemistry Point : ");
		chemistry = scanner.nextInt();

		System.out.print("Turkish Point : ");
		turkish = scanner.nextInt();

		System.out.print("History Point : ");
		history = scanner.nextInt();

		System.out.print("Music Point : ");
		music = scanner.nextInt();

		
		int total = math + physic + chemistry + turkish + history + music;

		double averageOfPoints = total / (float)6;

		System.out.println("Average of points : " + averageOfPoints);

		System.out.println((averageOfPoints>60) ? "Student passed." : "Student failed.");

	}

}