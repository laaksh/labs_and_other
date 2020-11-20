package labs.LabThird.model;

import labs.LabThird.model.Faculty;

import java.util.*;


public class University{
    private String universityName;
    private int universityAge;
    private List<Faculty> faculty ;

    public University(String universityName, int universityAge, List<Faculty> faculty) {
        this.universityName = universityName;
        this.universityAge = universityAge;
        this.faculty = faculty;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getUniversityAge() {
        return universityAge;
    }

    public void setUniversityAge(int universityAge) {
        this.universityAge = universityAge;
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }

    public void setFaculty(List<Faculty> faculty) {
        this.faculty = faculty;
    }



    @Override
    public String toString() {
        return "University name: '" + universityName + '\''+"\n\t\t" +
                "University age: " + universityAge +"\n\t\t\t"+
                "Faculty " + faculty;
    }


    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return universityName.equals(that.universityName) &&
               universityAge == that.universityAge &&
                faculty.equals(that.faculty);
    }

    @Override
    public int hashCode(){
        return Objects.hash(universityName, universityAge, faculty);
    }
}
