package labs.LabThird.model;

import java.util.List;
import java.util.Objects;


public class Department {
    private String departmentName;
    private int departmentRate;
    private List<Group> group;

    public Department(String departmentName, int departmentRate, List<Group> group) {
        this.departmentName = departmentName;
        this.departmentRate = departmentRate;
        this.group = group;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentRate() {
        return departmentRate;
    }

    public void setDepartmentRate(int departmentRate) {
        this.departmentRate = departmentRate;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return  "Department name'" + departmentName + '\''+
                "Department rate: " + departmentRate +"\n\t\t\t\t\t\t\t"+
                "Group " + group+"\n\t\t\t\t\t\t\t " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentRate == that.departmentRate &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentRate, group);
    }
}
