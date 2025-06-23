package JavaPrograms.CRUDE_Operations;

import JavaPrograms.CRUD;

import java.util.List;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args)
    {
        System.out.print("Enter Your Name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.print(name);
        CRUD crudOperation = new CRUD();
        crudOperation.InsetDB(name);
        System.out.println("Inserted successfully.");
    }
}

