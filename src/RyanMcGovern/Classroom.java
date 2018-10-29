package RyanMcGovern;

import static RyanMcGovern.Runner.Students;


public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] Students, Teacher t1) { ;
        this.students= Students;
        this.teacher = t1;
    }

    public double classAverage(){
        double aver= 0;
        for (int n=0; n<students.length; n++) {
            aver = aver + Student.getGPA();
            aver = aver / students.length;
        }
        return aver;
    }

    public String getSubject(){
        String sub= "";
        sub= (String) Teacher.getSubject();
        return sub;
    }

    public String printClass(){
        String print= "";
        print= "Teacher: " + teacher + "Class: " ;
        for (int n=0; n<students.length; n++){
            print= print + students[n] + ", ";
        }
        return print;
    }

}