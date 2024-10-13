package org.example.week2;
import java.util.Scanner;

public class task4 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber; int secondNumber;
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextInt();
        int generalPurpose = firstNumber;

        if (firstNumber < secondNumber){
        while(generalPurpose < secondNumber) {
            System.out.println(generalPurpose);
            generalPurpose++;
        }}
        else if (firstNumber > secondNumber){
            while(generalPurpose > secondNumber){
                System.out.println(generalPurpose);
                generalPurpose--;
            }
        }
    }
}
