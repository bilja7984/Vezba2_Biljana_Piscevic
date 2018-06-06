
package Main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {
        
        Student student1 = new Student("Biljana", "Piscevic", 1984);
        Student student2 = new Student("Milomir", "Dragovic", 1992);
        Course qa = new Course("QA", 44);
        Course html = new Course("HTML", 44);
        Course php = new Course("PHP", 55);
        
        Computer computer1 = new Computer(2.4, 16.0, 500);
        Computer computer2 = new Computer(1.2, 2.4, 250);
        
        student1.setCourse(qa);
        student1.setComputer(computer2);
        student1.info();
        
        student1.setCourse(html);
        student1.info();
        
        student2.setCourse(php);
        student2.setComputer(computer2);
        student2.info();
       
        Student student3 = new Student("Dragan", "Korac", 1978, computer1);
        student3.info();
    }
    
}
