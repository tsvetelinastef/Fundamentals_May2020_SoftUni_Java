package ObjectClasses;

import java.util.Random;
import java.util.Scanner;

public class ex1_RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rand = new Random(); // тук е по- добре
        for (int i = 0; i < words.length; i++) {
            //Random rand = new Random(); --> работи, но има струпване
            // на думи , не е много ОК , пише се в началото
           // int randomIndex = 0;
            // разбъркан масив, разменям 2та елемента и накрая принтирам

           // rand. --> с обекта ранд има много неща
            int randomIndex = rand.nextInt(words.length);

            // swap i <---> randomIndex
            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
