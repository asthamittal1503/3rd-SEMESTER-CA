package com.mycompany.sorting;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
            int len = arr.length;
        for(int j = 0;j <= len - 2; j++){
           for(int i = 0;i <= len - 2; i++){
               if(arr[i] > arr[i + 1]){
                   int temp = arr[i + 1];
                   arr[i + 1] = arr[i];
                   arr[i] = temp;
               }
           }

        }
            
        System.out.println("Sorted array : ");
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}
