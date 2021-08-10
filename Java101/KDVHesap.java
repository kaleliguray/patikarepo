/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return calculate KDV and print output 
 * 
 * */

import java.util.Scanner;

public class KDVHesap{
	
	public static void main(String[] args) {
		
		// identify our Scanner class and take referans from it
		Scanner scanner = new Scanner(System.in);
		
		// make up our variables
		double price,kdvRate,priceWithKdv,amountOfKdv;

		System.out.print("Please enter price: ");
		price = scanner.nextDouble();
		
		System.out.println("Price without KDV : " + price);

		if (0<price && price<1000) {

			kdvRate=0.18;
			priceWithKdv = price*kdvRate + price;
			System.out.println("Price with KDV : " + priceWithKdv);
			System.out .println("Amount Of KDV : " + kdvRate);

		}else {

			kdvRate=0.08;
			priceWithKdv = price*kdvRate + price;
			System.out.println("Price with KDV : " + priceWithKdv);
			System.out .println("Amount Of KDV : " + kdvRate);

		}

		



	}


}