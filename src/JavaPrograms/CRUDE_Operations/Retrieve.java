package JavaPrograms.CRUDE_Operations;

import JavaPrograms.CRUD;
import JavaPrograms.Student;

import java.util.List;

public class Retrieve{
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        List<Student> students = crud.ReadFromDB();

        if (students != null && !students.isEmpty()) {
            System.out.println("ID\tName");
            for (Student s : students) {
                System.out.println(s.getId() + "\t" + s.getName());
            }
        } else {
            System.out.println("No student data found.");
        }
    }
}
