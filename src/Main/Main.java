
package Main;

import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {
        
        Student student1 = new Student("Biljana", "Piscevic", 1984);
        Student student2 = new Student("Milomir", "Dragovic", 1988);
        Course qa = new Course("QA", 44);
        Course html = new Course("HTML", 44);
        Course php = new Course("PHP", 55);
        
        student1.setCourse(qa);
        student1.info();
        
        student1.setCourse(html);
        student1.info();
        
        student2.setCourse(php);
        student2.info();
       
    }
    
}
