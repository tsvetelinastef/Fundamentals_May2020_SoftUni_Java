package ObjectClasses;

import java.util.Random;

public class Dice {
    private int sides; // добра практика е да се пише private!!!!!!!

    // с думата private полето става видимо само в рамките на класа
    // и извън него не може да го достъпим веднага в класа Demo1 ни
    // излизат в червено променливите sides и ми изписва, че sides
    // има private access - достъп
    // докато с public
    // public int sides; такъв проблем няма и нещато ни в Demo1 са си ОК

    // в случая си го правя private и си го контролирам с get, set, add


  //  public Dice() {  }


    public Dice(int sides){
        this.sides = sides;
    }

    public int getSides() {  // в Demo1 имам достъп до getSides
        return this.sides;   // get --> ако искаме да достъпваме!!!!
    }

    public void setSides(int side) {  // set--> ако искаме да променяме !!!
        this.sides = side;
    }

    public int roll(){
        Random rand = new Random();

       return rand.nextInt(this.sides) + 1; // [0, sides - 1] + 1
    }
}
