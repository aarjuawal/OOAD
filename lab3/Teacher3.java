
package lab3;

/*
lab 3
date: 28th aug 2023
 */

class T1{
    private int teacherID;
    private String fullName, email;
    private Double salary;
    
    T1(int id, String f, String e, double s){
        teacherID=id;
        fullName=f;
        email=e;
        salary=s;
    }

    void showT1(){
        System.out.println("teacherid is "+teacherID);
        System.out.println("Full name is "+fullName);
        System.out.println("email is "+email);
        System.out.println("salary is "+salary);
    }
    void getT1(){
        
    }
    
}
class S1 extends T1{
     int studentID;
    
    S1(int teacherID, String fullName, String email, Double salary, int studentID){
        super(teacherID,fullName,email,salary);
        this.studentID=studentID;
    }
    @Override
    void showT1(){
        super.showT1();
        System.out.println("Student");
    }
}
class C1 extends S1{
    String course;
    C1(int teacherID,String fullName,String email,double salary, int studentID){
        super(teacherID,fullName,email,salary,studentID);
        this.course=course;
    }
    void showT1(){
        super.showT1();
        System.out.println("Course");
    }
    
}

