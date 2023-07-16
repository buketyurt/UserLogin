package org.example;

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        int number = scanner.nextInt();
        boolean minus = false;
        MinusOrPlus(number,minus,number);


    }
    public static void MinusOrPlus(int number, boolean minus , int ExactNumber){
        System.out.print(number + " ");

        if (number > 0 && !minus ) {

            MinusOrPlus(number - 5, minus,ExactNumber);
            System.out.print(number + " ");

        } else if(ExactNumber != number) {
            minus = true;
            MinusOrPlus(number + 5,minus,ExactNumber);
            System.out.print(number + " ");

        }

    }

}
