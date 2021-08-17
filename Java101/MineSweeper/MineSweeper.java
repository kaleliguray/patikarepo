package com.mineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int rowNumber,columnNumber,size;
    int[][] map;
    int[][] board;
    boolean checkGame = true;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
        this.size = rowNumber * columnNumber;
    }

    public void runGame(){
        int success=0;
        prepareGame();
        int row,column;
        System.out.println("Game has started ... ");
        while (checkGame){
            printBoard(board);
            System.out.println("----------------------");
            printBoard(map);
            System.out.println("----------------------");
            System.out.print("Row number : ");
            row = scanner.nextInt();
            System.out.print("Column number : ");
            column = scanner.nextInt();
            if ((row < 0) || (row > rowNumber)){
                System.out.println("Invalid coordinate!");
                continue;
            }
            if ((column < 0) || (column > columnNumber)){
                System.out.println("Invalid coordinate!");
                continue;
            }
            if (map[row][column] != -1){
                checkMine(row,column);
                success++;
                if (success == (size - (size/4))){
                    System.out.println("You won! You did not step on any mine");
                    checkGame = false;
                }
            }else {
                checkGame = false;
                System.out.println("Game is over!");
            }

        }

    }

    public void prepareGame(){

        int randomRow,randomColm,count=0;

        while (count != (size/4)){

            randomRow = random.nextInt(rowNumber);
            randomColm = random.nextInt(columnNumber);

            if (map[randomRow][randomColm] != -1){
                map[randomRow][randomColm] = -1;
                count++;
            }

        }

    }


    public void printBoard(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] >= 0){
                    System.out.print(" ");
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }



    public void checkMine(int row, int column) {
        if (this.map[row][column] == 0){
            if ((column < this.columnNumber -1) && (this.map[row][column+1] == -1)){
                this.board[row][column]++;
            }
            if ((row < this.rowNumber -1) && (this.map[row+1][column] == -1)){
                this.board[row][column]++;
            }
            if ((row > 0) && (this.map[row-1][column] == -1)){
                this.board[row][column]++;
            }
            if ((column > 0) && (this.map[row][column-1] == -1)){
                this.board[row][column]++;
            }

            if (this.board[row][column] == 0){
                this.board[row][column] = 2;
            }
        }



    }


















}


























