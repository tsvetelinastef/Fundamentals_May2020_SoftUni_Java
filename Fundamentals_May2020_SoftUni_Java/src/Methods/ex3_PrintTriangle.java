package Methods;

import java.util.Scanner;

public class ex3_PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printLine(num);
    }

    private static void printLine(int num) {
        int counter = 0;
        for (int cow = 1; cow <= num ; cow++) {
            for (int row = 1; row <= counter; row++) {
                System.out.println(row);
            }

            counter++;

            System.out.println();
        }
        for (int cow = 1; cow <= num ; cow++) {
            for (int row = 1; row <= counter; row++) {
                System.out.println(row);
            }

            counter--;

            System.out.println();
        }
    }
}


/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLineNumber = Integer.parseInt(scanner.nextLine());

        printTriangle(1, maxLineNumber);
        //printTriangle(maxLineNumber);
    }

    private static void printTriangle(int start, int end) {
        for (int i = start; i <=end  ; i++) {
            System.out.println(i + " ");
        }

        System.out.println();
    }

    private static void printTriangle(int maxLineNumber) {
        printTopHalf(maxLineNumber);
        printBottomHalf(maxLineNumber - 1);
    }

    private static void printTopHalf(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            printRow(i);
            System.out.println();
        }
    }


    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >= 1; i--) {
            printRow(i);
            System.out.println();
        }
    }

    private static void printRow(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

 */