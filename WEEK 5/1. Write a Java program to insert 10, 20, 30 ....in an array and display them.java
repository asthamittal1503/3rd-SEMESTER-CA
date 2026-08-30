 package com.mycompany.w1;
 
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 8;
        for(int i = 0; i < n; i++){
            arr[i] = (i+1)*10;
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]+ " ");

        }
        
    }
    
}
