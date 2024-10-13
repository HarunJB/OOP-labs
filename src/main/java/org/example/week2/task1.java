package org.example.week2;
import java.util.Scanner;

public class task1 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "carrot";
        String guess = "";
        while(guess != password){
            System.out.println("Enter password: ");
            guess = sc.nextLine();
            if(guess.equals(password)){
                System.out.println("Right!!!      Secret is 'Karaboga'");
                break;
            }
        }
    }
}
