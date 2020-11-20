package labs.LabThird.controller;

import labs.LabThird.model.Department;
import labs.LabThird.model.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacultyCreator {
    private Scanner scanner;

    public FacultyCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getFacultyName(){
        System.out.println("Enter faculty name");
        return scanner.next();
    }

    private int getFacultyRate(){
        System.out.println("Enter faculty rate");
        return scanner.nextInt();
    }

    private int getNumberOfDepartments(){
        System.out.println("Enter number of departments");
        return scanner.nextInt();
    }
    public Faculty createFaculty(){
        return new Faculty(getFacultyName(),getFacultyRate(), getFacultyDepartments());
    }
    private List<Department> getFacultyDepartments(){
        List<Department> d = new ArrayList<>();
        int departmentCount = getNumberOfDepartments();
        DepartmentCreator c = new DepartmentCreator(scanner);
        for (int i = 0; i < departmentCount; i++) {
            d.add(i, c.createDepartment());
        }
        return d;
    }
}
