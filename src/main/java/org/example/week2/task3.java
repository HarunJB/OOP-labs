package org.example.week2;
import java.util.Scanner;

public class task3 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers");
        while(true) {
            int number = sc.nextInt();
            sum += number;
            if(number == 0){
                System.out.print("The sum of the entered numbers is: " + sum);
                break;
            }
        }
    }
}
