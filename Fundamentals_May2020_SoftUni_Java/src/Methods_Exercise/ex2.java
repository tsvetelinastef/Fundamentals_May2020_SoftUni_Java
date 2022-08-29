package Methods_Exercise;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printVowels(text);
    }

    private static void printVowels(String word) {
        int count = 0 ;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == 'A' || ch== 'E' || ch== 'I'|| ch == 'O' || ch == 'U' ) {
                count++;
            }
        }

        System.out.println(count);

    }


}
