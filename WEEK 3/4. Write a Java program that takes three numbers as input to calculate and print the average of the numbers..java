package com.mycompany.avg;

import java.util.Scanner;
public class Avg {  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        double sum = (num1 + num2 + num3);
        double average = (sum) / 3.0;

        System.out.println("Average = " + average);
      
    }
}
    

