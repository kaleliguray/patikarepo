package com.mineSweeper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row,column;
        System.out.println("Welcome to minesweeper....");
        System.out.println("Please enter your board size : ");
        System.out.print("Row number : ");
        row = scanner.nextInt();
        System.out.print("Column number : ");
        column = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,column);
        mineSweeper.runGame();

    }

}

























