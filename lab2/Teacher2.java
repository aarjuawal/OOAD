//lab1 java fundamentals(oop basics)
//date:2023/08/24
package lab2;

public class Teacher2{
    private int teacherID;
    private String fullName, email;
    private Double salary;
    Teacher2(int id, String f, String e, double s){
        teacherID=id;
        fullName=f;
        email=e;
        salary=s;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Teacher2(int teacherID, String fullName, String email, Double salary) {
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.email = email;
        this.salary = salary;
    }

    public Teacher2 setTeacher(Teacher2 object){
        Teacher2 reference;
        reference=object;
        return object;
    }
   public  Teacher2() {
    
}
}