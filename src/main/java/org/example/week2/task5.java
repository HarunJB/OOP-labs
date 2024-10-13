package org.example.week2;
import java.util.Scanner;

public class task5 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to use as the power: ");
        int n = sc.nextInt();
        int power = (int) Math.pow(2,n);
        System.out.print("2 on the power of " + n + " is: " + power);
    }
}
