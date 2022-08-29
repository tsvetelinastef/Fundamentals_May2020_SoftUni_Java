package Methods;

import java.util.Scanner;

public class ex1_PrintSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printSign(num);

    }

    public static void printSign(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}

/*
    public static void printSign(int number) {
        String sign = "zero";
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        }

        System.out.printf("The number %d is %s.", number, sign);
    }
 */
