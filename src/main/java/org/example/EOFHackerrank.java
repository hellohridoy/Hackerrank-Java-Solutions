package org.example;

import java.util.Scanner;

public class EOFHackerrank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int printLineNumber = 1;
        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println(printLineNumber+" "+line);
            printLineNumber++;
        }
    }
}
