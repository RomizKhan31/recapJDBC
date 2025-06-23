package JavaPrograms.CRUDE_Operations;

import JavaPrograms.CRUD;
import JavaPrograms.Student;

import java.util.List;
import java.util.Scanner;

public class Searching{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD crud = new CRUD();

        System.out.print("Enter name to search: ");
        String keyword = sc.nextLine();

        List<Student> results = crud.searchStudentByName(keyword);

        if (results != null && !results.isEmpty()) {
            System.out.println("Search Results:");
            System.out.println("ID\tName");
            for (Student s : results) {
                System.out.println(s.getId() + "\t" + s.getName());
            }
        } else {
            System.out.println("No student found matching the name.");
        }
    }
}
