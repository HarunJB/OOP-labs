package org.example.week2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number; int sum = 0;
        while(counter < 3){
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            sum += number;
            counter++;
            if(counter == 3){
                System.out.print("The sum of the 3 numbers is: " + sum);
            }
        }
    }
}
