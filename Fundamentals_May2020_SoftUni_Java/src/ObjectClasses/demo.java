package ObjectClasses;

import java.util.Random;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {


        Random rand = new Random();

        // rand.nextInt() --> най-често използвани
        // rand.nextLong() --> най-често използвани
     //   System.out.println(rand.nextInt(10)); // получаваме стойности в рамките на този интервал 10 граница
        // числата са между 0 и 10

        //System.out.println(rand.nextInt() % 10); // пак числата са между 1 и 10
        //System.out.println(rand.nextInt() % 10);
        //System.out.println(rand.nextInt() % 10);
        //System.out.println(rand.nextInt() % 10);


       // System.out.println(rand.nextInt(15) + 5); // [0, 14] + 5 = [5,19]

        System.out.println(rand.nextInt(10) + 5); // [0, 10] + 5 = [5,15]
        System.out.println(rand.nextInt(10) + 5); // [0, 10] + 5 = [5,15]
        System.out.println(rand.nextInt(10) + 5); // [0, 10] + 5 = [5,15]
        System.out.println(rand.nextInt(10) + 5); // [0, 10] + 5 = [5,15]

        // [min, max]
        // nextInt(max - min + 1) + min
        // [-5,5]
        // nextInt(5 - (-5)) + (-5)

        // разликата между двете nextInt е че едното има граница



    }
}
