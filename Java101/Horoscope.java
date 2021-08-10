/**
 * 
 * 
 * @author Guray Kaleli, 2021
 * 
 * @return find your zodiac sign 
 * 
 * 
 * 
 * */
 
import java.util.*;

public class Horoscope{

	public static void main(String[] args) {
		
		// get instance of scanner class
		Scanner scanner = new Scanner(System.in);

		// now we get info from user
		System.out.print("Please enter your day : ");
		int day = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Please enter your month : ");
		String month = scanner.nextLine();

		String your_zodiac_sign = "";

		/*
		* Check info based on your input and assign sign to yout_zodiac_sign variable
		*/
		
		if (month.equals("december")){
             
           		 if (day < 22)
           		 your_zodiac_sign = "Sagittarius";
           		 else
            		 your_zodiac_sign ="capricorn";
        
      	  	} else if (month.equals("january")){
            
            		if (day < 20)
            		your_zodiac_sign = "Capricorn";
            		else
            		your_zodiac_sign = "aquarius";
        
        	}else if (month.equals("february")){
            
            		if (day < 19)
            		your_zodiac_sign = "Aquarius";
            		else
            		your_zodiac_sign = "pisces";
        
        	}else if(month.equals("march")){
           
            		if (day < 21)
            		your_zodiac_sign = "Pisces";
            		else
            		your_zodiac_sign = "aries";
        
        	}else if (month.equals("april")){
           
            		if (day < 20)
            		your_zodiac_sign = "Aries";
            		else
            		your_zodiac_sign = "taurus";
        
        	}else if (month.equals("may")){
        
            		if (day < 21)
            		your_zodiac_sign = "Taurus";
            		else
            		your_zodiac_sign = "gemini";
        
        	}else if( month.equals("june")){
            
            		if (day < 21)
            		your_zodiac_sign = "Gemini";
            		else
            		your_zodiac_sign = "cancer";
        
        	}else if (month.equals("july")){
           
            		if (day < 23)
            		your_zodiac_sign = "Cancer";
            		else
            		your_zodiac_sign = "leo";
        
        	}else if( month.equals("august")){
           
            		if (day < 23)
            		your_zodiac_sign = "Leo";
            		else
            		your_zodiac_sign = "virgo";
        
        	}else if (month.equals("september")){
           
            		if (day < 23)
            		your_zodiac_sign = "Virgo";
            		else
            		your_zodiac_sign = "libra";
        
        	}else if (month.equals("october")){
            
            		if (day < 23)
            		your_zodiac_sign = "Libra";
            		else
            		your_zodiac_sign = "scorpio";
        
        	}else if (month.equals("november")){
        
            		if (day < 22)
            		your_zodiac_sign = "scorpio";
            		else
            		your_zodiac_sign = "sagittarius";
        
        	} else {

        		System.out.println("Your entry is mismatched!!!");

        	}


        	System.out.println("Your Zodiac Sign : " + your_zodiac_sign);


	}


}