package com.mycompany.array_sum;

public class Array_Sum {

    public static void main(String[] args) {
        int[] arr  = new int[10];
        int sum = 0;
        for(int i = 0; i < 10;i++){
            arr[i] = i + 1;
            sum = sum + arr[i];
        System.out.println("Sum of array elements = " + sum);
        }
    }
}
