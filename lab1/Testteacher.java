
package lab1;
import java.util.*;
import lab2.Teacher2;
public class Testteacher {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter teacherID, fullName, email, salary ");
        int teacherID = ob.nextInt();
        String fullName = ob.next();
         String email = ob.next();
        double salary = ob.nextDouble();
    
        Teacher2 t = new Teacher2(teacherID, fullName, email, salary);
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