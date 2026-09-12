package com.mycompany.fibonacci_withoutrecursion;
import java.util.Scanner;
public class Fibonacci_WithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c ;
        System.out.println("Fibonacci series: ");
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
