
package course;

public class Course {
    
    private String name;
    private int numberOfClasses;
    
    public Course() {
        this.name = "def";
        this.numberOfClasses = 22;   
    }
    
    public Course(String name, int numberOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;   
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
    public void writte(){
        System.out.println("Name of course is " + getName());
        System.out.println("Number of classes is  " + getNumberOfClasses());
        System.out.println();
    }
    
}
