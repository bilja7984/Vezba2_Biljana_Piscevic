
package student;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;        
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
     public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String firstName) {
        this.lastName = lastName;
    }
    
     public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
     public void info(){
        System.out.println("First name is " + getFirstName());
        System.out.println("Last name is  " + getLastName());
        System.out.println("Year of birth is " + getYearOfBirth());
        System.out.println();
    }
    
}
