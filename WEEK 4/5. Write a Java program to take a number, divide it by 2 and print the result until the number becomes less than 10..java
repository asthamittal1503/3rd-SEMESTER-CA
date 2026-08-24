package com.mycompany.division;

import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextDouble();
        while(n >10){
            n = n/2;
        System.out.println(n);
        }
    }
}
