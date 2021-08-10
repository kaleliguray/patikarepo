/**
 * 
 * @author Guray Kaleli,2021
 * 
 * @return Taksimetre hesaplama
 * 
 * */

import java.util.*;

public class Taksimetre{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int km;
        double birimKm = 2.20, toplam, baslangicFiyati = 10;

        System.out.print("Mesafe (km) : ");
        km = scanner.nextInt();

        toplam = km * birimKm;

        toplam += baslangicFiyati;

        System.out.println("Price : "  + (toplam = (toplam < 20) ? 20 : toplam ));


    }

}
