package ObjectClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class ex3_BigFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


       // BigInteger factorial = new BigInteger(String.valueOf(1));
        BigInteger factorial = new BigInteger("1");

         // factorial
        for (int i = 1; i <= n ; i++) {

          factorial = factorial.multiply(BigInteger.valueOf(i));
            // factorial =  factorial * i

        }

        System.out.println(factorial);

    }
}
