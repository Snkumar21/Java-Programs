// Single Inheritance program of displaying values of a student.
class person {
    
    String name;
    int mobileno;

    void acceptdata(String name1,int mobile){
        name = name1;
        mobileno = mobile;
    }

    void displaydata(){
        System.out.println("Name= "+name+" Mobile No= "+mobileno);
    }
}

class student extends person{
    
    int rollno;
    String classname;
    double percentage;
    
    void acceptstudent(int rno,String cl,double per){
        rollno=rno;
        classname=cl;
        percentage=per;
    }

    void display(){
        displaydata();
        System.out.println("Roll no= "+rollno+" Class Name "+classname+" Percentage= "+percentage);
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        
        person p = new person();
        student s = new student();
        
        s.acceptdata("ABC", 999);
        s.displaydata();
        s.acceptstudent(11, "FY", 90);
        s.display();
        p.acceptdata("PQR", 789);
        p.displaydata();
    
    }
}