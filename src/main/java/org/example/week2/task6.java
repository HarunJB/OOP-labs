package org.example.week2;
import java.util.Scanner;

public class task6 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of iterations: ");
        int number = sc.nextInt();
        for (int i=0; i<number; i++) {
            printText();
        }
    }
    static public void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
