package Methods;

//import java.util.Scanner;

public class PrintStream {
    public static void main(String[] args) {
        printHello(); // ако го закоментираме този ред
     // на конзолата после няма да имаме отпечатано "Hello!" ,
      // защото така става, че никой не го извиква този метод реално
      // и си принтира осттаналите методи без този закоментирания
        printName();
        printGoodbye();

//        Scanner scanner = new Scanner(System.in);
//
//        String line = scanner.nextLine();
//        int num = Integer.parseInt(line);
//        Integer.parseInt("6");
//
//        Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Name: ");

        printSum(3, 9);
        printSum(10, 127548);

        printPlusFive(10);
    }

    public static void printPlusFive(int num){
        int five = 5;

        System.out.println(num + five);
    }

    public static void printSum(int first, int second) {
        System.out.println(first + second);
    }


    // ние го пишем
    public static void printHello() {
        System.out.println("Hello!");
    }


    private static void printName() {
        System.out.println("My name");
    }


    // ние го пишем
    public static void printGoodbye() {
        System.out.println("Goodbye");
    }
}
