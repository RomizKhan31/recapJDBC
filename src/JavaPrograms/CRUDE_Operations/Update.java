package JavaPrograms.CRUDE_Operations;

import JavaPrograms.CRUD;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD crud = new CRUD();

        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        crud.UpdateStudent(id, newName);
        System.out.println("Updated successfully.");
    }
}

