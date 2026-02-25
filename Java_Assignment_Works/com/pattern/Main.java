// 4. Write a program to print the following patterns
//1
//1 2
//1 2 3
//1 2 3 4

package com.pattern;

import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows:");
        int number = scanner.nextInt();
        for (int row = 1; row <= number; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();   
        }

    }
}