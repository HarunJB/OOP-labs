package org.example.week2;
import java.util.Scanner;
public class task9 {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numOfRows = sc.nextInt();
        drawNumbersPiramid(numOfRows);
    }

    static public void drawNumbersPiramid(int parameter) {

        for(int i=0; i<parameter; i++) {
            for(int j=1; j<=i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
