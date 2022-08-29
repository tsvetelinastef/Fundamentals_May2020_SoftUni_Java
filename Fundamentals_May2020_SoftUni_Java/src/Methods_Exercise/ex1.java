package Methods_Exercise;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeNumbers(first, second, third);

    }

    private static void printSmallestOfThreeNumbers(int a, int b, int c) { // a = 2 , b= 5, c = 3
        int smallest = a; // a = 2

        if (a > b) {
            smallest = c;  //  smallest = a;
        }

        if (a < b) {
            smallest = b; // smallest = 2  smallest = b;
        }

        if (c > b) {
            smallest = c;
        }

        if (c < b) { // b = 5, c = 3

            smallest = c; // c = 3 , smallest = 2

        }

        System.out.println(smallest); //smallest = 3


    }

}
