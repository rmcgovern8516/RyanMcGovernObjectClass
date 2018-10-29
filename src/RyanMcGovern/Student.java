package RyanMcGovern;

import java.security.PublicKey;

public class Student extends Person{
    private String favTeach;
    private String school;
    private double GPA;
    public Student (String firstName, String familyName, String favTeach, String school, double GPA){
        super(firstName, familyName);
        this.favTeach = favTeach;
        this.school = school;
        this.GPA = GPA;
    }
    public String getFavTeach(){
        return favTeach;
    }
    public String getSchool(){
        return school;
    }

    public String toString(){
        return familyName +","+firstName;
    }
    public double getGPA(){
        return GPA;
    }
}
