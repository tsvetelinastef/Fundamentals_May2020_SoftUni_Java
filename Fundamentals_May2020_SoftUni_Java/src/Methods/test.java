package Methods;

public class test {

    // първо винаги пишем мейна , после под него - другите методи
    public static void main(String[] args) {
        printHello();
        printName();
        printGoodbye();

        /*
        sc + tab

        String line = scanner.nextLine();
        очаквам да ми върне някаква стойност line, каквато съм въвела от клавиатурата

        int num = Integer.parseInt(line);
        връща числената стойност на текста, който съм въвела

         */


        /*

        не може да се дефинира метод в Мейн метода!!
        само името на метода може да се напише

        public static void inside() {

        }

         */
    }

    /*
    безкрайна рекурсия в случая, удри StackOverflowError / Exception

    public static void printHello(){
        System.out.println("Hello!");
        printHello();
    }

     */

    // ние го пишем
    public static void printHello() {
        System.out.println("Hello!");
    }

    // отиваме в мейн и пишем директно името на функцията - в случая printName();
    // и след което импортваме и средата ни създава автоматично
    // допълнителен  метод под мейна - с думата private
    // а в тялото/ между къдравите скоби пишем какво искаме да
    // направи - а именно да принтира
    private static void printName() {
        System.out.println("My name");
    }


    // ние го пишем
    public static void printGoodbye() {
        System.out.println("Goodbye");
    }
}

/*

не му е работата тук!
Нито преди класа , нито след класа!!
може нещо различно от метод , но не и метод!


public static void print() {

}

 */