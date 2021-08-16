/**
 *
 * @author Guray Kaleli,2021
 *
 * @return create 2 boxers and arrange a fight between them, then declare who wins
 *
 *  Please see the {@link https://app.patika.dev/moduller/java101/pratik-boks}
 *
 *
 **/
package com.boxingMatch;

public class Main {

    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();

    }

}
