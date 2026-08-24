package com.mycompany.biggest;

public class Biggest {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 7;
        if((a >= b) && (a >= c)){
          System.out.println(a + " is biggest.");   
        }
        else if ((b >= a) && (b >= c)){
          System.out.println(b + " is biggest.");   
        }
        else{
          System.out.println(c + " is biggest.");   
        }     
    }
}
