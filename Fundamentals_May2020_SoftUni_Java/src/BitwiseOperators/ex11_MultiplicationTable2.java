package BitwiseOperators;

import java.util.Scanner;

public class ex11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int index = scanner.nextInt();

        do {
            System.out.printf("%d X %d = %d%n", n, index, n * index);
            index++;
        } while (index <= 10);

    }
}

/*
 int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());


        int sum;
        if (numberOne >= numberTwo){  // = wasn't here :)
            for (int i = 1; i <= 10; i++) {
                sum = numberOne * i;
                // System.out.println(sum);
                System.out.printf("%d X %d = %d%n", numberOne, i, sum);
        }

        } if (numberTwo >= 10 ){ // = wasn't here :)
            sum = numberTwo * numberOne;
            System.out.printf("%d X %d = %d%n", numberOne, numberTwo, sum);


        } else if (numberOne <= numberTwo){   // = wasn't here :)
            for (int i = numberTwo;  i <= 10; i++) {

                   sum = numberOne * i;
                   // System.out.println(sum);
                   System.out.printf("%d X %d = %d%n", numberOne, i, sum);

            }

        }
 */
