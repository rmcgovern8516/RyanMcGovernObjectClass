package RyanMcGovern;

import jdk.internal.dynalink.beans.StaticClass;

public class Runner {

    public static Iterable<? extends Student> Students;
    public static Iterable<? extends Teacher> Teachers;
    public static Iterable<? extends Person> Person;

    public static void Students(){
        Student s1 = new Student("Bob", "Bob", "Mr.Levin", "BTHS", 3.2);
        Student s2 = new Student("Sam", "Robertson", "Mr.Levin", "BTHS",2.7);
        Person [] Students = {s1, s2};
    }

    public static void Teachers(){
        Teacher t1= new Teacher("Nathan", "Fowell", "Compsci", "Mr.");
        Teacher t2 = new Teacher("Eddie","Wilson","Math","Mr.");
        Teacher[] teachers = {t1,t2};
    }


    public static void main(String[] args) {
        // write your code here
        Person Bob = new Person("Bob", "Larry");
        Person p = new Person("Bob","Larry");
        System.out.println(Bob.equals(p));
        for (Student p : Students) {
            System.out.println(p);
            System.out.println("My first name is " + p.getFirstName());
            System.out.println("My family name is " + p.getFamilyName());
            System.out.println("My GPA name is " + p.getGPA());
            //System.out.println("Is my family name the same as my first name? " + p.equals());
        }
        Runner.Teachers();
        for (Teacher t : Teachers) {
            System.out.println(t);
            System.out.println("This teacher is "+t.getTitle());

        }
    }
    public static void randomStudent() {
        String firstNames[] = {"Abe", "Babe", "Cabe", "Dabe", "Fabe", "Gabe", "Habe", "Labe"};
        String lastNames[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Grey", "Black"};
        int a = (int) (Math.random() * 8);
        int b = (int) (Math.random() * 8);
        double g = Math.random() * 4;
        Student stud = new Student(firstNames[a], lastNames[b], g);
    }
}