package oopmodeling.gradingsystem;

import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {

        GradeBook book = new GradeBook();
        Scanner scanner = new Scanner(System.in);

        int option;

        
        do {
            System.out.println("\n1. Add student");
            System.out.println("2. Show students");
            System.out.println("3. Remove student");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();

                book.addStudent(new Student(name, grade));
            }
            else if(option == 2) {
                book.showStudents();
            }
            else if(option == 3) {
                System.out.print("Name to remove: ");
                String name = scanner.nextLine();
                if(book.removeStudent(name))
                    System.out.println("Removed.");
                else
                    System.out.println("Student not found.");
            }

        } while(option != 0);

        System.out.println("Program finished.");
    }
}