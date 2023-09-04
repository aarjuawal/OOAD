
package lab4;

import lab4.Address;
import lab4.Student;


public class TestTeacher4 {
    
    public static void main(String[] args) {
        Address studentAddress = new Address("123 Main St", "Cityville", "Stateville");
        Student student = new Student(1, "John Doe", studentAddress);

        student.displayStudentInfo();
    }
}


