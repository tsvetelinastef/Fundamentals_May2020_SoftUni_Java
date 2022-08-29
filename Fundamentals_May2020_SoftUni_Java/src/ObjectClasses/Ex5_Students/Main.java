package ObjectClasses.Ex5_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            List<Student> students = new ArrayList<>();
            while (!line.equals("end")){
                // parse student
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];
                int age = Integer.parseInt(parts[2]);
                String city = parts[3];

                Student student = new Student(firstName, lastName, age, city);

                students.add(student);


                line = scanner.nextLine();
            }

            String city = scanner.nextLine();

            // iter --> за да излезне for -a
            for (Student student: students) {
                if (city.equals(student.getCity())){
                    System.out.printf("%s %s is %d years old.%n",
                            student.getFirstName(), student.getLastName(),
                            student.getAge());
                    // print

                }
            }

            // print students from city
        }
    }
