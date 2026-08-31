package com.mycompany.linear_search;

import java.util.Scanner;
public class Linear_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){ 
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the elements to search: ");
        int key = sc.nextInt();
        int position = -1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                position = i;
                break;
            }
        }
        if(position != -1){
            System.out.println("Element found at position " + (position + 1));
        }else {
            System.out.println("Element not found");
        }
    }
}
