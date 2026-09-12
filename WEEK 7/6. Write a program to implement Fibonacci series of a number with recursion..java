package com.mycompany.fibonacci_recursion;
import java.util.Scanner;
public class Fibonacci_Recursion {
    static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return (fibonacci(n - 2) + (fibonacci(n - 1)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        for(int i = 0; i < n; i++){
          System.out.print(fibonacci(i) + " ");
        }
    }
}
