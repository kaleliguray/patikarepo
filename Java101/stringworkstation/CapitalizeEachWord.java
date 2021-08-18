package com.stringworkstation;

import java.util.Scanner;

public class CapitalizeEachWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String demo = "welcome to java world";

        demo = " " + demo;

        String tempValue = "";

        for (int i=0; i<demo.length(); i++){

            char c = demo.charAt(i);

            if (c == ' '){

                tempValue = tempValue + c;
                i++;
                c = demo.charAt(i);
                tempValue += Character.toUpperCase(c);

            }else {
                tempValue += c;
            }

        }

        System.out.println(tempValue);



    }

}
