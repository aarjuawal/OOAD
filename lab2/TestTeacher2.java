
package lab2;
import java.util.*;
import lab2.Teacher2;
public class TestTeacher2 {
    
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter teacherID, fullName, email, salary ");
        int teacherID = ob.nextInt();
        ob.nextLine();///to clear buffer before reading
        String fullName = ob.nextLine();
        String email = ob.next();
        double salary = ob.nextDouble();
        ob.nextLine();
        
        
        //Teacher2 t = new Teacher2(teacherID, fullName, email, salary);
        Teacher2 t= new Teacher2();
        t.setTeacherID(teacherID);
        t.setFullName(fullName);
        t.setEmail(email);
        t.setSalary(salary);
        System.out.println("Id:" + t.getTeacherID());
        System.out.println("Fullname:" + t.getFullName());
        System.out.println("Email:" + t.getEmail());
        System.out.println("Salary:" + t.getSalary());
    }
}