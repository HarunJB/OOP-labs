package org.example.week2;
import java.util.Scanner;

public class task7 {

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the half pyramid: ");
        int numRows = sc.nextInt();

        drawStarsPiramid(numRows);

    }

    static public void drawStarsPiramid(int parameter) {
        for (int i=0; i<parameter; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
