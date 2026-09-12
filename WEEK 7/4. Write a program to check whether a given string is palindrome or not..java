package com.mycompany.palindrome_string;
import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        String reverse = "";
        int len = s.length();
        for(int i =0; i <= (len - 1); i++){
            reverse = s.charAt(i) + reverse;
        }
        if(s.equals(reverse)){
        System.out.println("Palindrome");
        }else{
        System.out.println("Not a Palindrome ");
        }
    }    
}
