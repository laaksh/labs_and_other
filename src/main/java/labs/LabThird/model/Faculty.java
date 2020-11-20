package labs.LabThird.model;

import java.util.List;
import java.util.Objects;


public class Faculty {
    private String facultyName;
    private int facultyRate;
    private List<Department> department;

    public Faculty(String facultyName, int facultyRate, List<Department> department) {
        this.facultyName = facultyName;
        this.facultyRate = facultyRate;
        this.department = department;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getFacultyRate() {
        return facultyRate;
    }

    public void setFacultyRate(int facultyRate) {
        this.facultyRate = facultyRate;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Faculty name:'" + facultyName + '\''+
                "Faculty rate: " + facultyRate +"\n\t\t\t\t\t"+
                "Department " + department +"\n\t\t\t\t\t ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return facultyRate == faculty.facultyRate &&
                Objects.equals(facultyName, faculty.facultyName) &&
                Objects.equals(department, faculty.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, facultyRate, department);
    }
}
