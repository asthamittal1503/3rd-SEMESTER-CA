package com.mycompany.reverse_string;
import java.util.Scanner;
public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        String n = sc.nextLine();
        String reverse = " ";
        int len = s.length();
        int l = n.length();
        for(int i =0; i <= (len - 1); i++){
            reverse = s.charAt(i) + reverse;
        } 
        for(int j =0; j <= (l - 1); j++){
            reverse = n.charAt(j) + reverse;
        }
        System.out.println("Reverse String = " + reverse);
    }
}
