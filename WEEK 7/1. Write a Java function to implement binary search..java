package com.mycompany.binary_search;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted array: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
            int key = sc.nextInt();
            int s = 0;
            int e = n - 1;
            int m;
            while(s <= e){
                m = (s+e)/2;
                if(key == arr[m]){
                    System.out.print("Element found at "+ m);
                }else if(key > arr[m]){
                    s = m + 1;
                }else {
                    e = m - 1;
                }
                if(s > e){
                    System.out.println("Element does not exist.");
                }
            }
        }
    }

