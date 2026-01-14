package oopmodeling.gradingsystem;

import java.util.Scanner;
import datastrcture.FlexibleArray;

public class GradeBook {

    protected FlexibleArray<Student> students;
    protected Scanner scanner;

    public GradeBook() {
        students = new FlexibleArray<Student>();
        scanner = new Scanner(System.in);
    }

    public void showStudents() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(String name) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
