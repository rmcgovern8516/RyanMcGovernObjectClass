package RyanMcGovern;

public class Person {
    public String firstName;
    public String familyName;
    public Person(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getFamilyName(){
        return familyName;
    }
    public boolean equals(Person p){
        if((p.getFamilyName().equals(getFamilyName()))&& (p.getFirstName().equals(getFirstName()))){
            return true;
        }
        return false;
    }
}
