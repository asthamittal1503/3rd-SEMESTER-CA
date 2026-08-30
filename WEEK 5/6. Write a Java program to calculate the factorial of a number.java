package com.mycompany.factorial;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int factorial = 1;
        
        for(int i = 1;i <= n;i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+ n + " = "+ factorial);       
    }
}
