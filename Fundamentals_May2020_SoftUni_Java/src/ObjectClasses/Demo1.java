package ObjectClasses;

public class Demo1 {

    public static void main(String[] args) {
/*
        Dice dice = new Dice();

        System.out.println(dice.sides);
        dice.sides = 6;
        System.out.println(dice.sides);

 */
       // Dice d1 = new Dice();
        Dice dice = new Dice(20);
        Dice d2 = new Dice(10);

        System.out.println(dice.roll());

        System.out.println(dice.getSides());
       // dice.setSides(6);
        dice.setSides(20);
       // System.out.println(dice.getSides());
       // dice.setSides(7);
        d2.setSides(10);

        System.out.println(dice.roll());
        System.out.println(d2.roll());


    }
}
