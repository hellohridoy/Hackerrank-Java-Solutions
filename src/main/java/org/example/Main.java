package org.example;

import java.util.Scanner;

public class HackerrankIfelseSolutions {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       for (int i = 0; i < 1; i++) {
           if (n % 2 == 1) {
              System.out.println(" Weird");
              break;
           }
           if (n>3 && n<=5) {
               System.out.println("Not Weird");
               continue;
           }
           if (n>=6 && n<=20) {
               System.out.println("Weird");
           }
           if (n>20 && n<=100 && n%2==0) {
               System.out.println("Not Weird");
           }
       }

    }
}
