package labs.LabThird.controller;

import labs.LabThird.model.Group;
import labs.LabThird.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupCreator {
    private Scanner scanner;

    public GroupCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getGroupName(){
        System.out.println("Enter group name");
        return scanner.next();
    }

    private int getGroupRate(){
        System.out.println("Enter group rate");
        return scanner.nextInt();
    }

    private int getNumberOfStudents(){
        System.out.println("Enter number of students");
        return scanner.nextInt();
    }

    public Group createGroup() {
        return new Group(getGroupName(), getNumberOfStudents(), getGroupStudents());
    }

    private List<Student> getGroupStudents() {
        List<Student> s = new ArrayList<>();
        StudentCreator c = new StudentCreator(scanner);
        int studentCount = getNumberOfStudents();
        for (int i = 0; i < studentCount; i++) {
            s.add(i,  c.createStudent());
        }
        return s;
    }
}
