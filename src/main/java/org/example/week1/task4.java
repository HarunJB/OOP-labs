package org.example.week1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("The sum of the 2 integers is: " + (a+b));
    }
}
