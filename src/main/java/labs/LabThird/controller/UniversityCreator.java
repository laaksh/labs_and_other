package labs.LabThird.controller;

import labs.LabThird.model.Faculty;
import labs.LabThird.model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityCreator {
    private static Scanner scanner;

    public UniversityCreator (Scanner scanner){
        UniversityCreator.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        UniversityCreator.scanner = scanner;
    }

    private String getUniversityName(){
        System.out.println("Enter university name");
        return scanner.nextLine();
    }

    private int getUniversityAge(){
        System.out.println("Enter university age");
        return scanner.nextInt();
    }

    private int getNumberOfFaculties(){
        System.out.println("Enter number of faculties");
        return  scanner.nextInt();
    }
    public University createUniversity(){
        return new University(getUniversityName(),getUniversityAge(), getUniversityFaculties());
    }
    private List<Faculty> getUniversityFaculties() {
        List<Faculty> f = new ArrayList<>();
        FacultyCreator c = new FacultyCreator(scanner);
        int facultyCount = getNumberOfFaculties();
        for (int i = 0; i < facultyCount; i++) {
            f.add(i, c.createFaculty());
        }
        return f;
    }

}
