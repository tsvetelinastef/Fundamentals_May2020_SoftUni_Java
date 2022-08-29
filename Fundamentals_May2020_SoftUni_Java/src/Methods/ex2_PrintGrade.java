package Methods;

import java.util.Scanner;

public class ex2_PrintGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);


    }

    private static void printGrade(double grade) {
        String gradeName = "Fail";
     //   String gradeName = " "; ---> втори начин

     //   if (grade >= 2 && grade < 3){  и това се добавя
     //       gradeName = "Fail";
     //   }

        if (grade >= 3 && grade < 3.5){
            gradeName = "Poor";
        } else if (grade >= 3.5 && grade< 4.5){
            gradeName = "Good";
        } else if (grade >= 4.5 && grade < 5.5){
            gradeName= "Very good";
        } else if (grade >= 5.5 && grade < 6){
            gradeName = "Excellent";
        }

        System.out.println(gradeName);
    }
}
