package Methods_Exercise;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }

        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String[] tokens = input.split(" "); // tokens разбива входа
            // на някакви елементи --> tokens
            String command = tokens[0];

            switch (command){
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= array.length){
                        System.out.println("Invalid index");
                        // exchange (array, index)
                    }
                    break;
            }
        }


    }



}
