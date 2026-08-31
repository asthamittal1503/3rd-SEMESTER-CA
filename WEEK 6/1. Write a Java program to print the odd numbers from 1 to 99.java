package com.mycompany.odd_numbers;

public class Odd_numbers{

    public static void main(String[] args) {
        System.out.println("Odd numbers are: ");
        for(int n = 1; n <= 99; n++){
            if(n%2 != 0){
                System.out.println(n);
            }
        }
    }
}
