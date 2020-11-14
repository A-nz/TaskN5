package ru.vsu.cs.n16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int s = readInteger("s");
        drawFigure(checkSize(s));
    }

    private static int checkSize(int s) {
        while (s < 2) {
            System.out.println("The value is less than 2. Enter next value");
            s = readInteger("s");
        }
        return s;
    }

    private static int readInteger(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s:", name);
        return scanner.nextInt();
    }

    private static int drawFigure(int s) {

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j || j == s - 1 - i) {
                    System.out.print("*");
                } else if (j == 0 || j == s - 1) {
                    System.out.print("|");
                } else if (i == 0 || i == s - 1) {
                    System.out.print("-");
                } else if (j > i && j < s - 1 - i) {
                    System.out.print("-");
                } else if (i < s - j) {
                    System.out.print("|");
                } else if (i < j) {
                    System.out.print("|");
                } else if (i > j) {
                    System.out.print("-");
                }
            }
            System.out.println(" ");
        }
        return s;
    }
}










