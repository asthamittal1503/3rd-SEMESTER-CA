package com.mycompany.swapping_elements;

import java.util.Scanner;
public class Swapping_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){ 
            arr[i] = sc.nextInt();
        }
          
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        
        System.out.println("Array elements after swapping: ");
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
