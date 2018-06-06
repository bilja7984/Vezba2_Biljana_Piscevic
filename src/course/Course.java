
package course;

public class Course {
    
    private String name;
    private int numberOfClasses;
    
    public Course(String name, int numberOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;   
    }
    
    public String name() {
        return this.name;
    }
    
    public void name(String name) {
        this.name = name;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
}
