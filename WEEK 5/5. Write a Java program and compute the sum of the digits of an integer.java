package com.mycompany.sum_digits;
import java.util.Scanner;
public class Sum_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        
        while(n>0){
            int r = n%10;
            n = n/10;
            sum = sum + r;
        System.out.println("Sum of the digits = " + sum);
        }
    }
}
