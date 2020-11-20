package labs.LabThird.controller;

import labs.LabThird.model.Department;
import labs.LabThird.model.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentCreator {
    private Scanner scanner;

    public DepartmentCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getDepartmentName() {
        System.out.println("Enter department name");
        return scanner.next();
    }

    private int getDepartmentRate(){
        System.out.println("Enter department rate");
        return scanner.nextInt();
    }

    private int getNumberOfGroups() {
        System.out.println("Enter number of groups");
        return scanner.nextInt();

    }

    public Department createDepartment() {
        return new Department(getDepartmentName(), getDepartmentRate(), getDepartmentGroups());
    }

    private List<Group> getDepartmentGroups() {
        List<Group> g = new ArrayList<>();
        GroupCreator c = new GroupCreator(scanner);
        int groupsCount = getNumberOfGroups();
        for (int i = 0; i < groupsCount; i++) {
            g.add(i, c.createGroup());
        }
        return g;
    }
}
