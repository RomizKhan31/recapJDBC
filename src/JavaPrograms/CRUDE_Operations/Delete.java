package JavaPrograms.CRUDE_Operations;

import JavaPrograms.CRUD;

import java.util.Scanner;

public class Delete{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD crud = new CRUD();

        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        crud.deleteStudent(id);
        System.out.println("Deleted successfully.");
    }
}
