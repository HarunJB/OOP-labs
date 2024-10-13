package org.example.week2;

public class task8 {

    static public void main(String[] args) {
        reverseHalfPiramid();
    }

    static public void reverseHalfPiramid() {
        for(int i=10; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
