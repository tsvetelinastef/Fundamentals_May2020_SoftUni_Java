package Methods_Exercise;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            printSymbolsInRange(first, second);
        } else {
            printSymbolsInRange(second, first);
        }
    }

    private static void printSymbolsInRange(char start, char end) {
        for (char i = ++start; i < end; i++) {

            System.out.printf("%c ", i);
        }
    }


}
