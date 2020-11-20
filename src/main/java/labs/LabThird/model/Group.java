package labs.LabThird.model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private int groupRate;
    private List<Student> student;

    public Group(String groupName, int groupRate, List<Student> student) {
        this.groupName = groupName;
        this.groupRate = groupRate;
        this.student = student;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupRate() {
        return groupRate;
    }

    public void setGroupRate(int groupRate) {
        this.groupRate = groupRate;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return  "Group name '" + groupName + '\''+
                "Group rate: " + groupRate +"\n\t\t\t\t\t\t\t\t\t"+
                "Student " + student+"\n\t\t\t\t\t\t\t\t " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupRate == group.groupRate &&
                Objects.equals(groupName, group.groupName) &&
                Objects.equals(student, group.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupRate, student);
    }
}
